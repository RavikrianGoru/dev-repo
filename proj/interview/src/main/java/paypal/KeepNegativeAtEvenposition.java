package paypal;

// output: 1,-45,4,-3,7,-7,8,-76,25,87}
public class KeepNegativeAtEvenposition
{
    public static void main(String[] args)
    {
        int[] a = { 1, 4, 7, 8, 25, 87, -45, -3, -7, -76};
        boolean flagP=false, flagN=false;
        int p=0, n=1;
        int l=a.length;
        while(p<l && n<l)
        {
            if(a[p]<0)
            {
                flagP=true;
            }else
            {
                p+=2;
            }
            if(a[n]>=0)
            {
                flagN=true;
            }else
            {
                n+=2;
            }
            if(p<l && n<l && flagP && flagN)
            {
                a[p]=a[p]+a[n];
                a[n]=a[p]-a[n];
                a[p]=a[p]-a[n];
            }
        }
        for(int each:a)
        {
            System.out.print(each+" ");
        }
    }

}
