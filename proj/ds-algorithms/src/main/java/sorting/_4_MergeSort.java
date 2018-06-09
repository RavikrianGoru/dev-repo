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

    static void print(int a[])
    {
        System.out.println();
        StringBuffer sb = new StringBuffer();
        for (int each : a)
        {
            sb.append(each).append(" ");
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args)
    {

        // Merge sort- O(n logn) in worst case it used recursive methods.
        // devide and conquer : dive the problem into sub problems and recursive approaches.
        // it not in-place algo: we create extra spaces and space complexity O(n)
        // time complexity O(n log n)

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 };
        for (int each : a)
        {
            System.out.print(each + " ");
        }

        doMergeSort(a);
        print(a);

    }

}
