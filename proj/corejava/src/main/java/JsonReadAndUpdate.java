import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReadAndUpdate
{
    public static ObjectMapper mapper = null;
    public static JsonNode ab_JObj = getJsonNode("json/ab.json");
    public static JsonNode a_JObj = getJsonNode("json/a.json");

    public static JsonNode getJsonNode(String filePath)
    {
        JsonNode jsonObj = null;
        try
        {
            mapper = new ObjectMapper();
            jsonObj = mapper.readTree(JsonFlieReaderAndEditor.class.getResourceAsStream(filePath));
        }
        catch (Exception e)
        {
            System.err.println("Error while reading file or getting JsonNode:" + e);
        }
        return jsonObj;
    }

    public static void main(String[] args)
    {
        if (ab_JObj.isArray())
        {
            for (JsonNode eachNode : ab_JObj)
            {
                JsonNode configurationsArrayJObj = eachNode.path("configurations");
                for (JsonNode eachConfig : configurationsArrayJObj)
                {
                    System.out.println(eachConfig.path("configName"));
                    test(eachConfig.path("configName").asText(), a_JObj);
                }
            }
        }

    }

    public static boolean test(String configName, JsonNode aJObj)
    {
        if (a_JObj.isArray())
        {
            for (JsonNode eachNode : a_JObj)
            {
                String appNameAsText = eachNode.path("configName").asText();
                if (configName.equals(appNameAsText))
                {
                    System.out.println(configName + ":---:" + appNameAsText);
                    String label = eachNode.path("label").asText();
                    String parantApp = eachNode.path("parentApp").asText();

                    System.out.println("parentApp:" + parantApp);
                    String paranetGrp = getParantGroup(parantApp);
                    return true;
                }
            }
        }
        return false;
    }

    public static String getParantGroup(String parantApp)
    {
        if (a_JObj.isArray())
        {
            for (JsonNode eachNode : a_JObj)
            {
                String applicationNameAsText = eachNode.path("applicationName").asText();
                if (applicationNameAsText.equals(parantApp))
                {
                    System.out.println(applicationNameAsText + ":--applicationName==parantApp---:" + parantApp);
                    String parentGroupAsText = eachNode.path("parentGroup").asText();

                    System.out.println("parentGroup :" + parentGroupAsText);
                    return parentGroupAsText;
                }
            }
        }
        return null;
    }
}
