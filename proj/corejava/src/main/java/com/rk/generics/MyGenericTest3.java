package com.rk.generics;

import java.util.ArrayList;
import java.util.List;

class MyGeneric3D<U, V, W>
{
    private U objRefU;
    private V objRefV;
    private W objRefW;

    public MyGeneric3D(U objRefU, V objRefV, W objRefW)
    {
        this.objRefU = objRefU;
        this.objRefV = objRefV;
        this.objRefW = objRefW;
    }

    public void printTypes()
    {
        System.out.println("(" + this.objRefU.getClass().getName() + ", " + this.objRefV.getClass().getName() + ", " + this.objRefW.getClass().getName() + ")");
    }

    public void printData()
    {
        System.out.println("(" + this.objRefU + ", " + this.objRefV + ", " + this.objRefW + ")");
    }
}

public class MyGenericTest3
{
    public static void main(String[] args)
    {
        MyGeneric3D<String, Boolean, Integer> obj3D1 = new MyGeneric3D("ravi", true, 100);
        obj3D1.printTypes();
        obj3D1.printData();

        ArrayList al = new ArrayList<String>();
        al.add("hi");
        al.add("bye");
        MyGeneric3D<String, List<String>, Integer> obj3D2 = new MyGeneric3D("ravi", al, 500);
        obj3D2.printTypes();
        obj3D2.printData();

    }

}
