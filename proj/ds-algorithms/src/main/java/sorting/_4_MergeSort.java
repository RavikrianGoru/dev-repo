package sorting;

public class _4_MergeSort
{
    public static void doMergeSort(int a[])
    {
        // check array return noting when size of array <2
        int n = a.length;
        if (n < 2) return;

        // Find mid index of array and declare two arrays left and right with sizes mid, n-mid
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        // copy data from original array to sub arrays.
        for (int i = 0; i < mid; i++)
        {
            left[i] = a[i];
        }
        for (int i = mid; i < n; i++)
        {
            right[i - mid] = a[i];
        }

//        print(left);
//        print(right);

        // do recurssive for sub arrays.
        doMergeSort(left);
        doMergeSort(right);

        // doMerge with sorting
        doMerge(left, right, a);
    }

    public static void doMerge(int left[], int right[], int a[])
    {
        int lN = left.length;
        int rN = right.length;
        int aN = a.length;
        int i = 0, j = 0, k = 0;
        while (i < lN && j < rN)
        {
            if (left[i] <= right[j])
            {
                a[k]=left[i];
                i++;
            }else
            {
                a[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<lN)
        {
            a[k]=left[i];
            i++;
            k++;
        }

        while(j<rN)
        {
            a[k]=right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Merge sort: Devide and conqure algo and recursive approach");
        System.out.println("----- Time complexity: O(n log n)");
        System.out.println("----- Space complexity: O(n)");

        System.out.println("Merge sort : Not in-place algo. it uses O(n) space");
        
        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 };

        _0_SortingUtils.print(a);
        doMergeSort(a);
        _0_SortingUtils.print(a);

    }

}
