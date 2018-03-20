package org.corejava.interviews;
import java.util.Arrays;

public class RepeatedCharsInString
{

    public static void findUniqueChars(String inputData)
    {
        char[] input = inputData.toCharArray();
        char[] tempArray = inputData.toCharArray();
        char[] uniqueChars = new char[tempArray.length];
        int[] occurrenceChar = new int[tempArray.length];
        for (int itr1 = 0, i = 0; itr1 < tempArray.length; itr1++)
        {
            boolean flag = false;
            char temp = tempArray[itr1];
            int a = 0;
            for (int itr2 = itr1; itr2 < tempArray.length; itr2++)
            {
                if (temp == tempArray[itr2] && temp != '\0')
                {
                    a++;
                    tempArray[itr2] = '\0';
                    flag = true;
                }
            }
            if (flag)
            {
                uniqueChars[i] = temp;
                occurrenceChar[i] = a;
                i++;
            }
        }

        System.out.println(Arrays.toString(input)+" : Input char Array");
        System.out.println(Arrays.toString(uniqueChars)+" : Unique char Array");
        System.out.println(Arrays.toString(occurrenceChar)+" : Occurrence char Array");

        maxOccurredCharS(uniqueChars, occurrenceChar);
        minOccurredCharS(uniqueChars, occurrenceChar);
        secondMaxOccurredCharS(uniqueChars, occurrenceChar);
        secondMinOccurredCharS(uniqueChars, occurrenceChar);
    }

    public static void maxOccurredCharS(char[] uniqueChars, int[] occurrenceChar)
    {
        int max = 0;
        for (int i = 0; i < occurrenceChar.length; i++)
        {
            if (max < occurrenceChar[i])
            {
                max = occurrenceChar[i];
            }
        }
        System.out.println("The following chars occured " + max + " times");
        for (int i = 0; i < uniqueChars.length; i++)
        {
            if (occurrenceChar[i] == max)
            {
                System.out.println("" + uniqueChars[i]);
            }
        }
    }

    public static void minOccurredCharS(char[] uniqueChars, int[] occurrenceChar)
    {
        System.out.println("The following chars occured 1 time");
        for (int i = 0; i < uniqueChars.length; i++)
        {
            if (occurrenceChar[i] == 1)
            {
                System.out.println("" + uniqueChars[i]);
            }
        }
    }

    public static void secondMaxOccurredCharS(char[] uniqueChars, int[] occurrenceChar)
    {
        int max = 0, secondMax = 0;
        for (int i = 0; i < occurrenceChar.length; i++)
        {
            int tmp = occurrenceChar[i];
            if (tmp > max)
            {
                secondMax = max;
                max = tmp;
            }
            else if (tmp > secondMax && tmp != max)
            {
                secondMax = tmp;
            }
        }
        System.out.println("Max occrrence is " + max);
        System.out.println("Second Max occrrence is " + secondMax);
        for (int i = 0; i < uniqueChars.length; i++)
        {
            if (occurrenceChar[i] == secondMax)
            {
                System.out.println("" + uniqueChars[i]);
            }
        }
    }

    public static void secondMinOccurredCharS(char[] uniqueChars, int[] occurrenceChar)
    {
        int min = occurrenceChar[0], secondMin = occurrenceChar[0];
        for (int i = 0; i < occurrenceChar.length; i++)
        {
            int tmp = occurrenceChar[i];
            if (tmp < min && tmp != 0)
            {
                secondMin = min;
                min = tmp;
            }
            else if (tmp < secondMin && tmp != 0 && tmp != min)
            {
                secondMin = tmp;
            }
        }
        System.out.println("Min occrrence is " + min);
        System.out.println("Second Min occrrence is " + secondMin);
        for (int i = 0; i < uniqueChars.length; i++)
        {
            if (occurrenceChar[i] == secondMin)
            {
                System.out.println("" + uniqueChars[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        String inputData = "goru ravikiran goru";
        RepeatedCharsInString.findUniqueChars(inputData);
    }

}
