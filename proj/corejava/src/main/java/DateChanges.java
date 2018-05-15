import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hbase.util.Bytes;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateChanges
{
    public static DateTime printDifferentDateFms() throws ParseException
    {
        DateTime runDateTimeInUTC;
        DateTime prevRunDateTimeInUTC;
        DateTime nextRunDateTimeInUTC;
        Date runDateVal;
        String formatteDate;
        String runDate = "20180504";// yyyyMMdd
        System.out.println("Given runDate in format(yyyyMMdd):" + runDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        runDateVal = sdf.parse(runDate);
        System.out.println("Converted given runDate to Date obj:" + runDateVal);
        System.out.println("Date in milliS:" + runDateVal.getTime());

        sdf.applyPattern("yyyy-MM-dd");
        formatteDate = sdf.format(runDateVal);
        System.out.println("Applying patter on Date(yyyy-MM-dd):" + formatteDate);

        String dateWithTimestamp = null;
        dateWithTimestamp = formatteDate + "T00:00:00";
        System.out.println("Date in yyyy-MM-ddT00:00:00 form: " + dateWithTimestamp);
        runDateTimeInUTC = new DateTime(dateWithTimestamp, DateTimeZone.UTC);
        System.out.println("Date in yyyy-MM-ddT00:00:00 form in UTC format: " + runDateTimeInUTC);
        System.out.println("Run DateTime in UTC:" + runDateTimeInUTC);
        System.out.println("Run DateTime in UTC: mill Sec:" + runDateTimeInUTC.getMillis());
        System.out.println("Run DateTime in UTC: mill Sec -1:" + (runDateTimeInUTC.getMillis() - 1));

        prevRunDateTimeInUTC = runDateTimeInUTC.minusDays(1);
        System.out.println("Previous Run DateTime in UTC:" + prevRunDateTimeInUTC);
        System.out.println("Previous Run DateTime in UTC: mill Sec:" + prevRunDateTimeInUTC.getMillis());

        nextRunDateTimeInUTC = runDateTimeInUTC.plusDays(1);
        System.out.println("Next Run DateTime in UTC:" + nextRunDateTimeInUTC);
        System.out.println("Next Run DateTime in UTC: mill Sec:" + nextRunDateTimeInUTC.getMillis());

        System.out.println("Day of Year:" + runDateTimeInUTC.getDayOfYear());
        return runDateTimeInUTC;
    }

    public static byte[] convertShortToHex(short dayOfYearInShort)
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

    public static void main(String[] args) throws ParseException
    {
        DateTime runDateTimeInUTC = null;
        runDateTimeInUTC = printDifferentDateFms();
        System.out.println("Convert day of year to Hex:" + convertShortToHex((short) runDateTimeInUTC.getDayOfYear()));
    }

}
