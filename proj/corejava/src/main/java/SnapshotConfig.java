
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * The Class SnapshotConfig.
 */
public class SnapshotConfig
{

    /** The run date. */
    private static String runDate;

    /** The app group. */
    private String appGroup;

    /** The partition list. */
    private String[] partitionList;

    /** The epshost. */
    private String epshost;

    /** The eps port. */
    private String epsPort;

    /** The cha qualifier map. */
    private static final Map<String, String> chaQualifierMap = new HashMap<>();

    /** The cpm qualifier map. */
    private static final Map<String, String> cpmQualifierMap = new HashMap<>();

    /** The file names map. */
    private static final Map<String, Map<String, String>> fileNamesMap = new HashMap<>();

    /** The current partition. */
    private String currentPartition;

    /** The current row key. */
    private byte[] currentRowKey;

    /** The current row value. */
    private Result currentRowValue;

    /** The current entity value. */
    private String currentEntityValue;

    /** The current qualifier. */
    private String currentQualifier;

    /** The current entity name. */
    private String currentEntityName;

    /** The current job name. */
    private String currentJobName;

    /** The hbase config. */
    private Configuration hbaseConfig;

    /** The context. */
    private Mapper<ImmutableBytesWritable, Result, NullWritable, Text>.Context context;

    /** The current table name. */
    private String currentTableName;

    private String clusterId;

    private String dataDumpCldbHostlist;

    private String dataDumpCldbPort;

    private boolean deltaRun;

    private String siteId;

    private String currentUser;

    private String enrichmentList="";

    private String eventSegmentation;

    /**
     * @return deltaRun is true or false
     */
    public boolean isDeltaRun()
    {
        return deltaRun;
    }

    /**
     * @param deltaRun
     *          set deltaRun
     */
    public void setDeltaRun(boolean deltaRun)
    {
        this.deltaRun = deltaRun;
    }

    /**
     * Gets the current table name.
     *
     * @return the currentTableName
     */
    public String getCurrentTableName()
    {
        return currentTableName;
    }

    /**
     * Sets the current table name.
     *
     * @param currentTableName the currentTableName to set
     */
    public void setCurrentTableName(String currentTableName)
    {
        this.currentTableName = currentTableName;
    }

    /**
     * Gets the file names map.
     *
     * @return the fileNamesMap
     */
    public static Map<String, Map<String, String>> getFileNamesMap()
    {
        return fileNamesMap;
    }

    /**
     * Gets the run date.
     *
     * @return the runDate
     */
    public static String getRunDate()
    {
        return runDate;
    }

    /**
     * Sets the run date.
     *
     * @param runDate the runDate to set
     */
    public void setRunDate(String runDate)
    {
        SnapshotConfig.runDate = runDate;
    }

    /**
     * Gets the app group.
     *
     * @return the appGroup
     */
    public String getAppGroup()
    {
        return appGroup;
    }

    /**
     * Sets the app group.
     *
     * @param appGroup the appGroup to set
     */
    public void setAppGroup(String appGroup)
    {
        this.appGroup = appGroup;
    }

    /**
     * Gets the partition list.
     *
     * @return the partitionList
     */
    public String[] getPartitionList()
    {
        return Arrays.copyOf(partitionList, partitionList.length);
    }

    /**
     * Sets the partition list.
     *
     * @param partitionList the partitionList to set
     */
    public void setPartitionList(String[] partitionList)
    {
        this.partitionList = Arrays.copyOf(partitionList, partitionList.length);
    }

    /**
     * Gets the epshost.
     *
     * @return the epshost
     */
    public String getEpshost()
    {
        return epshost;
    }

    /**
     * Sets the epshost.
     *
     * @param epshost the epshost to set
     */
    public void setEpshost(String epshost)
    {
        this.epshost = epshost;
    }

    /**
     * Gets the eps port.
     *
     * @return the epsPort
     */
    public String getEpsPort()
    {
        return epsPort;
    }

    /**
     * Sets the eps port.
     *
     * @param epsPort the epsPort to set
     */
    public void setEpsPort(String epsPort)
    {
        this.epsPort = epsPort;
    }

    /**
     * Gets the current partition.
     *
     * @return the currentPartition
     */
    public String getCurrentPartition()
    {
        return currentPartition;
    }

    /**
     * Sets the current partition.
     *
     * @param currentPartition the currentPartition to set
     */
    public void setCurrentPartition(String currentPartition)
    {
        this.currentPartition = currentPartition;
    }

    /**
     * Gets the hbase config.
     *
     * @return the hbaseConfig
     */
    public Configuration getHbaseConfig()
    {
        return hbaseConfig;
    }

    /**
     * Sets the hbase config.
     *
     * @param hbaseConfig the hbaseConfig to set
     */
    public void setHbaseConfig(Configuration hbaseConfig)
    {
        this.hbaseConfig = hbaseConfig;
    }

    /**
     * Gets the context.
     *
     * @return the context
     */
    public Mapper<ImmutableBytesWritable, Result, NullWritable, Text>.Context getContext()
    {
        return context;
    }

    /**
     * Sets the context.
     *
     * @param context the context to set
     */
    public void setContext(Mapper<ImmutableBytesWritable, Result, NullWritable, Text>.Context context)
    {
        this.context = context;
    }

    /**
     * Gets the current key.
     *
     * @return the currentKey
     */
    public byte[] getCurrentKey()
    {
        return Arrays.copyOf(currentRowKey, currentRowKey.length);
    }

    /**
     * Sets the current key.
     *
     * @param currentKey the currentKey to set
     */
    public void setCurrentKey(byte[] currentKey)
    {
        this.currentRowKey = Arrays.copyOf(currentKey, currentKey.length);
    }

    /**
     * Gets the current entity value.
     *
     * @return the currentEntityValue
     */
    public String getCurrentEntityValue()
    {
        return currentEntityValue;
    }

    /**
     * Sets the current entity value.
     *
     * @param currentValue the currentEntityValue to set
     */
    public void setCurrentEntityValue(String currentValue)
    {
        this.currentEntityValue = currentValue;
    }

    /**
     * Gets the current entity name.
     *
     * @return the currentEntityName
     */
    public String getCurrentEntityName()
    {
        return currentEntityName;
    }

    /**
     * Sets the current entity name.
     *
     * @param entityName the new current entity name
     */
    public void setCurrentEntityName(String entityName)
    {
        this.currentEntityName = entityName;
    }

    /**
     * Gets the current qualifier.
     *
     * @return the currentQualifier
     */
    public String getCurrentQualifier()
    {
        return currentQualifier;
    }

    /**
     * Sets the current qualifier.
     *
     * @param currentQualifier the currentQualifier to set
     */
    public void setCurrentQualifier(String currentQualifier)
    {
        this.currentQualifier = currentQualifier;
    }

    /**
     * Gets the current job name.
     *
     * @return the currentJobName
     */
    public String getCurrentJobName()
    {
        return currentJobName;
    }

    /**
     * Sets the current job name.
     *
     * @param currentJobName the currentJobName to set
     */
    public void setCurrentJobName(String currentJobName)
    {
        this.currentJobName = currentJobName;
    }

    /**
     * Gets the current row key.
     *
     * @return the currentRowKey
     */
    public byte[] getCurrentRowKey()
    {
        return Arrays.copyOf(currentRowKey, currentRowKey.length);
    }

    /**
     * Sets the current row key.
     *
     * @param currentRowKey the currentRowKey to set
     */
    public void setCurrentRowKey(byte[] currentRowKey)
    {
        this.currentRowKey = Arrays.copyOf(currentRowKey, currentRowKey.length);
    }

    /**
     * Gets the current row value.
     *
     * @return the currentRowValue
     */
    public Result getCurrentRowValue()
    {
        return currentRowValue;
    }

    /**
     * Sets the current row value.
     *
     * @param currentRowValue the currentRowValue to set
     */
    public void setCurrentRowValue(Result currentRowValue)
    {
        this.currentRowValue = currentRowValue;
    }

    /**
     * Gets the cha qualifier map.
     *
     * @return the chaQualifierMap
     */
    public static Map<String, String> getChaQualifierMap()
    {
        return chaQualifierMap;
    }

    /**
     * Gets the cpm qualifier map.
     *
     * @return the cpmQualifierMap
     */
    public static Map<String, String> getCpmQualifierMap()
    {
        return cpmQualifierMap;
    }

    /**
     * @return the clusterId
     */
    public String getClusterId()
    {
        return clusterId;
    }

    /**
     * @param clusterId the clusterId to set
     */
    public void setClusterId(String clusterId)
    {
        this.clusterId = clusterId;
    }

    /**
     * @return the dataDumpCldbHostlist
     */
    public String getDataDumpCldbHostlist()
    {
        return dataDumpCldbHostlist;
    }

    /**
     * @param dataDumpCldbHostlist the dataDumpCldbHostlist to set
     */
    public void setDataDumpCldbHostlist(String dataDumpCldbHostlist)
    {
        this.dataDumpCldbHostlist = dataDumpCldbHostlist;
    }

    /**
     * @return the dataDumpCldbPort
     */
    public String getDataDumpCldbPort()
    {
        return dataDumpCldbPort;
    }

    /**
     * @param dataDumpCldbPort the dataDumpCldbPort to set
     */
    public void setDataDumpCldbPort(String dataDumpCldbPort)
    {
        this.dataDumpCldbPort = dataDumpCldbPort;
    }

    /**
     * @return the siteId
     */
    public String getSiteId()
    {
        return siteId;
    }

    /**
     * @param siteId the siteId to set
     */
    public void setSiteId(String siteId)
    {
        this.siteId = siteId;
    }

    /**
     * @return the currentUser
     */
    public String getCurrentUser()
    {
        return currentUser;
    }

    /**
     * @param currentUser the currentUser to set
     */
    public void setCurrentUser(String currentUser)
    {
        this.currentUser = currentUser;
    }

    public String getEnrichmentList()
    {
        return enrichmentList;
    }

    public void setEnrichmentList(String enrichmentList)
    {
        this.enrichmentList = enrichmentList;
    }

    public String getEventSegmentation()
    {
        return eventSegmentation;
    }

    public void setEventSegmentation(String eventSegmentation)
    {
        this.eventSegmentation = eventSegmentation;
    }

}
