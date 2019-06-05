class PrintNumbers
{
    private static boolean flag = false;
    private static int even = 0;
    private static int odd = 1;

    public synchronized void printEven()
    {
        if (flag)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println(even);
        even += 2;
        flag = true;
        notify();
    }

    public synchronized void printOdd()
    {
        if (!flag)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println(odd);
        odd += 2;
        flag = false;
        notify();
    }
}

class EvenThread extends Thread
{
    PrintNumbers obj = null;

    public EvenThread(PrintNumbers obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        while (true)
        {
            try
            {
                EvenThread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            obj.printEven();
        }
    }
}

class OddThread extends Thread
{
    PrintNumbers obj = null;

    public OddThread(PrintNumbers obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        while (true)
        {
            try
            {
                OddThread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            obj.printOdd();
        }
    }
}

public class PrintEvenOddNumberByThreads
{

    public static void main(String[] args)
    {
        PrintNumbers sharedObj = new PrintNumbers();
        Thread t1 = new EvenThread(sharedObj);
        Thread t2 = new OddThread(sharedObj);
        t1.start();
        t2.start();

    }

}
