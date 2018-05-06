import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hbase.util.Bytes;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class Rk
{
    
    public static String getRowKey(String customerID)//Rowkey – CustomerID (hyphen removed, reversed, converted to hexabytes)
    {
        System.out.println(customerID);
        StringBuffer sb=new StringBuffer(customerID.replaceAll("-", ""));
        System.out.println(sb);
        System.out.println(sb.reverse());
        return "";
    }

    public static  byte[] convertShortToHex(short dayOfYearInShort)
    {
        String hexString = null;

        byte[] hexaBytes = null;

        byte[] stringBytes = Bytes.toBytes(dayOfYearInShort);

        hexString = bytesToHex(stringBytes);

        hexaBytes = hexStringToByteArray(hexString);

        return hexaBytes;
    }
    public static String bytesToHex(byte[] bytes)
    {
        final char[] hexArray = "0123456789ABCDEF".toCharArray();

        char[] hexChars = new char[bytes.length * 2];
        int v;
        for (int j = 0; j < bytes.length; j++)
        {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static byte[] hexStringToByteArray(String s)
    {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
    public static void main(String[] args)
    {
        String runDate="20180504";//yyyyMMdd
        
        DateTime runDateTimeInUTC=null;
        DateTime prevRunDateTimeInUTC=null;
        DateTime nextRunDateTimeInUTC=null;
        
        Date runDateVal=null;
        String dateWithTimestamp=null;
        String formatteDate=null;
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        try
        {
            runDateVal=sdf.parse(runDate);
            System.out.println();
            //System.out.println(runDateVal.getTime());
            //System.out.println(runDateVal);
            sdf.applyPattern("yyyy-MM-dd");
            formatteDate=sdf.format(runDateVal);
           // System.out.println(formatteDate);
            dateWithTimestamp=formatteDate+"T00:00:00";
           // System.out.println(dateWithTimestamp);
            runDateTimeInUTC=new DateTime(dateWithTimestamp,DateTimeZone.UTC);
            
            System.out.println("Run DateTime in UTC:"+runDateTimeInUTC);
            System.out.println("Run DateTime in UTC: mill Sec:"+runDateTimeInUTC.getMillis());
            
            prevRunDateTimeInUTC=runDateTimeInUTC.minusDays(1);
            System.out.println("Previous Run DateTime in UTC:"+prevRunDateTimeInUTC);
            System.out.println("Previous Run DateTime in UTC: mill Sec:"+prevRunDateTimeInUTC.getMillis());
            
            nextRunDateTimeInUTC=runDateTimeInUTC.plusDays(1);
            System.out.println("Next Run DateTime in UTC:"+nextRunDateTimeInUTC);
            System.out.println("Next Run DateTime in UTC: mill Sec:"+nextRunDateTimeInUTC.getMillis());
            
            
            System.out.println("Day of Year:"+runDateTimeInUTC.getDayOfYear());
            System.out.println(convertShortToHex((short)runDateTimeInUTC.getDayOfYear()));
            
            
            System.out.println(getRowKey("5eb87f09-b059-445b-94ca-42854f00d65b"));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        
        
        
    }

}
