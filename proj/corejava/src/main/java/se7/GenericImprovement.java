package se7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ragoru on 5/31/2016.
 */
public class GenericImprovement {
    public static void main(String[] args) {
        
    	
    	//valid declarations
    	List<String> strings=new LinkedList();
    	List<Integer> list=new LinkedList(strings);

    	strings.add("ravi");
    	strings.add("kiran");
    	System.out.println("strings List:"+strings);
    	System.out.println("list:"+list);
    	
        List<List<Integer>> listInt=new LinkedList<List<Integer>>();
        System.out.println(listInt);

        
        //<> diamond operator
        Map<String, Map<Integer, String>> map= new HashMap<>();
        



    }
}
