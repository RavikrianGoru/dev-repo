package array;

import java.util.Arrays;

public class _0_ArrayUtils
{
    // This method is ||y to Arrays.toString(array);
    public static void printArray(int a[], String separator)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++)
        {
            sb.append(a[i]).append(separator);
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void leftRotate(int[] a, int d, int n)
    {
        if (d != 0)
        {
            reverseArray(a, 0, d - 1);// 1st part
            reverseArray(a, d, n - 1);// 2nd part

            reverseArray(a, 0, n - 1);// full
            System.out.println("---------------------");
        } // O(n)
    }

    public static void rightRotate(int[] a, int d, int n)
    {
        if (d != 0)
        {
            reverseArray(a, 0, n - 1);// full

            reverseArray(a, 0, d - 1);// 1st part
            reverseArray(a, d, n - 1);// 2nd part
        } // O(n)
    }

    public static void reverseArray(int[] a, int start, int end)
    {
        while (start < end)
        {
            a[start] = a[start] + a[end];
            a[end] = a[start] - a[end];
            a[start] = a[start] - a[end];
            start++;
            end--;
        }
    }

    public static void cyclicRotateRight(int a[], int d, int n)
    {
        if (n >= 2)
        {
            int temp;
            d = d % n;
            for (int i = n - 1, j = i - d; j >= 0; i--, j--)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    public static void cyclicRotateLeft(int a[], int d, int n)
    {
        if (n >= 2)
        {
            int temp;
            d = d % n;
            for (int i = d, j = i - d; i < a.length; i++, j++)
            {
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void adjustEvenOddnumbersInArray(int[] a, int n)
    {
        if (n > 1)
        {
            int evenP = 0;
            int oddP = 1;
            while (evenP < n && oddP < n)
            {
                while (evenP < n && a[evenP] % 2 == 0)
                    evenP += 2;
                while (oddP < n && a[oddP] % 2 == 1)
                    oddP += 2;
                if (evenP < n && oddP < n)
                {
                    a[evenP] = a[evenP] + a[oddP];
                    a[oddP] = a[evenP] - a[oddP];
                    a[evenP] = a[evenP] - a[oddP];
                }
            }
        }
    }

    public static void keeyEvensFirstOddsRest(int[] a, int n)
    {
        if (n > 1)
        {
            int left = 0, right = n - 1;
            while (left < right)
            {
                while (a[left] % 2 == 0 && left < right)
                    left++;

                while (a[right] % 2 != 0 && left < right)
                    right--;

                if (left < right)
                {
                    a[left] = a[left] + a[right];
                    a[right] = a[left] - a[right];
                    a[left] = a[left] - a[right];
                }
            }
        }
    }

    public static int searchElemenInRotatedArray(int a[], int start, int end, int element)
    {
        if (start > end)
        {
            return -1;
        }
        else
        {
            int mid = (start + end) / 2;
            if (a[mid] == element)
            {
                return mid;
            }
            if (a[start] <= a[mid])
            {
                if (element >= a[start] && element <= a[mid])
                {
                    return searchElemenInRotatedArray(a, start, mid - 1, element);
                }
                return searchElemenInRotatedArray(a, mid + 1, end, element);
            }

            if (element >= a[mid] && element <= a[end])
            {
                return searchElemenInRotatedArray(a, mid + 1, end, element);
            }
            return searchElemenInRotatedArray(a, start, mid - 1, element);
        }
    }

    public static void indexPairForGivenSumInRotatedArray(int a[], int n, int sum)
    {
        if (n >= 2)
        {
            // pivot element: identify min and max elements index
            int pivot;
            for (pivot = 0; pivot < n - 1; pivot++)
            {
                if (a[pivot] > a[pivot + 1])
                    break;
            }
            int minP = (pivot + 1) % n;
            int maxP = pivot;

            while (minP != maxP)
            {
                int tempSum=a[minP] + a[maxP];
                
                if (tempSum == sum)
                {
                    System.out.println("Elements (" + a[minP] + "," + a[maxP] + ") ---> " + sum);
                    System.out.println("indexes (" + minP + "," + maxP + ") ---> " + sum);
                    return;
                }
                if (tempSum < sum)
                {
                    minP = (minP + 1) % n;//key point
                }
                else
                {
                    maxP = (maxP - 1 + n) % n;//key point
                }
            }
            return;
        }
    }

    public static void update_1D_Array(int[] array, int d)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * d;
        }
    }

    public static void print_2D_Array(int[][] a2D)
    {
        for (int i = 0; i < a2D.length; i++)
        {
            System.out.print("|");
            for (int j = 0; j < a2D[0].length; j++)
            {
                System.out.print(a2D[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static int minElementOfArray(int[] ary)
    {
        int min = ary[0];
        for (int i = 1; i < ary.length; ++i)
            if (min > ary[i])
                min = ary[i];
        return min;
    }

}
