package org.corejava.interviews;

import java.util.HashMap;

public class CountNumberOfCharsInString
{

    public static void main(String[] args)
    {
        System.out.println("So 125-30 is our array size.");
        String input = "Hi, This is ravikiran goru. Please find occurrences of each charactor form given input data";
        charOccurrencesByMap(input);
        charOccurrenceByArray(input);
    }

    private static void charOccurrenceByArray(String input)
    {
        
        byte[] byteArray=new byte[125];
        
        byte temp;
        for(int i=0;i<input.length();i++)
        {
            temp=(byte)input.charAt(i);
            if(byteArray[temp]==0)
            {
                byteArray[temp]=1;
            }else
            {
                byteArray[temp]=(byte)(byteArray[temp]+1);
            }
        }
        for(int i=0;i<byteArray.length;i++)
        {
            byte temp1=byteArray[i];
            if(temp1!=0)
            {
                System.out.println((char)i +"    "+temp1);
            }
        }
    }
    
    private static void charOccurrencesByMap(String input)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++)
        {
            if (hashMap.containsKey(input.charAt(i)))
            {
                hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)) + 1);
            }
            else
            {
                hashMap.put(input.charAt(i), 1);
            }
        }
        System.out.println(hashMap);
    }

}
