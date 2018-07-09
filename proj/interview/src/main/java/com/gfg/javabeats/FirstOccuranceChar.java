package com.gfg.javabeats;

public class FirstOccuranceChar
{

    public static void getFirstOcc(String input)
    {
        int[] temp = new int[26];
        int length = input.length();
        int index;
        for (int i = 0; i < length; i++)
        {
            index = input.charAt(i) % 97;
            if (temp[index] != 0)
            {
                System.out.println((char)(index+97));
                return;
            }
            temp[index] = temp[index] + 1;
        }
    }

    public static void main(String[] args)
    {
        String input = "azbfdkjhszdkfjacdbchfrda";
        getFirstOcc(input);
    }

}
