import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonChangesTest
{
    public static ObjectMapper mapper = null;
    public static final String ENTITY_ACRONYMS = "EntityAcronyms";
    public static final String FILENAME_DELIMILTER = "_";// "USCORE";
    public static final String TIMESTAMP = "GTIME";
    public static final String BALANCE_BASELINE = "/EDMCustomerBaseline/baseline_balance";

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

    private static void setEntityQualifiers(String tableName, Entry<String, JsonNode> entry)
    {
        JsonNode metaDataRoot = entry.getValue();
        if (tableName.contains("balance"))
        {
            Iterator<Entry<String, JsonNode>> nodeIterator = metaDataRoot.fields();
            while (nodeIterator.hasNext())
            {
                Entry<String, JsonNode> tmpEntry = nodeIterator.next();
                System.out.println("Entity Key---:" + tmpEntry.getKey());
                System.out.println("Entity value ---:" + tmpEntry.getValue().asText());
                System.out.println("Entity value split by ; and oth index ---:" + (tmpEntry.getValue().asText()).split(";")[0]);
                SnapshotConfig.getChaQualifierMap().put(tmpEntry.getKey(), (tmpEntry.getValue().asText()).split(";")[0]);
            }
        }
        else
        {
            Iterator<Entry<String, JsonNode>> nodeIterator = metaDataRoot.fields();
            while (nodeIterator.hasNext())
            {
                Entry<String, JsonNode> tmpEntry = nodeIterator.next();
                SnapshotConfig.getCpmQualifierMap().put(tmpEntry.getKey(), (tmpEntry.getValue().asText()).split(";")[0]);
            }
        }

    }

    private static String getEntityFileName(SnapshotConfig csvConfig, String key, String tableName)
    {
        StringBuilder sb = new StringBuilder(key);
        String[] partitionNo = tableName.split("_");
        sb.append(FILENAME_DELIMILTER).append(csvConfig.getSiteId()).append(FILENAME_DELIMILTER).append(csvConfig.getAppGroup()).append(FILENAME_DELIMILTER).append(SnapshotConfig.getRunDate()).append(FILENAME_DELIMILTER).append(TIMESTAMP).append(FILENAME_DELIMILTER).append(partitionNo[2]);
        return sb.toString();
    }

    public static HashMap<String, String> getAllkeyofSnapshots(SnapshotConfig csvConfig, String tableName)
    {
        JsonNode metaDataRoot = getJsonNode("json/snapshotbalancemetadata.json");
        HashMap<String, String> keysList = new HashMap<>();
        Iterator<Entry<String, JsonNode>> nodeIterator = metaDataRoot.fields();

        String key = null;
        List<String> snapshotKeyList;
        Entry<String, JsonNode> entry = null;
        Iterator<Entry<String, JsonNode>> snapshotIterator = null;
        JsonNode snapshot = null;
        while (nodeIterator.hasNext())
        {
            entry = nodeIterator.next();
            System.out.println("Each Entry----:" + entry);
            System.out.println("Each Key----:" + entry.getKey());
            System.out.println("Each Value----:" + entry.getValue());
            key = entry.getKey();
            if (key.equals(ENTITY_ACRONYMS))
            {
                setEntityQualifiers(tableName, entry);
                continue;
            }

            snapshot = entry.getValue();
            snapshotIterator = snapshot.fields();
            snapshotKeyList = new LinkedList<>();
            Entry<String, JsonNode> snapshotEntry = null;
            String snapShotKey = null;
            String entityFileName = null;

            while (snapshotIterator.hasNext())
            {
                snapshotEntry = snapshotIterator.next();
                System.out.println("----Value fields:" + snapshotEntry);
                snapShotKey = snapshotEntry.getKey();
                if ("tables".equals(snapShotKey) ||
                        "complexStructure".equals(snapShotKey))
                {
                    continue;
                }
                snapshotKeyList.add(snapShotKey);
                entityFileName = getEntityFileName(csvConfig, key, tableName);
                System.out.println("File Name:" + entityFileName);
                keysList.put(entityFileName, StringUtils.join(snapshotKeyList, ','));
            }

        }
        SnapshotConfig.getFileNamesMap().put(tableName, keysList);
        return keysList;
    }

    public static void main(String[] args) throws JsonProcessingException, IOException
    {

//        SnapshotConfig csvConfig = setSnapshotConfig();
//        JsonNode metaDataRoot = getJsonNode("json/snapshotbalancemetadata.json");
//        System.out.println("Read json file and print as JsonNode obj:" + metaDataRoot);
//        System.out.println("JsonNode obj to String:" + metaDataRoot.toString());
//        String parentNode = metaDataRoot.path(ENTITY_ACRONYMS).path("BA").asText();
//        String[] parentTag = parentNode.split(";");
//        System.out.println("Parent Node:" + parentNode);
//        System.out.println("Parent Node[0]:" + parentTag[0]);
//        System.out.println(metaDataRoot.path(parentTag[0]).path("tables"));
//        String tableNameWithPartition = BALANCE_BASELINE + "_1";
//        HashMap<String, String> headersList = getAllkeyofSnapshots(csvConfig, tableNameWithPartition);
//        System.out.println("Map :" + headersList);

        String attrRoot = "{\"table\":\"/EDMCustomerBaseline/baseline_balance\",\"qualifier\":\"RA\",\"sourceId\":\"BillingAccountBucket-billingAccountBucketId\",\"lookupId\":\"billingAccountBucketId\"}";
        String str = "{\"billingAccountBucketId\":\"BE69BDF55CBA4648BF9997B42856A97A\",\"refillAmount\":\"{\\\"number\\\":24,\\\"decimalPlaces\\\":2}\",\"customerId\":\"A7A6A231A9A841C59E42FB0CF4F3CF7E\",\"billingAccountId\":\"22809125FE40460CBDD081758CAC6BC5\",\"refillOperation\":\"SUBTRACT\",\"eventType\":\"ChaRefillEvent\",\"pk\":\"meta-customerId,billingAccountId,billingAccountBucketId\",\"triggerTimestamp\":\"2018-05-02T10:15:20+0200\",\"cq\":\"meta-d:RA\",\"timestamp\":\"2018-05-02T10:15:20+0200\"}";

        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode inputRoot = jsonMapper.readTree(str);
        JsonNode attributeRoot = jsonMapper.readTree(attrRoot);

        Map<String, String> cacheBaseLineTableRoot = new HashMap<>();
        cacheBaseLineTableRoot.put("/EDMCustomerBaseline/baseline_balanceRA", "{\"billingAccountBucketId\":\"BE69BDF55CBA4648BF9997B42856A97A\",\"refillAmount\":\"{\\\"number\\\":24,\\\"decimalPlaces\\\":2}\",\"customerId\":\"A7A6A231A9A841C59E42FB0CF4F3CF7E\",\"billingAccountId\":\"22809125FE40460CBDD081758CAC6BC5\",\"refillOperation\":\"SUBTRACT\",\"eventType\":\"ChaRefillEvent\",\"pk\":\"meta-customerId,billingAccountId,billingAccountBucketId\",\"triggerTimestamp\":\"2018-05-02T10:15:20+0200\",\"cq\":\"meta-d:RA\",\"timestamp\":\"2018-05-02T10:15:20+0200\"}");

        String tableName = attributeRoot.path("table").asText();
        String qualifier = attributeRoot.path("qualifier").asText();
        String resultset = cacheBaseLineTableRoot.get(tableName + qualifier);
//        System.out.println(tableName);
//        System.out.println(qualifier);
//        System.out.println(resultset);

        System.out.println("attributeRoot :"+attributeRoot);
        JsonNode inputRootFromTable1 = jsonMapper.readTree(resultset);
        System.out.println("inputRootFromTable:  " + inputRootFromTable1);
        String sourceMatchingId = attributeRoot.path("sourceId").asText();
        System.out.println("sourceMatchingId:    " + sourceMatchingId);
        String sourceMatchingValue = inputRoot.path(sourceMatchingId).asText();
        System.out.println("sourceMatchingValue: " + sourceMatchingValue);
        String lookupMatchingId = attributeRoot.path("lookupId").asText();
        System.out.println("lookupMatchingId:    " + lookupMatchingId);
        System.out.println("sourceMatchingValue by lookupMatchingId: " + lookupMatchingId);
        JsonNode lookupEntry;
        if (null != inputRootFromTable1)
        {
//            Iterator<Map.Entry<String, JsonNode>> itr = inputRootFromTable1.fields();
//            while (itr.hasNext())
//            {
//                System.out.println(itr.next());
//            }

//            System.out.println("--------------");
//            for (JsonNode each : inputRootFromTable1)
//            {
//                System.out.println(each);
//                if(each.isObject())
//                {
//                    System.out.println("Above is object");
//                }
//            }

            System.out.println("========================");
            if (inputRootFromTable1.isObject())
            {
                Iterator<JsonNode> nodeIterator = inputRootFromTable1.iterator();
                while (nodeIterator.hasNext())
                {
                    lookupEntry = nodeIterator.next();
                    if (lookupEntry.path(lookupMatchingId).asText().equals(sourceMatchingValue))
                    {
                        System.out.println("Object lookupEntry:" + lookupEntry);
                    }
                }
            }
            
            if (inputRootFromTable1.isArray())
            {
                for (JsonNode lookupEntryObj : inputRootFromTable1)
                {
                    if (lookupEntryObj.path(lookupMatchingId).asText().equals(sourceMatchingValue))
                    {
                        System.out.println("Array lookupEntryObj:" + lookupEntryObj);
                    }
                }
            }
        }
    }

    public static SnapshotConfig setSnapshotConfig()
    {
        SnapshotConfig csvConfig = new SnapshotConfig();
        csvConfig.setAppGroup("EDM1");
        csvConfig.setEpshost("zkHost");
        csvConfig.setEpsPort("zkPort");
        String[] pts =
        { "1" };
        csvConfig.setPartitionList(pts);
        csvConfig.setRunDate("2018-01-01");
        csvConfig.setClusterId("clusterID");
        csvConfig.setDataDumpCldbHostlist("cldb_hts");
        csvConfig.setDataDumpCldbPort("cldb_ports");
        csvConfig.setSiteId("sid1");
        csvConfig.setDeltaRun(false);
        return csvConfig;
    }
}
