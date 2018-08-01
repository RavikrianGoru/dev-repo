package basics;
public class FinallyBlockExecutionCheck
{

    public static void doFinallyTest()
    {

        for (int i = 0; i <= 1; i++)
        {
            try
            {
                System.out.println("Try block");
                // return;
                // break;
                // continue;
                // System.exit(0);
            }
            catch (Exception e)
            {
                System.out.println("catch block");
            }
            finally
            {
                System.out.println("Finally block");
            }
        }

    }

    public static void main(String[] args)
    {
        System.out.println("1)will finally block executes after exit, break, continue, return.");
        System.out.println("A)finally executes in all senarios except exit which causes JVM failure/terminating the process. Also at power shutdown finally/OS failover wont execute.");
        
        doFinallyTest();
    }
}
