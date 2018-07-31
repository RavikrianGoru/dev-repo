package array;

public class _4_EvenOddElementsInArray
{

    public static void main(String[] args)
    {
        int[] input =
        { 1, 2, 10, 4, 6, 8, 9, 11, 13, 17, 19, 21, 23, 25, 27 };

        System.out.println("Given Array:");
        _0_ArrayUtils.printArray(input, ",");
        
        System.out.println("Keep evens first and odds rest:");
        _0_ArrayUtils.keeyEvensFirstOddsRest(input, input.length);
        _0_ArrayUtils.printArray(input, ",");

        System.out.println("Keep evens in even possition and odds in odd possition:");
        _0_ArrayUtils.adjustEvenOddnumbersInArray(input, input.length);
        _0_ArrayUtils.printArray(input, ",");
    }

}
