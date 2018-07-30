package array;

public class _0_ArrayUtils
{
    public static void printArray(int[] array)
    {
        System.out.print("[");
        for (int x : array)
            System.out.print(x + " ");
        System.out.print("]");
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
