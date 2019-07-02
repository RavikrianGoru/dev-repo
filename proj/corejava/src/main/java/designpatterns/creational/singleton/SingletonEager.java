package designpatterns.creational.singleton;

public class SingletonEager
{
    // private static class variable final is optional
    private static final SingletonEager singleton = new SingletonEager();

    // private constructor
    private SingletonEager()
    {

    }

    // factory method
    public static SingletonEager getInstance()
    {
        return singleton;
    }

    // Problem1: The object would get created as soon as the class gets loaded into the JVM.
    // If the object is never requested, there would be an object useless inside the memory.

    //It’s always a good approach that an object should get created when it is required.
}
