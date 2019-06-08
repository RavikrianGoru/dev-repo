import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

enum Capability {

    CREATE_NEWSPEC("CREATE_NEWSPEC"),
    CREATE_ABC("CREATE_ABC"),
    CREATE_XYZ("CREATE_XYZ");
    private final String value;
    private final static Map<String, Capability> CONSTANTS = new HashMap<String, Capability>();
    static {
        for (Capability c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }
    private Capability(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
    public String value() {
        return this.value;
    }
    public static Capability fromValue(String value) {
        Capability constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }
}
public class Test
{

    public static void main(String[] args)
    {
       String inputCreeate="Create view dfs.Custom.`DailyChaRefillSummaryView` AS SELECT CAST(DateId as INT) as DateId, CAST(CustomerId AS VARCHAR) as CustomerId, CAST(ContractId AS VARCHAR) as ContractId, CAST(SumOfRequestedRefilAmount AS DOUBLE) as SumOfRequestedRefilAmount, CAST(SumOfRefillAdjustAmt AS DOUBLE) as SumOfRefillAdjustAmt, CAST(UoM AS VARCHAR) as UoM from dfs.Custom.`Transformation/2017/12/20/DailyChaRefillSummary/0_0_0.parquet`";
       String inputCreeateOrReplace="Create or replace view dfs.Custom.`DailyChaRefillSummaryView` AS SELECT CAST(DateId as INT) as DateId, CAST(CustomerId AS VARCHAR) as CustomerId, CAST(ContractId AS VARCHAR) as ContractId, CAST(SumOfRequestedRefilAmount AS DOUBLE) as SumOfRequestedRefilAmount, CAST(SumOfRefillAdjustAmt AS DOUBLE) as SumOfRefillAdjustAmt, CAST(UoM AS VARCHAR) as UoM from dfs.Custom.`Transformation/2017/12/20/DailyChaRefillSummary/0_0_0.parquet`";
       String inputCreeateOrReplaceCaps="CREATE OR REPLCE VIEW dfs.Custom.`DailyChaRefillSummaryView` AS SELECT CAST(DateId as INT) as DateId, CAST(CustomerId AS VARCHAR) as CustomerId, CAST(ContractId AS VARCHAR) as ContractId, CAST(SumOfRequestedRefilAmount AS DOUBLE) as SumOfRequestedRefilAmount, CAST(SumOfRefillAdjustAmt AS DOUBLE) as SumOfRefillAdjustAmt, CAST(UoM AS VARCHAR) as UoM from dfs.Custom.`Transformation/2017/12/20/DailyChaRefillSummary/0_0_0.parquet`";
       String input="CREATE TABLE dfs.Custom.`Transformation/2017/12/20/DailyChaRefillSummary` AS ( select  DateId, CustomerId, ContractId, SUM(RequestedRefilAmount) SumOfRequestedRefilAmount, SUM(RefillAdjustAmt) SumOfRefillAdjustAmt, UoM  from ( select  tb2.DateId as DateId, tb2.CustomerId as CustomerId, tb2.ContractId as ContractId, tb2.RequestedRefilAmount as RequestedRefilAmount, (COALESCE(tb2.RefillProductResultsArray.refillAdjustmentResult.refillAmount.amount.number,0)/ POW(10,COALESCE(tb2.RefillProductResultsArray.refillAdjustmentResult.refillAmount.amount.decimalPlaces,0))) as RefillAdjustAmt, COALESCE(tb2.RefillProductResultsArray.refillAdjustmentResult.refillAmount.unitOfMeasurement,'') as UoM  from ( select    '20171220' as DateId , tb1.customerInformation.customerId CustomerId , tb1.customerInformation.contractId ContractId, (COALESCE(tb1.refillInformation.requestedRefillAmount.amount.number,0)/POW(10,COALESCE(tb1.refillInformation.requestedRefillAmount.amount.decimalPlaces,0))) as RequestedRefilAmount, FLATTEN(tb1.refillResult.refillProductResults.`array`) as RefillProductResultsArray  from dfs.Staging.`Extraction/2017/12/20/ChaRefillEvent/*.parquet` as tb1 ) as tb2 ) as tb3 group by DateId, CustomerId, ContractId, UoM )";
       
       ArrayList<Capability >capabilities=new ArrayList<>();
       capabilities.add(Capability.CREATE_ABC);
       capabilities.add(Capability.CREATE_XYZ);
       System.out.println(capabilities);
       String importUri="/items";
       if(capabilities!=null && !capabilities.isEmpty() && capabilities.contains(Capability.CREATE_NEWSPEC))
           importUri=importUri+"?"+Capability.CREATE_NEWSPEC.toString().toLowerCase();
       System.out.println(importUri);
//       show(input);
    }

    private static void show(String inputCreeate)
    {

        if(inputCreeate.contains("`"))
        { 
            String tildSplits[]=inputCreeate.split("`");
            String storagePluginKeyTemp=tildSplits[0];
            if(storagePluginKeyTemp.contains("."))
            {
                String storagePluginKey=storagePluginKeyTemp.split("\\.")[1];
                String viewOrTableName=tildSplits[1];
                System.out.println(storagePluginKey);
                System.out.println(viewOrTableName);
                System.out.println("====================");
            }
        }
        
        String Path = inputCreeate.split(" ")[2].split("\\.")[2];
        String statusPath = Path.substring(1, Path.length() - 1);
        String storagePluginPath = inputCreeate.split(" ")[2].split("\\.")[1];
        System.out.println(storagePluginPath);
        System.out.println(statusPath);
        
//        private String oldMethod(String line)
//        {
//            LOG.info("RK@@ line:"+line);
//            LOG.info("RK@@ line.split(\" \")[2]:--"+line.split(" ")[2]);
//            LOG.info("RK@@ line.split(\" \")[2].split(\"\\\\.\")[2]---:"+line.split(" ")[2].split("\\.")[2]);
//            String Path = line.split(" ")[2].split("\\.")[2];
//            LOG.info("RK@@ Path:"+Path);
//            String statusPath = Path.substring(1, Path.length() - 1);
//            LOG.info("RK@@ statusPath:"+statusPath);
//            LOG.info("RK@@ statusPathKey:"+line.split(" ")[2].split("\\.")[1]);
//            String storagePluginPath = storagePlugin.getProperty(line.split(" ")[2].split("\\.")[1]);
//            LOG.info("RK@@ storagePluginPath:"+storagePluginPath);
//            return storagePluginPath + statusPath;
//        }
//        private String latestMehod(String line)
//        {
//            LOG.info("Query {}"+line);
//            String tildSplits[] = line.split("`");
//            String storagePluginKeyTemp = tildSplits[0];
//            LOG.info("RK@ storagePluginKeyTemp:"+storagePluginKeyTemp);
//            String viewOrTableName = tildSplits[1];
//            LOG.info("RK@ viewOrTableName:"+viewOrTableName);
//            String storagePluginPath = null;
//            LOG.info("RK@1");
//            if (line.contains("`"))
//            {
//                LOG.info("RK@2");
//                if (storagePluginKeyTemp.contains("."))
//                {
//                    LOG.info("RK@3");
//                    String storagePluginKey = storagePluginKeyTemp.split("\\.")[1];
//                    LOG.info("RK@3 storagePluginKey:"+storagePluginKey);
//                    storagePluginPath = storagePlugin.getProperty(storagePluginKey);
//                    LOG.info("RK@3 storagePluginPath:"+storagePluginPath);
//                }
//                else
//                {
//                    LOG.debug("Issue while forming drill storage plugin {}:", storagePluginKeyTemp);
//                    //throw new RuntimeException("Exception while forming drill storage plugin: " + storagePluginKeyTemp);
//                }
//            }
//            else
//            {
//                LOG.debug("Issue while forming output path, Query {}:", line);
//                //throw new RuntimeException("Exception while forming output path from query: " + line);
//            }
//            LOG.info("Formed output path {}", storagePluginPath + viewOrTableName);
//            return storagePluginPath + viewOrTableName;
//        }
    }

}
