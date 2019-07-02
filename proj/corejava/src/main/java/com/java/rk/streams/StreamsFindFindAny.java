package com.java.rk.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsFindFindAny
{

    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<>();
        strList.add("Hi, This is ravi kiran");
        strList.add("Here, find the specified word in given list of elements");
        strList.add("separated by space. Bye.");

        Stream<String> wordsStream = strList.stream().flatMap((s) -> {
            return Arrays.asList(s.split(" ")).stream();
        });

        // Check stream empty or not by findAny()
        Optional<String> anyElement = wordsStream.findAny();
        if (anyElement.isPresent())
        {
            System.out.println(anyElement);
        }

        List<String> sList = new ArrayList<>();
        Optional<String> anyElement1 = sList.stream().findAny();
        if (anyElement1.isPresent())
        {
            System.out.println(anyElement1);
        }
        else
        {
            System.out.println("Empty stream:" + anyElement1);
        }

        System.out.println("findFirst:"+sList.stream().findFirst());
        System.out.println("findFirst:"+strList.stream().findFirst());
    }

}
