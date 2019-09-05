package asg;

public class ASG_Matrix
{
    private static void search(int[][] mat, int n, int x)
    {

        int i = 0, j = n - 1;

        while (i < n && j >= 0)
        {
            System.out.print("\n" + i + " " + j);
            if (mat[i][j] == x)
            {
                System.out.print("n Found at " + i + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }

        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }

    public static void main(String[] args)
    {

        // Given 2-d arrayor matrix
        // Elements are sorted in each row
        // Elements are sorted in each column
        // Search an element with O(m+n) in any case best/worst...
        
        int mat[][] =
        {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }

}
