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

    public static void main(String[] args)
    {
        // Bubble sort with in-place algo
        // Buble sort is better one compare to Selection sort when element are already sorted. inner loop will get executed only once in this case.
        // O(n2) Time complexity-Avg Case
        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 }; // {1, 2, 3, 5, 5, 6, 7, 7, 9, 29};
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
