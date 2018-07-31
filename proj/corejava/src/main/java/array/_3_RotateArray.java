package array;

public class _3_RotateArray
{

    public static void main(String[] args)
    {
        int a[] =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int rotateN = 12;

        System.out.println("Left rotate by " + rotateN);
        rotateN = rotateN % a.length;
        _0_ArrayUtils.leftRotate(a, rotateN, a.length);// Reversal Algo

        _0_ArrayUtils.printArray(a, ",");
        System.out.println("\nRight rotate by " + rotateN);
        _0_ArrayUtils.rightRotate(a, rotateN, a.length);// Reversal Algo
        _0_ArrayUtils.printArray(a, ",");

        int d = 2;
        System.out.println("\nCyclic Rotate Right rotate by " + d);
        _0_ArrayUtils.cyclicRotateRight(a, d, a.length);// Cyclic Algo
        _0_ArrayUtils.printArray(a, ",");
        System.out.println("\nCyclic Rotate Left rotate by " + d);
        _0_ArrayUtils.cyclicRotateLeft(a, d, a.length);// Cyclic Algo
        _0_ArrayUtils.printArray(a, ",");
    }

}
