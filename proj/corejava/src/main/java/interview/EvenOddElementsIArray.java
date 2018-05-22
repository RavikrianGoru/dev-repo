package interview;

public class EvenOddElementsIArray
{
    

   
    public static void main(String[] args)
    {
        int[] input= {1,2,10,4,6,8,9,11,13,17,19,21,23,25,27};
        System.out.println("Given Array:");
        ArraysUtil.printArray(input,",");
        System.out.println("Keep evens first and odds rest:");
        ArraysUtil.keeyEvensFirstOddsRest(input,input.length);
        ArraysUtil.printArray(input,",");
        
        // keep even numbers in even possition , odd numbers in odd possition
        System.out.println("Keep evens in even possition and odds in odd possition:");
        ArraysUtil.adjustEvenOddnumbersInArray(input, input.length);
        ArraysUtil.printArray(input,",");
    }

}
