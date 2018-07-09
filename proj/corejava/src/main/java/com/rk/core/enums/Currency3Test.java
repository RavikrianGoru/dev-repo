package com.rk.core.enums;

import java.util.EnumSet;

public class Currency3Test
{

    public static void main(String[] args)
    {
        EnumSet<Currency3> eSet = EnumSet.allOf(Currency3.class);
        for (Currency3 each : eSet)
        {
            System.out.println(each);
            each.color();
        }
    }
}
