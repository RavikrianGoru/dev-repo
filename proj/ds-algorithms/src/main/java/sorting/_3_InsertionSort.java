package sorting;

public class _3_InsertionSort
{
    public static int[] sort(int a[], int size)
    {
        for (int i = 1; i < size; i++)
        {
            int value = a[i];
            int index = i;
            while (index > 0 && a[index - 1] > value)
            {
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
        return a;
    }

    public static void main(String[] args)
    {

        // It is not best algo but it is better than selection / bubble sort.
        // array divided as sorted part and unsorted part.
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
