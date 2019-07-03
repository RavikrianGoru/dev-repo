package com.java.rk.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamSortMapByKey
{

    public static void main(String[] args)
    {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Ravi", "Kiran");
        hm.put("Kiran", "Goru");
        hm.put("Raju", "Abhi");
        hm.put("Devi", "Balla");
        
        
        System.out.println("Sort By Key: Normal--------------");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("Sort By Key: Reverse-------------");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        
        
        System.out.println("Sort By Value: Normal------------");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        
        System.out.println("Sort By Value: Reverse------------");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }

}
