package com.udemy.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuiltInFunctionalInterfaces
{

    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10));
        l.stream().forEach(x -> {
            if (x % 5 == 0)
            {
                System.out.print("Boom");
            }
            else
            {
                for (int i = 1; i <= x; i++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        });
    }

}
