package com.udemy.java.generic;

import java.util.ArrayList;
import java.util.List;

class Container<T1, T2>
{
    T1 obj1;
    T2 obj2;

    public T1 getObj1()
    {
        return obj1;
    }

    public void setObj1(T1 obj1)
    {
        this.obj1 = obj1;
    }

    public T2 getObj2()
    {
        return obj2;
    }

    public void setObj2(T2 obj2)
    {
        this.obj2 = obj2;
    }

    public Container(T1 obj1, T2 obj2)
    {
        super();
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public String toString()
    {
        return "Container [obj1=" + obj1 + ", obj2=" + obj2 + "]";
    }

}

public class GenericsExample
{

    public static <T1, T2> List<Container<T1, T2>> combine(Container<T1, T2> o1, Container<T1, T2> o2)
    {
        List<Container<T1, T2>> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);

        return list;
    }

    public static void main(String[] args)
    {
        Container<String, Integer> con1 = new Container<>("Ravi1", 1000);
        Container<String, Integer> con2 = new Container<>("Ravi2", 2000);
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(combine(con1, con2));
        System.out.println("\npublic static <T1,T2> List<Container<T1,T2>> combine(Container<T1,T2> o1, Container<T1,T2> o2) \n{\n}");
    }

}
