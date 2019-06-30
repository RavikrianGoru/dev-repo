package com.java.rk.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsCollect
{

    public static void main(String[] args)
    {
        Set<Integer> iSet=new HashSet<>();
        iSet.add(123);
        iSet.add(143);
        iSet.add(165);
        iSet.add(122);
        iSet.add(123);
        iSet.add(145);
        iSet.add(112);
        iSet.add(234);
        iSet.add(543);
        
        System.out.println("Even numbers:");
        Set<Integer> eSet=iSet.stream().filter((s)->{return (s%2==0)?true:false;}).collect(Collectors.toSet());
        eSet.forEach(System.out::println);
        
    }

}
