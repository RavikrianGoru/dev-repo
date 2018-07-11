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

        System.out.println("It is not best sorting algo but is better than selection/bubble sort.");
        System.out.println("Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.");
        System.out.println("Use : when no of elements are small");

        System.out.println("----- Time complexity: O(n^2)");
        System.out.println("----- Space complexity: constant space");

        int a[] =
        { 3, 6, 1, 9, 2, 7, 5, 5, 7, 29 };

        _Utils.print(a);
        _Utils.print(sort(a, a.length));

    }

}
