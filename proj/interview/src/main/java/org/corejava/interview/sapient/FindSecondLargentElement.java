package org.corejava.interview.sapient;

public class FindSecondLargentElement
{

    public static void find2ndLarge(int[] a)
    {
        int max=0,sMax=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                sMax=max;
                max=a[i];
            }
        }
        System.out.println("Second Max---O(n):"+sMax);
    }
    public static void main(String[] args)
    {
        int a[]= {2,3,1,23,5,6,2,11,67};
        find2ndLarge(a);
    }

}
