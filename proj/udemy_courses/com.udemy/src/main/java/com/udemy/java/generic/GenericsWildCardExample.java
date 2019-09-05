package com.udemy.java.generic;

import java.util.ArrayList;

class Aclass
{
    String name;

    public Aclass(String name)
    {
        super();
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Aclass [name=" + name + "]";
    }
    public void work()
    {
        System.out.println("Aclass working");
    }
}

class Bclass extends Aclass
{
    String name;

    public Bclass(String name)
    {
        super(name);
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Bclass [name=" + name + "]";
    }
    public void work()
    {
        System.out.println("Bclass working");
    }

}

public class GenericsWildCardExample
{

    public static void main(String[] args)
    {

        Object o1 = new Object();
        String s = new String("Hi");
        o1 = s;

        Aclass a = new Aclass("A001");
        Bclass b = new Bclass("B001");
        a = b;

        ArrayList<Aclass> alA = new ArrayList<>();
        ArrayList<Bclass> alB = new ArrayList<>();
//        alA = alB;// C.E even Bclass is sub class of Aclass.

        ArrayList<Object> alAo1 = new ArrayList<>();
        ArrayList<Bclass> alBo1 = new ArrayList<>();
        ArrayList<String> alSo1 = new ArrayList<>();
//        alAo1 = alBo1; // C.E even Bclass is sub class of Object.
//        alAo1 = alSo1;// C.E even String is sub class of Object.

        ArrayList<?> alA1 = new ArrayList<>();
        ArrayList<Bclass> alB1 = new ArrayList<>();
        ArrayList<String> alS1 = new ArrayList<>();
        alA1 = alB1;
        alA1 = alS1;

        ArrayList<? extends Aclass> alA2 = new ArrayList<>();
        ArrayList<Aclass> alAA2 = new ArrayList<>();
        ArrayList<Bclass> alB2 = new ArrayList<>();
        ArrayList<String> alS2 = new ArrayList<>();
        alA2 = alB2;
        alA2 = alAA2;
//        alA2 = alS2;// C.E String is not subclass of Aclass.
        
        
        ArrayList<? super Aclass> alA3 = new ArrayList<>();
        ArrayList<Aclass> alAA3 = new ArrayList<>();
        ArrayList<Bclass> alB3 = new ArrayList<>();
        ArrayList<Object> alO3 = new ArrayList<>();
        ArrayList<String> alS3 = new ArrayList<>();
        alA3 = alAA3;
        alA3 = alO3;
//        alA3 = alB3;// C.E Bclass is not super of Aclass.
//        alA3 = alS3;// C.E String is not super of Aclass.
        doTask(alAA3);
        doTask(alB3);
        

    }
    public static void doTask( ArrayList<? extends Aclass> a)
    {
        for(Aclass each:a)
        {
           each.work();
        }
    }
}
