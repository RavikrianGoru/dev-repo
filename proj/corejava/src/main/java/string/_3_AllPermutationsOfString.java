package string;
public class _3_AllPermutationsOfString
{
    static int count = 0;

    public static void main(String[] args)
    {
        String data = "ABC";
        permute(data, 0, data.length() - 1);
    }

    public static void permute(String str, int l, int r)
    {
        if (l == r)
        {
            count++;
            System.out.println("Count :" + count + " " + str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String data, int i, int j)
    {
        if (i != j)
        {
            char a[] = data.toCharArray();
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            return String.valueOf(a);
        }
        else
        {
            return data;
        }

    }
}
