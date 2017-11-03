package javatpoint.progs;

public class PalindromeNumber
{

    public static void main(String[] args)
    {
        palindromeTest(-59);
        palindromeTest(0);
        palindromeTest(9);
        palindromeTest(10);
        palindromeTest(93239);
    }

    public static void palindromeTest(int n)
    {
        if (n < 0)
        {
            System.out.println("Given number " + n + " is not palindrome");
        }
        else if (n < 10)
        {
            System.out.println("Given number " + n + " is palindrome");
        }
        else
        {
            int tmp = n, sum = 0;
            while (n > 0)
            {
                sum = (sum * 10) + n % 10;
                n = n / 10;
            }
            if (tmp == sum)
            {
                System.out.println("Given number " + tmp + " is palindrome");
            }
            else
            {
                System.out.println("Given number " + tmp + " is not palindrome");
            }
        }
    }
}
