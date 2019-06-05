package d_and_b;

public class _1_ThrowsError
{

    public static void m1() throws Throwable
    {
         //throw new Error();
        //throw new Throwable();
        throw new Exception();
    }

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Try");
            m1();
        }
        catch (Exception e)
        {
            System.out.println("catch-Exception");
        }
        catch (Error e)
        {
            System.out.println("catch-Error");
        }
        catch (Throwable e)
        {
            System.out.println("catch-Throwable");
        }
        finally
        {
            System.out.println("finally");
        }

        System.out.println("After finally block");
    }

}
