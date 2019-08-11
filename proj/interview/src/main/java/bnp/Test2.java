package bnp;

import java.util.HashMap;

public class Test2
{

    public static void main(String[] args)
    {
        /*
        Collection: <Student>
                        Name, Age
       
       
       Group by name?
       */
        
        /*
         
         
         
         */
        
        String a ="James";
        StringBuilder sbi= new StringBuilder("James");
        StringBuffer sbf= new StringBuffer("James");
        
        System.out.println();
        System.out.println(sbf);
        
        
        int i=1;
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put(null, 1);
        hm.put(i+"", 2);
        hm.put(null, 3);
        hm.put("i", 4);
        hm.put("i"+1, 5);
        System.out.println(hm.get("i") + " "+ hm.get(null));
    }

}
