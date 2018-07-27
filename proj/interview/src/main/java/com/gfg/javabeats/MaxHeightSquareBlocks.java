package com.gfg.javabeats;

public class MaxHeightSquareBlocks
{

    public static void main(String[] args)
    {
        /*
         * 1 (1,2) 2 (3,5) 3 (6,9) 4 (10,14) 5 (15,20) 6 (21,27) 7 (28,35) 8 (36,44) 9 (45,54) 10 (55,65)
         */
        
         int a=12;//10//12 
         getMaxHeight(a);//My Logic
       //0  getMaxH(a);//Abhi Logic
    }
    public static void getMaxHeight(int a)
    {
        int i = (int) Math.sqrt(a);//1;
        int temp = a * 2;
        while (true)
        {
            if (i * (i + 1) <= temp)
            {
                i = i + 1;
                continue;
            }
            else
            {
                System.out.println("Max Height=" + (i - 1));
                break;
            }
        }
    }
    public static void getMaxH(int n)
    {
        int i = 1, val = 1;
        while (true)
        {
            val = getMaxStrCase(i);

            if (val == n)
            {
                System.out.println(i);
                break;
            }
            else if (val > n)
            {
                System.out.println(i - 1);
                break;
            }
            else
                i++;

        }
    }

    static int getMaxStrCase(int n)
    {
        return (n * (n + 1) / 2);
    }

   
}
