package org.corejava.interviews;

public class ConvertStringToInt
{
    private static void convert(String input)
    {
        try
        {
            int i = Integer.parseInt(input);
            System.out.println("Converted value:" + i);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    private static void stringToInt(String input)
    {
        // 12340 and -12340, 12345 and -12345
        boolean signFlag = false;
        int index = 0, number = 0, length = input.length() - 1;

        if (input.charAt(0) == '-')
        {
            signFlag = true;
            index = 1;
        }

        while (index <= length)
        {
            number *= 10;
            number += (input.charAt(index) - '0');
            index++;
        }

        if (signFlag)
        {
            number = (-1) * number;
        }
        System.out.println("Converted number:" + number);
    }

    public static void main(String[] args)
    {
        convert("1000");
        stringToInt("123450");
        stringToInt("-123450");
    }
}
