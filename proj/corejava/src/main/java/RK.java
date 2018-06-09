import java.util.ArrayList;
import java.util.List;

public class RK
{

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        String a1="R1";
        String a2="R2";
        String a3="R3";
        String a4="R4";
        String a5="R5";
        list.add(a1+"_v1");
        list.add(a2+"_v1");
        list.add(a3+"_v1");
        list.add(a4+"_v1");
        list.add(a5+"_v1");
        System.out.println(list);
        String s1="R1v1";
        String k1=s1.contains("_")?(s1.substring(0,s1.indexOf("_"))):s1;
        System.out.println(k1);
        
    }

}
