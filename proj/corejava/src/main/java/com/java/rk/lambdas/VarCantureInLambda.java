package com.java.rk.lambdas;

@FunctionalInterface
interface MyFunction<T, U, R>
{
    public R doOperation(T t, U u);

}

public class VarCantureInLambda
{
    static String delim1 = ",";

    public static void main(String[] args)
    {
        MyFunction<String, String, String> myFun = (a, b) -> a + delim1 + b;
        System.out.println(myFun.doOperation("Ravi", "Kiran"));

        String delim2 = ";";
        final String delim3 = " ";

        myFun = (a, b) -> a + delim2 + b;
        System.out.println(myFun.doOperation("Ravi", "Kiran"));

        myFun = (a, b) -> a + delim3 + b;
        System.out.println(myFun.doOperation("Ravi", "Kiran"));

        // delim2 = ";;";
        //loval instance variables: C.E  
    }

}
