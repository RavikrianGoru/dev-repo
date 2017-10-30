package javatpoint.arithmetic;

public class PimeNumber
{

    public static void main(String[] args)
    {
        primeTest(-30);
        primeTest(151);
        primeTest(29);
    }

    public static void primeTest(int num)
    {
        boolean flag = true;
        if (num <= 1)
        {
            System.out.println("Given number " + num + " is not prime");
            flag = false;
        }
        else if (num == 2)
        {
            flag = true;
        }
        else
        {
            int m = num / 2;
            for (int i = 2; i <= m; i++)
            {
                if (num % m == 0)
                {
                    System.out.println("Given number " + num + " is not prime");
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
        {
            System.out.println("Given number " + num + " is prime");
        }
    }
}
