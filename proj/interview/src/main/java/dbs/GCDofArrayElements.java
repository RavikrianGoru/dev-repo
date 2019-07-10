package dbs;

public class GCDofArrayElements
{

    static int getGCD(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        return getGCD(b % a, a);
    }

    public static void main(String[] args)
    {
        int[] a =
        { 256, 34, 78568, 234 };
        int gcd = a[0];
        for (int i = 1; i < a.length; i++)
        {
            gcd = getGCD(gcd, a[i]);
        }
        System.out.println("Gcd:" + gcd);
    }

}
