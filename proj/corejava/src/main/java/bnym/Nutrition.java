package bnym;

public class Nutrition
{

    public static void main(String[] args)
    {
        // 4 //1 2 3 4
        // 6 1+2+3 //unhealthy : sum of
        // skip one of 1,2,3
        // o/p :max( 1,2,4=7 1,3,4=8 2,3,4=9)

        // 2 //1 2
        // 1
        // o/p: max(2)

        // 3 // 1 2 3
        // 3 // 1+2
        // skip one of 1,2
        // o/p :max(1,3=4 2,3=5)

        int n = 2;
        int exclude = 2;

        nutritionTest(n, exclude);
    }

    public static void nutritionTest(int n, int exclude)
    {
        int sum = 0;
        int start = 1, end = 0, tempSum = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i++)
        {
            sum += i;
            if (!flag)
            {
                tempSum += i;
                if (tempSum == exclude)
                {
                    end = i;
                    flag = true;
                }
                else if (tempSum > exclude)
                {
                    tempSum -= start;
                    start++;
                }
            }
        }
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        System.out.println("flag:" + flag);
        System.out.println("tempSum:" + tempSum);
        System.out.println("sum:" + sum);

        System.out.println("Final return:"+(sum-start));
    }

}
