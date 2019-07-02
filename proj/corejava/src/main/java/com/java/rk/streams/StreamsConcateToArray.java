package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsConcateToArray
{

    public static void main(String[] args)
    {
        List<String> list1= new ArrayList<>();
        list1.add("Ravi1");
        list1.add(null);
        list1.add("Ravi2");
        
        List<String> list2= new ArrayList<>();
        list2.add("Kiran1");
        list2.add(null);
        list2.add("Kiran2");
        
        System.out.println("Concatinate Streams:");
        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);

        System.out.println("toArray:"+list1.toArray());
        System.out.println("toArray:"+list1.stream().toArray());
    }

}
