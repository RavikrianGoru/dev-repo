package com.careercup.progs;

public class FindDuplicateElements
{
    static void checkDuplicates(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
            {
                System.out.print(Math.abs(arr[i]) + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        //array of n elements
        // 0<element<n then find duplicate 
        //2 times of duplicate element max 
        
        int[] arr = { 1, 2, 3, 1, 3, 6, 6};
        checkDuplicates(arr, arr.length);
    }

}
