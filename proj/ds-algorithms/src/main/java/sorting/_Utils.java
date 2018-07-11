package sorting;

import java.util.Arrays;

public class _Utils
{
    /**
     * We can use System.out.print(Arrays.toString(a));
     * 
     * This method prints data of array (int type)
     * @param a
     */
    public static void print(int a[])
    {
        System.out.println();
        StringBuffer sb = new StringBuffer();
        for (int each : a)
        {
            sb.append(each).append(" ");
        }
        System.out.print(sb.toString());
    }

}
