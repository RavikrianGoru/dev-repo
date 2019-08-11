package com.java.rk.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class StreamsForEach_ForEachOrdered
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>(Arrays.asList("Hi", "Bye", "Welcome", "Good", "See you", "Meet you", "Thanks you"));
        
        System.out.println("===============.forEach(-) and .forEachOrdered(-) are terminal operations===============");
        System.out.println(".stream().forEach(-)============================");
        list.stream().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);

        System.out.println(".stream().forEachOrdered(-)============================");
        list.stream().forEachOrdered(System.out::println);
        list.parallelStream().forEachOrdered(System.out::println); // No use of using parallerlStream().forEachOrder(-) same performance.
        
        TreeSet<String> ts=new TreeSet<>(list);
        ts.stream().forEach(System.out::println);
    }

}
