public class _3_GenerateAllSubStrings
{

    public static void main(String[] args)
    {
        String data = "RavikiranGoru";
        char[] a = data.toCharArray();
        printAllSbus(a);
    }

    public static void printAllSbus(char[] a)
    {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j <= a.length; j++)
            {
                print(a, i, j);
                count++;
                System.out.println();
            }
        }
        System.out.println("Total number of sub strings:" + count);
    }

    public static void print(char[] a, int i, int j)
    {
        while (i < j)
        {
            System.out.print(a[i]);
            i++;
        }
    }
}
