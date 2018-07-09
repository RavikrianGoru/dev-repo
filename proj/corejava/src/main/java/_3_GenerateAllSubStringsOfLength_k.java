
public class _3_GenerateAllSubStringsOfLength_k
{

    public static void allSubs(char[] data, String preFix, int length, int size)
    {
        if (size == 0)
        {
            System.out.println(preFix);
            return;
        }
        for (int i = 0; i < length; ++i)
        {
            String newPrefix = preFix + data[i];

            allSubs(data, newPrefix, length, size - 1);
        }
    }

    public static void main(String[] args)
    {
        char[] data = "Ravi".toCharArray();
        int size = 2;

        int length = data.length;
        String preFix = "";

        // recursive calls
        allSubs(data, preFix, length, size);

    }
}
