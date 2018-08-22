import java.awt.image.BufferedImage;

public class FindUnique_Exactly2TimesRepeatedLargeSet
{

    static char getOddTimesElement(char ar[])
    {
        int i;
        char result = 0;
        for (i = 0; i < ar.length; i++)
        {
            result = (char)(result ^ ar[i]);
        }
        return result;
    }

    public static void main(String[] args)
    {
        char a[] = new char[]
        { 'a', 'b','a','b','c','d','d','e','f','g','g','f','e'};
        System.out.println(getOddTimesElement(a));
    }

}
