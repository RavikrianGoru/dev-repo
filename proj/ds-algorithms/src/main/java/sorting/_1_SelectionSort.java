package sorting;

import java.util.Arrays;

public class _1_SelectionSort
{
    public static int[] sort(int a[], int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            int iM = i;
            for (int j = i + 1; j < size; j++)
            {
                if (a[j] < a[iM])
                    iM = j;
            }
            if (i != iM)
            {
                a[i] = a[i] + a[iM];
                a[iM] = a[i] - a[iM];
                a[i] = a[i] - a[iM];
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println("Selection sort : in-place algo");
        System.out.println("1st iteration selects min/max and swap it in 1st posssion of array.");
        System.out.println("2nd iteration selects 2nd min/max and swap it in 2nd possision of array....... and so on.");

        System.out.println("----- Time complexity: O(n^2)");
        System.out.println("----- Space complexity: constant space");
        System.out.println("The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.");

        System.out.println("Ref: https://www.geeksforgeeks.org/selection-sort/");

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 };

        
        _Utils.print(a);//System.out.println(Arrays.toString(a));
        _Utils.print(sort(a, a.length));

    }

}
