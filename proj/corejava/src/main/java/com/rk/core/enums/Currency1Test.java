package com.rk.core.enums;

public class Currency1Test
{

    public static void main(String[] args)
    {
        System.out.println("Enum with out values-----------------------Currency1----------------------");
        // Currency1 currencyObj0=0;//"RAVI"; //Compile time error
        Currency1 currencyObj1 = Currency1.PENNY;
        currencyObj1=Currency1.DIME;
        
        System.out.println("Currency Obj1: " + currencyObj1);
        for (Currency1 each : Currency1.values())
        {
            System.out.println("Each onj: " + each);
        }
    }

}
