package com.gfg.javabeats;

public class LargestSubCommonString
{
    static int length, start, end;

    public static void main(String[] args)
    {
        // findLargestCommonString("RaMaNa".toCharArray(), "MaRaM".toCharArray());
        // findLargestCommonString("GeeksForGeeks".toCharArray(), "GeeksQuiz".toCharArray());
        findLargestCommonString("GeeksQuiz".toCharArray(), "GeeksForGeeks".toCharArray());
    }

    public static void findLargestCommonString(char[] small, char[] big)
    {
        int m = small.length;
        int n = big.length;
        if (m > n)
        {
            findLargestCommonString(big, small);
            System.exit(0);
        }
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                doTask(small, big, i, j);
            }
        }
        printData(small); // System.out.println(String.copyValueOf(small, start, length) + "/"+length);
    }

    static void doTask(char[] small, char[] big, int i, int j)
    {
        int l = 0, s = i, e = i;
        while (i < small.length && j < big.length && small[i] == big[j])
        {
            l++;
            e++;
            i++;
            j++;
        }
        if (l > length)
        {
            length = l;
            start = s;
            end = e;
        }
    }

    static void printData(char[] small)
    {
        for (int i = start; i < end; i++)
        {
            System.out.print(small[i]);
        }
        System.out.print("/" + length);
    }
}
