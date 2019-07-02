package designpatterns.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable
{

    // Apart from this, there are some other ways to break the singleton pattern.
    // • If the class is Serializable.
    // • If it’s Clonable.
    // • It can be break by Reflection.
    // • And also if, the class is loaded by multiple class loaders.
    // java.lang.System
    private static final long serialVersionUID = -5000L;
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance()
    {
        return singleton;
    }

    // • It can be break by Reflection.(solved)
    private Singleton()
    {
        if (singleton != null)
        {
            throw new IllegalStateException("Singleton, can not be created by reflection API.");
        }
    }

    // • If it’s Clonable.(solved)
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException("Singleton, Can not clone.");
    }

    //if, the class is loaded by multiple class loaders.
    private static Class getClass(String className) throws ClassNotFoundException
    {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader != null)
        {
            loader = Singleton.class.getClassLoader();
        }
        return loader.loadClass(className);
    }

    // This method is called immediately after an object of this class is deserialized.
    // This method returns the singleton instance.
    protected Object readResolve()
    {
        return getInstance();
    }
}
