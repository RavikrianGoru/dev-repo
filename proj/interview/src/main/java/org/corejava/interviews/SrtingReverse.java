package org.corejava.interviews;

public class SrtingReverse
{

    private static void reverse(String input)
    {
        int length=input.length();
        char[] charArray= new char[length];
        for(int i=length-1,index=0;i>=0;i--,index++)
        {
            charArray[index]=input.charAt(i);
        }
        System.out.println(charArray);
    }
    
    public static void main(String[] args)
    {
        reverse("Ravikiran Goru");
    }

}
