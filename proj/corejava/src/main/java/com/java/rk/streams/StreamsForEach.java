package com.java.rk.streams;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


class MyConsumer implements Consumer<String>
{
    @Override
    public void accept(String t)
    {
        System.out.println(t);
    }
}
public class StreamsForEach
{
    public static void main(String[] args)
    {
        System.out.println("java8----->default void forEach(Consumer<? super T> action)------> added in Iterable interface");
        System.out.println("so,we can call forEach(-) method on any collection class for iterating.");

        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("Chinna");
        
        //Way-0
        Iterator<String> itr=list.iterator();
        System.out.println("Display list elements by Iterator-while:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Way-1
        System.out.println("Display list elements by forEach with labda and type");
        Stream<String> stream0=list.stream();
        stream0.forEach((String s)->{System.out.println(s);});
        
        //Way-2
        System.out.println("Display list elements by forEach with labda and without type");
        list.stream().forEach((s)->{System.out.println(s);});

        //Way-3        
        System.out.println("Display list elements by forEach with labda and without braces");
        list.stream().forEach(s->System.out.println(s));

        //Way-4
        System.out.println("Display list elements by forEach with labda and methode preference");
        list.stream().forEach(System.out::println);
        
        //Way-5
        System.out.println("Display list elements by forEach with labda and Custom Consumer");
        list.stream().forEach(new MyConsumer());
        
        //Way-6
        System.out.println("Display list elements by forEach with labda and Anonymus COnsumer");
        list.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String t)
            {
                System.out.println(t);
            }
        });
        
        Hashtable<Integer,Object> ht=new Hashtable<>();
        ht.put(1, "RAVI");
        ht.put(2, "KIRAN");
        ht.put(3, "");
        ht.put(7, "Kumar");
        
        //Way-1
        System.out.println("Print Hashtable key,value forEach(Consumer):");
        ht.keySet().stream().forEach((key)->{System.out.println("Key="+key +" Value=" +ht.get(key));});
        
        //Way-2
        System.out.println("Print Hashtable key,value forEach(BiConsumer):");
        ht.forEach((key,value)->{System.out.println("Key="+key +" Value=" +ht.get(key));});
        
    }
    
}
