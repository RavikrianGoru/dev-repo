package interview;

public class SearchElementRotatedArray
{
    public static void main(String[] args)
    {
        int a[] =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 5;
        ArraysUtil.cyclicRotateRight(a, d, a.length);
        ArraysUtil.printArray(a, ",");
        int element = 3;
        int result = ArraysUtil.searchElemenInRotatedArray(a, 0, a.length - 1, element);
        if (result == -1)
        {
            System.out.println(element + " is not available");
        }
        else
        {
            System.out.println(element + " is available at " + result + " possition start from 0 index");
        }

        int sum = 12;
        ArraysUtil.indexPairForGivenSumInRotatedArray(a, a.length, sum);
    }

}
