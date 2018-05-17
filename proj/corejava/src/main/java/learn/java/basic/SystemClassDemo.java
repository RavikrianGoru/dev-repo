package learn.java.basic;

public class SystemClassDemo
{
    public static void printArray(int[] array)
    {
        System.out.println("Printing Array:");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        int[] arrayOne= {1,2,3,4,5};
        int[] arrayTwo= {6,7,8,9,10};
//        printArray(arrayOne);
//        printArray(arrayTwo);
        System.out.println("Copy array from one array to another:");
        System.arraycopy(arrayOne, 0, arrayTwo, 0, 3);
        printArray(arrayOne);
        printArray(arrayTwo);
        
        System.out.println("Get current time in milli secs:"+System.currentTimeMillis());
        System.out.println("Get current time in nano secs:"+System.nanoTime());
        System.out.println("Requesting JVM to do garbage colletion:");
        System.gc();
        
        
        
        
        
    }

}
