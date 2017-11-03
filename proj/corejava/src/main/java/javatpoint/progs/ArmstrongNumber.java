package javatpoint.progs;

public class ArmstrongNumber
{

    public static void main(String[] args)
    {
        // 153,370,371,0,1 sum of digits^3
        armstrongTest(0);
        armstrongTest(1);
        armstrongTest(5);
        armstrongTest(153);
        armstrongTest(370);
        armstrongTest(371);
        armstrongTest(372);
    }

    public static void armstrongTest(int n)
    {
        int temp = n, sum = 0, digit;
        while (n > 0)
        {
            digit = n % 10;
            sum += (digit * digit * digit);
            n = n / 10;
        }
        if (sum == temp)
        {
            System.out.println("Given number " + temp + " is armstrong");
        }
        else
        {
            System.out.println("Given number " + temp + " is not armstrong");
        }

    }
}
