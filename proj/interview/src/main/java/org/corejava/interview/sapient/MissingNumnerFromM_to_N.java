package org.corejava.interview.sapient;

public class MissingNumnerFromM_to_N
{

    public static void findMissingNumfromMtoN(int a[], int m, int n)
    {
        // numbers from m to n(1 to 10)
        // missing number =3
        // usig XOR oprerator
        int temp = m;
        int length = a.length;
        for (int i = m + 1; i <= n; i++)
        {
            temp ^= i;
        }
        for (int i = 0; i < length; i++)
        {
            temp ^= a[i];
        }
        System.out.println("Missing number:" + temp);
        System.out.println("Time Complexity: O(n)+O(n+1) = O(n) but two for loops");
        System.out.println("Space complexity: O(1)");
    }

    public static void findMissingNumfromMtoNSingleLoop(int a[], int m, int n)
    {
        // numbers from m to n(1 to 10)
        // missing number =3
        // usig XOR oprerator
        int temp = m;
        int i = 0, j = m + 1;
        int length = a.length;
        while (i < length)
        {
            temp ^= a[i];
            i++;
            if (j <= n)
            {
                temp ^= j;
                j++;
            }
        }
        System.out.println("Missing number:" + temp);
        System.out.println("Time Complexity: O(n)+O(n+1) = O(n) with single loops");
        System.out.println("Space complexity: O(4)");
    }

    public static void main(String[] args)
    {
        int a[] =
        { -3, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

         findMissingNumfromMtoN(a, -3, 10);
         findMissingNumfromMtoNSingleLoop(a, -3, 10);
    }

}
