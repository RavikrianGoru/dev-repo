package com.java.rk.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFlatMap
{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Hi Ravi Kiran ,");
        list.add("How are you?");
        list.add("Will you come for tea break?");
        list.add("Shall we move on?");

        Stream<String> streamString=list.stream().flatMap((s) -> {return (Stream<String>)Arrays.asList(s.split(" ")).stream(); });
        streamString.forEach(System.out::println);
    }

}
