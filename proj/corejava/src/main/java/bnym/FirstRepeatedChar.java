package bnym;

public class FirstRepeatedChar
{

    public static void main(String[] args)
    {
        // absolutebalderDash--->a
        // abcba---->a
        String name="absolutebalderDash";
        char c=findFirstRepeatedChar(name);
        System.out.println(c);
    }

    public static char findFirstRepeatedChar(String name)
    {
        char[] a =name.toCharArray();
        for(int i=0; i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    return a[i];
            }
        }
        return ' ';
    }
}
