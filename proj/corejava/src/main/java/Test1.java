import java.util.ArrayList;
import java.util.List;

class RK
{
    String s="1";
}

public class Test1
{
    public static final List<Integer> intList=new ArrayList<>();
    public static void assign()
    {
        intList.add(1);
        intList.add(2);
    }
    public static void print()
    {
        System.out.println(intList);
    }
    public static void main(String[] args)
    {
//        intList.add(0);
//        assign();
//        print();
        
        RK obj=null;
        obj=(obj instanceof RK)?null:obj;
        
        System.out.println(obj);
    }

}
