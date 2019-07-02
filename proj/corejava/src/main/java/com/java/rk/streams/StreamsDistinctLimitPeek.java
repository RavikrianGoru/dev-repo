package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDistinctLimitPeek
{

    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("Ravi");
        list.add("Goru");
        list.add("Ravi");
        list.add("Ravi");
        
        //Unique elements
        Stream<String> stream=list.stream().distinct();
        stream.forEach(System.out::println);
        
        //Limit to some no of elements and get stream
        System.out.println(list.stream().limit(4).collect(Collectors.toList()));
        
        //distinct and limit
        System.out.println(list.stream().distinct().limit(4).collect(Collectors.toList()));
        
        //peek lly to forEach but returns Stream
        Stream<String> stm1=list.stream().peek((s)->{System.out.println(s);});
    }

}
