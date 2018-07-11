package sorting;

public class _5_QuickSort
{

    public static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int a[], int start, int end)
    {
        int pivote = a[end];
        int pIndex = start;
        for (int i = start; i < end; i++)
        {
            if (a[i] <= pivote)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, pIndex, end);
        return pIndex;
    }

    public static void quickSort(int[] a, int start, int end)
    {
        if (start < end)
        {
            
            
            int pIndex = partition(a, start, end);// randomizedQuick sort: get random number between (start,end) and set as pivote. swap (pivote,end)
                                                  // then do the same process.
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Quick sort: Devide and conqure algo, picks pivotal elements, partion array and recursive approach");
        System.out.println("----- Time complexity: O(n log n)");
        System.out.println("Quick sort :in-place algo. it uses constant space");

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29, 8 };
        _Utils.print(a);
        quickSort(a, 0, a.length - 1);
        _Utils.print(a);
    }

}
