package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsOne
{
    static class Employee
    {
        String sal;
        Employee(String sal){
            this.sal=sal;
        }
        
    }
    
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("Chinna");

        //streamWay1(list);

        // with Type , return type and {} 
        //list.stream().map((String s)->{return s.toLowerCase();}).map((String s)->{return s.toUpperCase();}).forEach((String s)->{System.out.println(s);});
        
        // without type, return type, {}
        //list.stream().map(s->s.toLowerCase()).map(s->s.toUpperCase()).forEach(s->System.out.print(s));
        
        //method preferences
        list.stream().map(String::toLowerCase).map(String::toUpperCase).forEach(System.out::println);
        
        List<Employee> eList= new ArrayList<>();
        eList.add(new Employee("5000"));
        eList.add(new Employee("5050"));
        eList.add(new Employee("1000"));
        eList.add(new Employee("2500"));
        
        long count=eList.stream().filter(s->s.sal.startsWith("5")).count();
        System.out.println(count);
        
        int sum = eList.stream().map(emp->emp.sal).map(Integer::parseInt).reduce(0, (tempSum,each)->tempSum+each);
        System.out.println(sum);
        
        
        
        
    }

    public static void streamWay1(List<String> list)
    {
        Stream<String> stream=list.stream();
        stream.forEach((String s)->{System.out.println(s);});
        
        Stream<String> stream1=list.stream();
        Stream<String> lowerStrea1=stream1.map((String s)->{return s.toLowerCase();});

        Stream<String> upperStrea1=lowerStrea1.map((String s)->{return s.toUpperCase();});
        upperStrea1.forEach((String s)->{System.out.println(s);});
    }

}
