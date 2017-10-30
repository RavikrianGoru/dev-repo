package javatpoint.arithmetic;

public class FactorialNumber
{
    static long fact = 1;

    public static void main(String[] args)
    {
        fact = 1;
        factorial(-50);

        fact = 1;
        factorial(0);

        fact = 1;
        factorial(5);

        fact = 1;
        factorial(10);

    }

    public static void factorial(int n)
    {
        if (n < 0)
        {
            System.out.println("Given number " + n + " is invalid input for factorial");
        }
        else if (n == 0 || n == 1)
        {
            System.out.println("fact(" + n + ")=" + 1);
        }
        else
        {
            // System.out.println("fact("+n+")="+factorialLoop(n));
            System.out.println("fact(" + n + ")=" + factorialRecursion(n));
        }
    }

    public static long factorialLoop(int n)
    {
        while (n > 0)
        {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static long factorialRecursion(int n)
    {
        if (n > 0)
        {
            fact = n * factorialRecursion(n - 1);
        }
        return fact;
    }
}
