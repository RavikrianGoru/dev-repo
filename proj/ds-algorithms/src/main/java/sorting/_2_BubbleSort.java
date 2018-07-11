package sorting;

public class _2_BubbleSort
{
    public static int[] sort(int a[], int size)
    {
        for (int i = 1; i < size; i++)// this loop is for iteraion count=no of iterations
        {
            int flag = 0;// this to identify whether elements are already sorted or not.
            for (int j = 0; j < size - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    flag = 1;
                }
            }
            if (flag == 0)
            {
                break;
            }
        }
        return a;
    }

    public static int[] recursiveSort(int a[], int size)
    {
        if (size == 1)
            return a;
        else
        {
            for (int i = 0; i < size - 1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
            return recursiveSort(a, size - 1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Bubble sort : in-place algo");
        System.out.println("Bubble sort is better than selection sort when array is already soreted then inner loop will get executed only once in this case.");

        System.out.println("----- Time complexity: O(n^2)-->worst case, O(n) in best case if array already sorted.");
        System.out.println("----- Space complexity: constant space");

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 }; // {1, 2, 3, 5, 5, 6, 7, 7, 9, 29};

        _Utils.print(a);

        System.out.println("Buble sort:iterative");
        _Utils.print(sort(a, a.length));

        System.out.println("\nBuble sort:recursive");
        _Utils.print(recursiveSort(a, a.length));

    }

}
