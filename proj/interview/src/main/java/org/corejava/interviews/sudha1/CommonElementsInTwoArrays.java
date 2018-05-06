package org.corejava.interviews.sudha1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class CommonElementsInTwoArrays
{

    public static void printCommonElements(int[] a, int[] b)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i] == b[j])
                {
                    sb.append(a[i] + ",");
                }
            }
        }
        System.out.println("Here, O(n^2) is the time complexity");
        System.out.println(sb.substring(0, sb.lastIndexOf(",")));
    }

    public static void printCommonElementsOptimal(int[] a, int[] b)
    {
        int c[] = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            c[a[i]] = -1;
        }
        for (int i = 0; i < b.length; i++)
        {
            if (c[b[i]] == -1)
            {
                c[b[i]] = 1;
            }
        }
        for (int i = 0; i < 10; i++)
        {
            if (c[i] == 1)
            {
                System.out.println(i);
            }
        }
        System.out.println("Here, O(m+n+10) is the time complexity ===> O(m+n)");
    }

    public static void main(String[] args)
    {
        int[] a =
        { 1, 2, 5, 6, 7, 8, 9 };
        int[] b =
        { 2, 5, 8, 3, 4,  0 };

       // printCommonElements(a, b);
       // printCommonElementsOptimal(a, b);// array elements are 0 to 9 and non negative

    }

}
