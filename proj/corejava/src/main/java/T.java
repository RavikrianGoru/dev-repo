import java.util.HashSet;

public class T
{
    static int numberOfPairsHashing(int[] a, int k)
    {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();//worst case T(n)+T(1)+T(1) space complexity
        for (int i = 0; i < a.length; i++)
        {
            if (set.remove(k - a[i]))
            {
                count++;
            }
            else
            {
                set.add(a[i]);
            }
        }
        return count;
    }

    static int numberOfPairs(int[] a, int k)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        int count = 0;
        int start = 0, end = a.length - 1;
        long tempSum = 0;
        while (start <= end)
        {
            tempSum = a[start] + a[end];
            if (tempSum == k)
            {
                if (start == 0)
                {
                    count++;
                }
                else if (a[start] != a[start - 1])
                {
                    count++;
                }
                start++;
            }
            else if (tempSum < k)
            {
                start++;
            }
            else if (tempSum > k)
            {
                end--;
            }
        }
        return count;
    }

    public static void main(String[] args) throws InterruptedException
    {
        // Complete the numberOfPairs function below.
        int[] a =
        { 2, 4, 5, 1, 1, 45, 1, 46, 46, 1, 8, 46 };
        int k = 47;
        System.out.println(numberOfPairs(a, k));
        System.out.println(numberOfPairsHashing(a, k));
    }

}
