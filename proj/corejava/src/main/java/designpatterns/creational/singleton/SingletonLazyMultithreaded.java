package designpatterns.creational.singleton;

public class SingletonLazyMultithreaded
{
    private static SingletonLazyMultithreaded singleton = null;

    private SingletonLazyMultithreaded()
    {

    }

    //synchronized method overhead cost is more. low performance.
    public static synchronized SingletonLazyMultithreaded getInstance()
    {
        if (singleton == null)
        {
            singleton = new SingletonLazyMultithreaded();
        }
        return singleton;
    }
    // if we dont want to use synchronized method. we can use double check-locking synchronized block
}
