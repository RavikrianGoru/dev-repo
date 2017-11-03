
class T extends Thread
{

}

class R implements Runnable
{

    @Override
    public void run()
    {
    }
    
}

public class SampleTest
{
    public static void main(String[] args)
    {
        T t1=new T ();
        t1.start();
    }
}
