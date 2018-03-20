package org.corejava.interviews;

public class StringPallindrome
{

    private static void isPallindrome(String input)
    {
        int low = 0, high = input.length() - 1;
        boolean flag = true;
        while (low <= high)
        {
            if (input.charAt(low) != input.charAt(high))
            {
                flag = false;
                break;
            }
            low++;
            high--;
        }
        if (flag)
        {
            System.out.println("Given input: " + input + " is pallindrome");
        }
        else
        {
            System.out.println("Given input: " + input + " is not pallindrome");
        }
    }

    public static void main(String[] args)
    {
        // raviivar, ravivar, 123321, 1234321
        // fdfsdjfl ravikrian

        isPallindrome("1234321");
        isPallindrome("12344321");
        isPallindrome("123443219");
    }

}
