package dbs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortListByLastName
{

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Ravi,Kiran");
        list.add("Kiran,Goru");
        list.add("Ravi,Abhi");
        list.add("Kiran,John");
        
        List<String> updatedList =list.stream().sorted((s1,s2)->{return s1.split(",")[1].compareTo(s2.split(",")[1]);}).collect(Collectors.toList());
        System.out.println(updatedList);
    }

}
