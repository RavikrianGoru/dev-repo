import java.nio.charset.Charset;

public class StringDemo
{

    public static void main(String[] args)
    {

        String str1 = "ravi";
        String str2 = new String("Ravi");

        byte byteArray[] ={ 82, 97, 118, 105 };
        String str3 = new String(byteArray);
        System.out.println(str3);

        String str4 = new String(byteArray, Charset.defaultCharset());
        System.out.println(str4);

        String str5 = new String(byteArray, 2, 2);
        System.out.println(str5);

        String inputOne = "RavikiranGoru";
        String inputTwo = "GorUChinna";
        System.out.println(inputOne.regionMatches(true, 9, inputTwo, 0, 4));
        System.out.println(inputOne.regionMatches(false, 9, inputTwo, 0, 4));
    }

}
