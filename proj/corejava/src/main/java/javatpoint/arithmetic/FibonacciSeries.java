package javatpoint.arithmetic;

public class FibonacciSeries
{
    static int n1 = 0, n2 = 1, n3;

    public static void main(String[] args)
    {
        // Fibonacci series without recursion
        int count = 10;

        System.out.println("Fibonacci series for given input n:" + count);
        if (count < 1)
        {
            System.out.println("Invalid input :" + count);
        }
        else
        {
            switch (count)
            {
                case 1:
                    System.out.println(0);
                    break;
                case 2:
                    System.out.println(0 + " " + 1);
                    break;
                default:
                    System.out.print(0 + " " + 1);
                    count -= 2;
                    // fibonacci(count);
                    fibonacciRecursion(count);
                    System.out.println();
            }
        }

    }

    private static void fibonacci(int count)
    {
        while (count > 0)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            count--;
        }
    }

    private static void fibonacciRecursion(int count)
    {
        if (count > 0)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            fibonacciRecursion(count - 1);
        }
    }
}
