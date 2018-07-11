package com.rk.generics;

import java.util.ArrayList;
import java.util.List;

class MyGeneric2D<U, V>
{
    private U objRefU;
    private V objRefV;

    public MyGeneric2D(U objRefU, V objRefV)
    {
        this.objRefU = objRefU;
        this.objRefV = objRefV;
    }

    public void printTypes()
    {
        System.out.println("(" + this.objRefU.getClass().getName() + ", " + this.objRefV.getClass().getName() + ")");
    }

    public void printData()
    {
        System.out.println("(" + this.objRefU + ", " + this.objRefV + ")");
    }
}

public class MyGenericTest2
{
    public static void main(String[] args)
    {
        MyGeneric2D<String, Boolean> obj2D1 = new MyGeneric2D("ravi", true);
        obj2D1.printTypes();
        obj2D1.printData();

        ArrayList al = new ArrayList<String>();
        al.add("hi");
        al.add("bye");
        MyGeneric2D<String, List<String>> obj2D2 = new MyGeneric2D("ravi", al);
        obj2D2.printTypes();
        obj2D2.printData();

        MyGeneric2D<String, Integer> obj2D3 = new MyGeneric2D("ravi", 500);
        obj2D3.printTypes();
        obj2D3.printData();

    }

}
