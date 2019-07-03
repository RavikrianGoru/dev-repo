package com.java.rk.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortList
{

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Ravi,Kiran");
        list.add("Kiran,Goru");
        list.add("Raju,Abhi");
        list.add("Devi,Balla");
        System.out.println("Sort given list:Normal======================");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("\nSort given list:Reverse======================");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        System.out.println("\nSort given list:Custom logic=========Natural=============");
        list.stream().sorted((String s1,String s2)->{return s1.split(",")[1].compareTo(s2.split(",")[1]);}).forEach(System.out::println);        
        
        System.out.println("\nSort given list:Custom logic=========Reverse=============");
        list.stream().sorted((String s1,String s2)->{return s2.split(",")[1].compareTo(s1.split(",")[1]);}).forEach(System.out::println);        

        
        Collections.sort(list,(String e1,String e2)->{return e1.split(",")[1].compareTo(e2.split(",")[1]);});
        System.out.println(list);
        
        
    }

}
