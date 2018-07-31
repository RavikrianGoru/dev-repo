package array;

public class _2_Arrays_n_D
{

    public static void main(String[] args)
    {
        int[][] a2D=new int[5][5];
        int[][][] a3D=new int[2][2][2];
        
        
        _0_ArrayUtils.print_2D_Array(a2D);
        for(int i=0;i<a2D.length;i++)
        {
            for(int j=0;j<a2D[0].length;j++)
            {
                a2D[i][j]=10;
            }
        }
        _0_ArrayUtils.print_2D_Array(a2D);
        
        
        
        
    }
}
