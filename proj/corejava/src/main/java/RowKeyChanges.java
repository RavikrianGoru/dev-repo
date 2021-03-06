import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowKeyChanges
{

    public static String getRowKey(String customerID)
    {
        System.out.println(customerID);
        StringBuffer sb = new StringBuffer(customerID.replaceAll("-", ""));
        System.out.println(sb);
        System.out.println(sb.reverse());
        return "";
    }

    public static void main(String[] args)
    {
        String uuiD = "5eb87f09-b059-445b-94ca-42854f00d65b";
        System.out.println("Given UUID input: " + uuiD);
        System.out.println("Generated rowKey: " + getRowKey(uuiD));
        extractEntitiesFromColumns();

    }

    public static void extractEntitiesFromColumns()
    {
        List<String> keyList = new ArrayList<>();
        keyList.add("BAM_A7A6A231A9A841C59E42FB0CF4F3CF7E_22809125FE40460CBDD081758CAC6BC5_BE69BDF55CBA4648BF9997B42856A97A");
        keyList.add("BA_A7A6A231A9A841C59E42FB0CF4F3CF7E_22809125FE40460CBDD081758CAC6BC5_BE69BDF55CBA4648BF9997B42856A97A");
        keyList.add("PB_A7A6A231A9A841C59E42FB0CF4F3CF7E_CB599861228E46DB87ACE95BC1E85506_EDF5F04FF4274D49A066474870439F9A_35A10913DAAE44DDB5005DB1BEE9B9A8");
        keyList.add("RA_A7A6A231A9A841C59E42FB0CF4F3CF7E_22809125FE40460CBDD081758CAC6BC5_BE69BDF55CBA4648BF9997B42856A97A");
        keyList.add("RB_A7A6A231A9A841C59E42FB0CF4F3CF7E_CB599861228E46DB87ACE95BC1E85506_EDF5F04FF4274D49A066474870439F9A_35A10913DAAE44DDB5005DB1BEE9B9A8");
        keyList.add("VC_A7A6A231A9A841C59E42FB0CF4F3CF7E_35A10913DAAE44DDB5005DB1BEE9B9A8_EDF5F04FF4274D49A066474870439F9A_CB599861228E46DB87ACE95BC1E85506_01");
        keyList.add("VC_A7A6A231A9A841C59E42FB0CF4F3CF7E_35A10913DAAE44DDB5005DB1BEE9B9A8_EDF5F04FF4274D49A066474870439F9A_CB599861228E46DB87ACE95BC1E85506_03");
        keyList.add("VC_A7A6A231A9A841C59E42FB0CF4F3CF7E_35A10913DAAE44DDB5005DB1BEE9B9A8_EDF5F04FF4274D49A066474870439F9A_CB599861228E46DB87ACE95BC1E85506_30");
        keyList.add("BA_924D15A14F0B42D9B98544338D2DD28F_1C41A54B39B3462CA5ECF799B05BEA7F_2F55BBA7831C48A08B504FAD4757A0D4");
        keyList.add("BA_924D15A14F0B42D9B98544338D2DD28F_1C41A54B39B3462CA5ECF799B05BEA7G_2F55BBA7831C48A08B504FAD4757A0D5");
        keyList.add("PB_924D15A14F0B42D9B98544338D2DD28F_88091FF9D20D40C7A0181B4220647FD5_BA03EED7DFF0403C9F21F5EF8013A621_114ED41595664094A141543BF4334D18");
        keyList.add("PB_924D15A14F0B42D9B98544338D2DD28F_88091FF9D20D40C7A0181B4220647FD5_BA03EED7DFF0403C9F21F5EF8013A621_114ED41595664094A141543BF4334D19");
        keyList.add("VC_924D15A14F0B42D9B98544338D2DD28F_114ED41595664094A141543BF4334D18_BA03EED7DFF0403C9F21F5EF8013A621_88091FF9D20D40C7A0181B4220647FD5_2017");
        keyList.add("VC_924D15A14F0B42D9B98544338D2DD28F_114ED41595664094A141543BF4334D19_BA03EED7DFF0403C9F21F5EF8013A621_88091FF9D20D40C7A0181B4220647FD5_2017");
        keyList.add("VC");

        Map<String, String> map = new HashMap<>();
        map.put("PB", "ProductBucketBalance");
        map.put("VC", "ValueContainer");
        map.put("BA", "BillingAccountBucketBalance");

        for (String each : keyList)
        {
            System.out.println(map.get(each.contains("_") ? each.substring(0, each.indexOf('_')) : each));
        }
    }

}
