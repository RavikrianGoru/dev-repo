package com.rk.generics;

class MyGeneric<T>
{
    private T objRef = null;

    public MyGeneric(T obj)
    {
        this.objRef = obj;
    }

    public T getObjRef()
    {
        return this.objRef;
    }

    public void printType()
    {
        System.out.println(this.objRef.getClass().getName());
    }

    public void printData()
    {
        System.out.println(this.objRef);
    }

}

public class MyGenericTest1
{
    public static void main(String[] args)
    {
        System.out.println("1. Boolean type obj for Generic:");
        MyGeneric<Boolean> booleanObj = new MyGeneric(true);
        booleanObj.printType();
        booleanObj.printData();

        System.out.println("2. String type obj for Generic:");
        MyGeneric<String> StringObj = new MyGeneric("Ravikiran");
        StringObj.printType();
        StringObj.printData();

        System.out.println("3. Integer type obj for Generic:");
        MyGeneric<Integer> integerObj = new MyGeneric(500);
        integerObj.printType();
        integerObj.printData();
    }

}
