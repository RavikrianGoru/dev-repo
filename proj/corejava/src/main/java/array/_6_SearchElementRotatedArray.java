package array;

public class _6_SearchElementRotatedArray
{

    public static void main(String[] args)
    {
        int a[] =
        { 1, 2, 3, 4, 5, 6, 7, 8, 8, 10 };
        int d = 5;
        System.out.println("Given sorted array:");
        _0_ArrayUtils.printArray(a, ",");
        System.out.println("Ritate right by " + d + " elements");
        _0_ArrayUtils.cyclicRotateRight(a, d, a.length);
        _0_ArrayUtils.printArray(a, ",");

        int element = 9;
        int result = _0_ArrayUtils.searchElemenInRotatedArray(a, 0, a.length - 1, element);
        if (result == -1)
        {
            System.out.println(element + " is not available");
        }
        else
        {
            System.out.println(element + " is available at " + result + " possition start from 0 index");
        }

        int sum = 12;
        _0_ArrayUtils.indexPairForGivenSumInRotatedArray(a, a.length, sum);
    }

}
