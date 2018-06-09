package com.careercup.progs;

public class SubarrayProductLessThanK
{

    public static void allSubarraysProductLessThanK(int a[], int length, int k)
    {
        int count = 0;
        for (int i = 0; i < length; i++)
        {
            long product = 1;
            for (int j = i; j < length; j++)
            {
                product *= a[j];
                if (product < k)
                {
                    print(a, i, j);
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("Total number of subs where product<k: " + count);
        System.out.println("Timecomplexity: O(n^3)");
    }

    public static void print(int[] a, int start, int end)
    {
        StringBuilder br = new StringBuilder();
        for (int i = start; i <= end; i++)
        {
            br.append(a[i] + " ");
        }
        System.out.println("[" + br.toString().trim() + "]");
    }

    public static void findSubsProductLessThanK(int a[], int length, int k)
    {
        int count = 0;
        if (a != null && length != 0)
        {
            int start = 0, end = 1;
            long product = 1;
            while (start <= end && end <= length)
            {
                product *= a[start];
                if (product < k)
                {
                    System.out.print(a[start] + " ");
                    count++;
                    start++;
                }
            }
        }
        System.out.println("Total number of subs where product<k: " + count);
    }

    public static void main(String[] args)
    {
        int k = 100;
        int a[] =
        { 2, 50,200,100,23,45 };

         allSubarraysProductLessThanK(a, a.length, k);
//        findSubsProductLessThanK(a, a.length, k);
    }

}
