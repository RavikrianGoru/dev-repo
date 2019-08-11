package paypal;

// expected missing element is 4
// numbers start from 1 to n only one missing number
public class FindMissingElementFrom1toN
{
    public static void main(String[] args)
    {
        int start = 1, end = 10;
        int a[] =
        { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        int sum = (end * (end + 1)) / 2;
        for (int each : a)
        {
            sum -= each;
        }
        System.out.println("Missing number:" + sum);
    }
}
