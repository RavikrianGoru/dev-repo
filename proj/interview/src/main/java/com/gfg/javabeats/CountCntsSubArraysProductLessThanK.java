package com.gfg.javabeats;

import java.util.HashMap;

public class CountCntsSubArraysProductLessThanK
{
    public static void main(String[] args)
    {
        int a[] =
        { 1, 9, 2, 8, 6, 4, 3 };
        int k = 100;

        int i = 0;
        int length = a.length;
        int count = 0;
        while (i < length)
        {
            if (a[i] < k)
            {
                int j = i;
                int product = a[j];
                while (product < k)
                {
                    count++;
//                     print(a, j, i);
                    j--;
                    if (j < 0)
                        break;
                    product *= a[j];
                }
            }
            i++;
        }
        System.out.println("\nCount: " + count);
    }

    public static void print(int a[], int j, int i)
    {
        System.out.print("[");
        while (j <= i)
        {
            System.out.print(" "+a[j]);
            j++;
        }
        System.out.print("]");
    }
}
