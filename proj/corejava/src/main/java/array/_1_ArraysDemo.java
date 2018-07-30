package array;

public class _1_ArraysDemo
{

    public static void main(String[] args)
    {
        // Declaring array literal
        int array1[] = new int[] { 100,25,300,450};
        int array2[] = { 100, 30, 4, 210, 5 };
        int array3[] = new int[3];
        
        Class c = array1.getClass();
        System.out.println("Array class Name:" + c.getName());
        
        System.out.println("\nArray elements:");
                _0_ArrayUtils.printArray(array1);
        System.out.println("\nMin element of above array:");
        System.out.println(_0_ArrayUtils.minElementOfArray(array1));

        

       
        System.arraycopy(array1, 1, array3, 0, 3);

        System.out.println("Array elements:");
        _0_ArrayUtils.printArray(array3);
    }

}
