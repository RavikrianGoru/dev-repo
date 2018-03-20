package org.corejava.interviews;

public class LenghtOfString
{

    public static void main(String[] args)
    {

        String input = "Ravikiran Goru";
        System.out.println("Length with built-in method:" + input.length());

        int i = 0, length = 0;
        try
        {
            while (true)
            {
                input.charAt(i);                
                length++;
                i++;
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            System.out.println("Length:" + length);
        }

    }

}
