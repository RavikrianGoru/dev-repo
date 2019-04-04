package com.rk.java.guava;

public class Test
{
    private static final Runtime runTime=Runtime.getRuntime();
    public static void main(String[] args)
    {
        System.out.println(runTime.freeMemory());
        String s=new String("ravi");
        runTime.runFinalization();
        System.out.println(runTime.freeMemory());
        
    }

}
