
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.json.JSONException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFlieReaderAndEditor
{
    public static final String TPG_ARRAY = "TPGArray";

    public static final String TPG = "TPG";
    public static final String TPG_SERVICE_ARRAY = "ServiceArray";

    public static final String TPG_SERVICE_ID = "serviceId";

    public static final String TPG_SERVICE_ENV = "serviceEnv";
    public static final String TPG_SERVICE_NAME = "serviceName";
    public static final String TPG_SERVICE_TYPE = "serviceType";
    public static final String TPG_SERVICE_VERSION = "serviceVersion";
    public static final String TPG_ENTITY_ARRAY = "EntityArray";

    static ObjectMapper mapper = null;

    public static JsonNode getJsonNode(String filePath)
    {
        JsonNode jsonObj = null;
        try
        {
            mapper = new ObjectMapper();
            jsonObj = mapper.readTree(JsonFlieReaderAndEditor.class.getResourceAsStream(filePath));
            jsonObj=mapper.readTree("");
        }
        catch (Exception e)
        {
            System.err.println("Error while reading file or getting JsonNode:" + e);
        }
        return jsonObj;
    }

    public static Map<String, Set<String>> getInterfaceEntityMap(JsonNode jsonNode)
    {
        Map<String, Set<String>> entityMap = new HashMap<>();
        
        JsonNode tpgArrayNode = jsonNode.path(JsonFlieReaderAndEditor.TPG_ARRAY);
        if (tpgArrayNode.isArray())
        {
            for (JsonNode eachNode : tpgArrayNode)
            {
//                System.out.println("---------------------------");
                String tpgName = eachNode.path(JsonFlieReaderAndEditor.TPG).asText();
//                System.out.println(tpgName);
                JsonNode serviceArray = eachNode.path(JsonFlieReaderAndEditor.TPG_SERVICE_ARRAY);
                if (serviceArray.isArray())
                {
                    for (JsonNode eachService : serviceArray)
                    {
                        JsonNode eachServiceNode = eachService.path(JsonFlieReaderAndEditor.TPG_SERVICE_ID);

                        // System.out.println(eachServiceNode.path(Test.TPG_SERVICE_ENV).asText());
                        // System.out.println(eachServiceNode.path(Test.TPG_SERVICE_NAME).asText());
                        // System.out.println(eachServiceNode.path(Test.TPG_SERVICE_TYPE).asText());
                        // System.out.println(eachServiceNode.path(Test.TPG_SERVICE_VERSION).asText());
                        Set<String> entitySet = new HashSet<>();
                        JsonNode entityArrayNode = eachServiceNode.path(JsonFlieReaderAndEditor.TPG_ENTITY_ARRAY);
                        if (entityArrayNode.isArray())
                        {
                            for (JsonNode eachEntity : entityArrayNode)
                            {
                                entitySet.add(eachEntity.asText());
                            }
                        }
                        System.out.println(eachServiceNode.path(JsonFlieReaderAndEditor.TPG_SERVICE_NAME).asText()+" count:"+entitySet.size());
                        entityMap.put(eachServiceNode.path(JsonFlieReaderAndEditor.TPG_SERVICE_NAME).asText(), entitySet);
                    }
                }

            }
        }
        return entityMap;
    }

    public static Map<String,Set<String>> getCustomInterfaceEntityMap(String filePath) throws IOException
    {
        Map<String,Set<String>> customEntities=new HashMap<>();
        Properties interfaceEntityProp=new Properties();
        interfaceEntityProp.load(JsonFlieReaderAndEditor.class.getResourceAsStream(filePath));
        
        Enumeration<?> enumaration=interfaceEntityProp.keys();
        while(enumaration.hasMoreElements())
        {
            String eachPropKey=(String)enumaration.nextElement();
            String key=eachPropKey;
            String value=interfaceEntityProp.getProperty(eachPropKey);
//            System.out.println("Key="+key);
//            System.out.println("Value="+value);
            HashSet<String> valueSet=new HashSet<>();
            if(interfaceEntityProp.getProperty(eachPropKey).contains(","))
            {
                valueSet.addAll(Arrays.asList(value.split(",")));
            }else
            {
                valueSet.add(value);
            }
            
            if(customEntities.containsKey(key))
            {
                customEntities.get(key).addAll(valueSet);
            }else
            {
                customEntities.put(key, valueSet);
            }
            System.out.println(key+" count :"+valueSet.size());
        }
        return customEntities;
    }
    
    public static Map<String,Set<String>> combineEntityMaps(Map<String,Set<String>> mapOne, Map<String,Set<String>> mapTwo)
    {
        Map<String,Set<String>> mergedMap=new HashMap<>();
        mergedMap.putAll(mapOne);
        
        for(String eachKey:mapTwo.keySet())
        {
            if(mergedMap.containsKey(eachKey))
            {
                mergedMap.get(eachKey).addAll(mapTwo.get(eachKey));
            }else
            {
               mergedMap.put(eachKey, mapTwo.get(eachKey));
            }
        }
        
        for( Map.Entry<String,Set<String>> eachEntry : mergedMap.entrySet())
        {
            System.out.println(eachEntry.getKey()+" count :"+eachEntry.getValue().size());
        }
        return mergedMap;
    }
    public static void main(String[] args) throws JSONException, IOException
    {
        System.out.println(getInterfaceEntityMap(getJsonNode("json/standard.json")));
        System.out.println(getInterfaceEntityMap(getJsonNode("json/custom.json")));
        System.out.println(getCustomInterfaceEntityMap("prop/InterfaceEntity.properties"));
        
        System.out.println(combineEntityMaps(getInterfaceEntityMap(getJsonNode("json/standard.json")), getInterfaceEntityMap(getJsonNode("json/custom.json"))));
    }
}
