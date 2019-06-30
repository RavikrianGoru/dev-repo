package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMap
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("Chinna");
        
        Stream<String> stream1 = list.stream();
        Stream<String> lowerStrea1 = stream1.map((String s) -> {return s.toLowerCase();});

        Stream<String> upperStrea1 = lowerStrea1.map((String s) -> {return s.toUpperCase();});
        upperStrea1.forEach((String s) -> {System.out.println(s);});

        // with Type , return type and {}
        list.stream().map((String s) -> {return s.toLowerCase();}).map((String s) -> {return s.toUpperCase();}).forEach((String s) -> {System.out.println(s);});

        // without type, return type, {}
        list.stream().map(s -> s.toLowerCase()).map(s -> s.toUpperCase()).forEach(s -> System.out.print(s));

        // method preferences
        list.stream().map(String::toLowerCase).map(String::toUpperCase).forEach(System.out::println);

        

    }

}
