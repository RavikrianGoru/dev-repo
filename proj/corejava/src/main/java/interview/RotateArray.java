package interview;

public class RotateArray
{
    public static void main(String[] args)
    {
        int a[] =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int leftR = 12;
        ArraysUtil.printArray(a,",");
        System.out.println();
        System.out.println("Left rotate by " + leftR);
        leftR = leftR % a.length;

        ArraysUtil.leftRotate(a, leftR, a.length);
        ArraysUtil.printArray(a,",");
        System.out.println("\nRight rotate by " + leftR);
        ArraysUtil.rightRotate(a, leftR, a.length);
        ArraysUtil.printArray(a,",");
        
        int d=5;
        System.out.println("\nCyclic Rotate Right rotate by " + d);
        ArraysUtil.cyclicRotateRight(a,d,a.length);
        ArraysUtil.printArray(a,",");
        System.out.println("\nCyclic Rotate Left rotate by " + d);
        ArraysUtil.cyclicRotateLeft(a,d,a.length);
        ArraysUtil.printArray(a,",");
    }

}
