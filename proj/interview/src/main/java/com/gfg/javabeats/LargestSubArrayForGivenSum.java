package com.gfg.javabeats;

public class LargestSubArrayForGivenSum
{
    private static int findSubArrayForGivenSum(int[] inputArray, int size, int sum)
    {
        int curr_sum = inputArray[0];
        int str = 0;
        for (int i = 1; i <= size; i++)
        {
            while (curr_sum > sum && str < i - 1)
            {
                curr_sum -= inputArray[str];
                str++;
            }
            if (curr_sum == sum)
            {
                System.out.println(str + "  " + (i - 1));
                // return 1;
            }
            if (i < size)
            {
                curr_sum += inputArray[i];
            }
        }
        return 0;
    }

    private static int findSubArrayForGivenSum1(int[] a, int size, int sum)
    {

        int start = 0, end = 0, length = a.length;
        int c_sum = 0;

        // TO-DO

        return 0;
    }

    public static void main(String[] args) throws Exception
    {
        int[] a =
        { 12, 12, 3, 1, 5, 6, 7, 8, 4 };
        int n = 9, s = 12;
        findSubArrayForGivenSum(a, n, s);
    }

}
