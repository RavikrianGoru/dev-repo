package designpatterns.creational.singleton;

public class SingletonLazy
{
    private static SingletonLazy singleton = null;

    private SingletonLazy()
    {

    }

    public static SingletonLazy getInstance()
    {
        if (singleton == null)
        {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
    // But this code will fail in a multi-threaded environment.
    // To avoid this, we will use the synchronized keyword to the getInstance() method.

}
