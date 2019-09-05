package nielsen;

public class StairsClimbs
{

    public static void main(String[] args)
    {
        // 10 stairs, you can climb 1 or 2 steps at a time.
//        System.out.println(getDifferentWaysToClimbStairs(10+1, 2));
        
        System.out.println(f2(10));
    }

    /*
    
    1       1
        
    2       1 1
            2
    
    3       1 1 1
            2 1
            1 2

    4       1 1 1 1
            2 1 1
            1 2 1
            1 1 2
            2 2
            

    Here, no of Way for 4 stairs = no of ways for 3 stairs + no of ways for 2 stairs.
    
     */
    public static long f2(int n)
    {
        if(n == 1 || n == 2)
            return n;
        else
        {
            return f2(n-1) + f2(n-2);
        }
        
    }
    
    public static long getDifferentWaysToClimbStairs(int n, int maxClimbs)
    {
        long results = 0;
        if (n <= 1)
            return n;
        else
        {
            for (int i = 1; i <= n && i <= maxClimbs; i++)
            {
                results = results + getDifferentWaysToClimbStairs(n - i, maxClimbs);
            }
            return results;
        }
    }
}
