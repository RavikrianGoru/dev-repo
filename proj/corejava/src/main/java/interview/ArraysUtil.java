package interview;

public class ArraysUtil
{

    /**
     * This method keeps even numbers in even possition and odd numbers in odd possition Extra even or odd numbers keeps as it is
     * 
     * @param a
     *            array name
     * @param n
     *            length of array
     */
    public static void adjustEvenOddnumbersInArray(int[] a, int n)
    {
        if (n > 1)
        {
            int evenP = 0;
            int oddP = 1;
            while (true)
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
                else
                {
                    break;
                }
            }
        }
    }

    /**
     * This method keeps all even numbers at first and odd numbers at end
     * 
     * @param a
     *            array name
     * @param n
     *            size of array
     */
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

    /**
     * This method rotates left for given inputs
     * 
     * @param a
     *            array name
     * @param d
     *            number of left rotations
     * @param n
     *            size of array
     */
    public static void leftRotate(int[] a, int d, int n)
    {
        if (d != 0)
        {
            reverseArray(a, 0, d - 1);
            reverseArray(a, d, n - 1);

            reverseArray(a, 0, n - 1);
        } // O(n)
    }

    /**
     * This method rotates right for given inputs
     * 
     * @param a
     *            array name
     * @param d
     *            number of rigth rotations
     * @param n
     *            size of array
     */
    public static void rightRotate(int[] a, int d, int n)
    {
        if (d != 0)
        {
            reverseArray(a, 0, n - 1);

            reverseArray(a, 0, d - 1);
            reverseArray(a, d, n - 1);
        } // O(n)
    }

    /**
     * THis method reverses the given array
     * 
     * @param a
     *            name of array
     * @param start
     *            start index
     * @param end
     *            end index
     */
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

    /**
     * This method print the given array by using separator.
     * 
     * @param a
     *            name of the array
     * @param separator
     *            separator for each element.
     */
    public static void printArray(int a[], String separator)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++)
        {
            sb.append(a[i]).append(separator);
        }
        System.out.println(sb.substring(0, sb.lastIndexOf(separator)).toString());
    }

    /**
     * This method do right cyclic rotate
     * 
     * @param a
     *            name of the array
     * @param d
     *            number of elements to rotate right
     * @param n
     *            size of array
     */
    public static void cyclicRotateRight(int a[], int d, int n)
    {
        int temp;
        d = d % n;
        if (n >= 2)
        {
            while (d > 0)
            {
                temp = a[n - 1];
                for (int i = n - 2; i >= 0; i--)
                {
                    a[i + 1] = a[i];
                }
                a[0] = temp;
                d--;
            } // O(n*d)
        }
    }

    /**
     * This method do left cyclic rotate
     * 
     * @param a
     *            name of the array
     * @param d
     *            number of elements to rotate left
     * @param n
     *            size of array
     */
    public static void cyclicRotateLeft(int a[], int d, int n)
    {
        int temp;
        d = d % n;
        if (n >= 2)
        {
            while (d > 0)
            {
                temp = a[0];

                for (int i = 1; i < n; i++)
                {
                    a[i - 1] = a[i];
                }
                a[n - 1] = temp;
                d--;
            }
        }
    }

    /**
     * It finds the index of given element from array
     * 
     * @param a
     *            is rotated array
     * @param start
     *            start index
     * @param end
     *            end index
     * @param element
     *            search element
     * @return if found returns index or -1
     */
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

    /**
     * It prints pair od indexes which gives sum of element =sum
     * 
     * @param a
     *            is rotated or sorted array
     * @param n
     *            size of array
     * @param sum
     *            given sum to get pair of index which gives this sum
     */
    public static void indexPairForGivenSumInRotatedArray(int a[], int n, int sum)
    {
        if (n >= 2)
        {
            // pivot element
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
                if (a[minP] + a[maxP] == sum)
                {
                    System.out.println("(" + minP + "," + maxP + ") ---> " + sum);
                    return;
                }
                if (a[minP] + a[maxP] < sum)
                {
                    minP = (minP + 1) % n;
                }
                else
                {
                    maxP = (maxP - 1 + n) % n;
                }
            }
            return;
        }
    }
}
