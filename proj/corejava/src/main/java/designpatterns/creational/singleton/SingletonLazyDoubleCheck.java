package designpatterns.creational.singleton;

public class SingletonLazyDoubleCheck
{
    private volatile static SingletonLazyDoubleCheck singleton = null;

    private SingletonLazyDoubleCheck()
    {

    }

    public static SingletonLazyDoubleCheck getInstance()
    {
        if (singleton == null)
        {
            synchronized (SingletonLazyDoubleCheck.class)
            {
                if (singleton == null)
                {
                    singleton = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singleton;
        
      /*
        Apart from this, there are some other ways to break the singleton pattern.
        • If the class is Serializable.
        • If it’s Clonable.
        • It can be break by Reflection.
        • And also if, the class is loaded by multiple class loaders.
        
        */
    }
}
