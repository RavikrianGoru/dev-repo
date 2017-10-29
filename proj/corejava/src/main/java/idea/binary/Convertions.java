package idea.binary;

public class Convertions
{

    public static final int BINARY = 2;

    public static String convert(int num, int base)
    {
        // Array initialization
        int[] intBits = new int[32];
        boolean isNegative = (num < 0) ? true : false;
        if (isNegative)
        {
            // System.out.println("Given number is Negavtive number:"+num);
            num *= -1;
            binaryForm(num, base, intBits);
            one_s_complement(intBits);
            int add = 1;
            addBinaryOne(intBits, add);
            return print(intBits);
        }
        else
        {
            binaryForm(num, base, intBits);
            return print(intBits);
        }
    }

    private static int[] addBinaryOne(int[] intBits, int add)
    {
        for (int i = intBits.length - 1; i > 0; --i)
        {
            if ((intBits[i] + add) == 2)
            {
                intBits[i] = 0;
            }
            else
            {
                intBits[i] = 1;
                break;
            }
        }
        return intBits;
    }

    private static String print(int[] intBits)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < intBits.length; ++i)
        {
            sb.append(intBits[i]);
        }
        return sb.toString();
    }

    private static int[] one_s_complement(int[] intBits)
    {
        for (int i = 0; i < intBits.length; ++i)
        {
            intBits[i] = (intBits[i] == 1) ? 0 : 1;
        }
        return intBits;
    }

    private static int[] binaryForm(int num, int base, int[] intBits)
    {
        for (int i = intBits.length - 1; i > 0 && num > 0; --i)
        {
            intBits[i] = num % base;
            num /= base;
        }
        return intBits;
    }

}
