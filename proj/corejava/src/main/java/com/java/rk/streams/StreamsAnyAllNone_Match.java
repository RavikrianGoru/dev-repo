package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsAnyAllNone_Match
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(13);
        list.add(45);
        list.add(19);
        list.add(77);
        list.add(17);
        list.add(11);
        list.add(35);
        list.add(97);
        
        //Stream.anyMatch(-)
        System.out.println("is 19 found is stream ? :"+list.stream().anyMatch((s)->s==19));
        System.out.println("is 100 found is stream ? :"+list.stream().anyMatch((s)->s==100));

        //Stream.allMatch(-)
        System.out.println("All are odd numbers:"+list.stream().allMatch(s->{return (s%2==1?true:false);}));

        //Stream.nonMatch(-)
        System.out.println("No even: "+list.stream().noneMatch(s->{return s%2==0?true:false;}));
    }
}
