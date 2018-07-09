package com.rk.core.enums;

import java.util.EnumSet;

public class Currency2Test
{

    public static void main(String[] args)
    {
        System.out.println("Currency2 with private constructor,values and override toString() method");
        System.out.println(Currency2.DIME);
        for (Currency2 each : Currency2.values())
        {
            System.out.println(each.ordinal());
        }

        System.out.println("-----EnumSet------");
        EnumSet<Currency2> currency2EnumSet = EnumSet.allOf(Currency2.class);
        System.out.println(currency2EnumSet);

        System.out.println("Contains on EnumSet :" + currency2EnumSet.contains(Currency2.DIME));

        System.out.println("-----");
        EnumSet<Currency1> enumSet2 = EnumSet.of(Currency1.DIME, Currency1.NICKLE);
        System.out.println(enumSet2);

    }

}
