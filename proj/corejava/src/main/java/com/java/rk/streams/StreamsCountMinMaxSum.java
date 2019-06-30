package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsCountMinMaxSum
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
        List<Integer> iList=new ArrayList<>();
        iList.add(1000);
        iList.add(500);
        iList.add(5000);
        iList.add(6000);
        iList.add(2500);

        // Internal iteration provides several features such as sequential and parallel execution, filtering based on the given criteria, mapping etc

        long count = iList.stream().count();
        System.out.println("Count:"+count);
        
        Integer min= iList.stream().min((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Min:"+min);

        Integer max= iList.stream().max((i1,i2)->{return i1.compareTo(i2);}).get();
        System.out.println("Max:"+max);
        
        long sum= iList.stream().mapToLong((s)->{return (long)s;}).sum();
        System.out.println("Sum:"+sum);
        
        
        
        
        
        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee("5000"));
        eList.add(new Employee("5050"));
        eList.add(new Employee("1000"));
        eList.add(new Employee("2500"));
        
        min= eList.stream().map(s->s.sal).map(Integer::parseInt).min((s1,s2)->{return s1.compareTo(s2);}).get();
        System.out.println("Min:"+min);

        max= eList.stream().map(s->s.sal).map(Integer::parseInt).max((s1,s2)->{return s1.compareTo(s2);}).get();
        System.out.println("Max:"+max);
    }

}
