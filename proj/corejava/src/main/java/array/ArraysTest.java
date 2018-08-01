package array;

import java.util.Arrays;
import java.util.List;

public class ArraysTest
{

    public static void main(String[] args)
    {
        System.out.println("Declare 1-D array of size 10");
        int a[];
        a = new int[10];
        System.out.println("1-D int arry default elements 0");
        print1D(a);

        System.out.println("Intialize 1-D int array:");
        int b[] =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        print1D(b);

        System.out.println("Declare 2-D array");
        int c[][];
        c = new int[3][3];// new int[3][];
        print2D(c);

        System.out.println("Intialize 2-D int array:");
        int d[][] =
        {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        print2D(d);
        System.out.println("Print all elemets in z shape 2-D");
        print2DZ(d);

        int e[][] =
        {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("Print all elements whic are in z shaped locations.(3*3)");
        printNDZ(d);
        System.out.println("\nPrint all elements whic are in z shaped locations.(4*4)");
        printNDZ(e);

        System.out.println("Convert string array to list");
        String[] s =
        { "Hi", "Ravi", "Kiran", "Goru" };
        List<String> sL = Arrays.asList(s);
        System.out.println(sL);
    }

    public static void printNDZ(int[][] array)
    {
        int n = array.length;
        // prints 1st row of matrix
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[0][i] + " ");
        }
        // prints diagnol of matrix
        for (int i = 1; i < n - 1; i++)
        {
            for (int j = 1; j < n - 1; j++)
            {
                if (j == n - 1 - i)
                {
                    System.out.print(array[i][j] + " ");
                    break;
                }
            }
        }
        // prints last row of matrix
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[n - 1][i] + " ");
        }
    }

    public static void print2DZ(int[][] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                if (i == 0 || i == c[i].length - 1 || i == j)
                {
                    System.out.print(c[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print2D(int[][] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print1D(int[] a)
    {
        if (a == null)
        {
            return;
        }
        if (a.length == 0)
        {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int each : a)
        {
            sb.append(each).append(",");
        }
        System.out.println("[" + sb.substring(0, sb.lastIndexOf(",")) + "]");
    }

}
