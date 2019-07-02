package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsReduce
{

    static class Employee
    {
        private int id;
        private String name;
        private float sal;
        public Employee(int id, String name, float sal)
        {
            super();
            this.id = id;
            this.name = name;
            this.sal = sal;
        }
    }
    public static void main(String[] args)
    {

        List<Employee> eList=new ArrayList<>();
        eList.add(new Employee(1, "Ravi", 20000.00f));
        eList.add(new Employee(2, "Kiran", 25000.00f));
        eList.add(new Employee(3, "Chinna", 30000.00f));

        // Way-1
        Optional<Float> optlFloat=eList.stream().map((e)->{return e.sal;}).reduce((x,y)->x+y);
        System.out.println(optlFloat.get());
        
        //Way-2
        Float sumSal =eList.stream().map(s->s.sal).reduce(0.0f,(o1,n1)->o1+n1).floatValue();
        System.out.println(sumSal);
        
        
        List<String> wordsList=new ArrayList<>();
        wordsList.add("Hi,");
        wordsList.add("How");
        wordsList.add("are");
        wordsList.add("you?");
        wordsList.add("shall");
        wordsList.add("we");
        wordsList.add("move");
        wordsList.add("on?");
        
        Optional<String> optString= wordsList.stream().reduce((one,two)->{return one+" "+two;});
        System.out.println(optString);

        
        
    }

}
