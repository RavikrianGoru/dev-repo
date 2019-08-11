package array;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class _2_Arrays_n_D
{

    public static void main(String[] args)
    {
        int[][] a2D=new int[5][5];
        int[][][] a3D=new int[2][2][2];
        
        
//        _0_ArrayUtils.print_2D_Array(a2D);
        for(int i=0;i<a2D.length;i++)
        {
            for(int j=0;j<a2D[0].length;j++)
            {
                a2D[i][j]=10;
            }
        }
//        _0_ArrayUtils.print_2D_Array(a2D);
        
        int [][] a= {
                {1,3,5},
                {3,6,9},
                {7,2,8}
        };

        int max=a[0][0];
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                max=max<a[i][j]?a[i][j]:max;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(max);
        
        
    }
}
