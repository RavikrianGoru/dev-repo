package d_and_b;

class SynThread extends Thread
{
    @Override
    public synchronized void run()
    {
        System.out.println("Hi:");
    }
}

class SynRunnable implements Runnable
{

    @Override
    public synchronized void run()
    {
        System.out.println("Hello:");

    }
}

public class _2_synchronized_run
{

    public static void main(String[] args)
    {
        System.out.println("We can add synchronized keyword in run() in Thread / Runnable ");
        SynThread t1 = new SynThread();
        t1.start();
        SynRunnable obj = new SynRunnable();
        Thread t2 = new Thread(obj);
        t2.start();
    }
}
