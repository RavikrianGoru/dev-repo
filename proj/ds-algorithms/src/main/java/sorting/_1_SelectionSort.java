package sorting;

public class _1_SelectionSort
{

    public static int[] sort(int a[], int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            int iM=i;
            for(int j=i+1;j<size;j++)
            {
                if(a[j]<a[iM])
                    iM=j;
            }
            if(i!=iM)
            {
                a[i]=a[i]+a[iM];
                a[iM]=a[i]-a[iM];
                a[i]=a[i]-a[iM];
                
            }

        }
        return a;
    }

    public static void main(String[] args)
    {
        // Selection sort with in-place algo
        // for 1st iteration select min/max the swap in 1 st possition of array.
        // for 2st iteration select min/max the swap in 2 nd possition of array..... and so on.

        // O(n2) Time complexity-Avg Case

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 };
        for (int each : a)
        {
            System.out.print(each + " ");
        }
        System.out.println();
        for (int each : sort(a, a.length))
        {
            System.out.print(each + " ");
        }

    }

}
