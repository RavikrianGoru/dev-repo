package journaldev.designpatterns.creational;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Singleton is one of the Gange of Four Design patterns and comes in the creational design pattern category.
 * 
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. The
 * singleton class must provide a global access point to get the instance of the class.
 * 
 * Singleton pattern is used for logging, driver objects, caching and thread pool. Singleton Design Pattern is also used in other Design Patterns such
 * as Abstract Factory, Builder, Prototype,Facade... etc.
 * 
 * Ex: java.lang.Runtime, java.awt.Desktop
 * 
 * public class Runtime { private static Runtime currentRuntime = new Runtime();
 * 
 * private Runtime() {
 * 
 * }
 * 
 * public static Runtime getRuntime() { return currentRuntime; } . . . }
 * 
 * Implementation: -------------- 1. private constructor 2. private static (final) variable of same class type.(for only one instance)---- final is
 * optional 3. public static method which returns instance of Singleton class.
 * 
 * Different Approaches of Singleton Class: I) Eager Initialization creating singleton instance while declaring singleton class variable. Ex.
 * java.lang.Runtime -) singleton instance will be created while loading class. -) No Exception handling
 * 
 * II) Static Block Initialization creating singleton instance within static block with exception handling. -) singleton instance will be created
 * while loading class. +) Exception handling III)Lazy Initialization Creating singleton instance when we about to use first time.(in method) +) works
 * fine in single threaded environment -) some issues in multi-threaded environment: if "if- condition get executes " by two or more threads at a
 * time. two or more instances will be created.
 * 
 * IV)ThreadSafe Singleton Creating singleton instance when we about to use first time.(in synchronized method) +) Thread sfae -) synchronized method
 * overhead cost is more. -) low performance due to synchronized
 * 
 * V) Bill Pugh Singleton it uses inner static helper class for creating singleton class instance. when the singleton class is loaded, inner helper
 * class is not loaded into memory and only when someone calls the getInsatance() method, this class gets loaded and creates the Singleton class
 * instance. +) This is the most widely used approach no need of synchronization
 * 
 * All these singleton patterns can be broke by Reflection. a single-element enum type is the best way to implement a singleton. if we implement
 * Serializable interface, we can achieve serialization in singleton class. but when we deserialize that object it creates new object.
 * 
 * VI) Serialization Singleton if we want to store state of singleton object in file system in distributed environment. we have to implement
 * Serializable interface. -) while deserializing object from file it creates new instance. so Singleton breaks.
 * 
 * 
 * VII) EnumSingletone +) Java ensures that any enum value is instantiated only once in a Java program. Since java Enums are globally accessible, so
 * is the singleton. -) Does not support lazy instantiation. +) Enum is threadsafe, defence Serializable and Reflection attacks.
 * 
 * public enum EnumSingleton { INSTANCE; public void doMethod() { System.out.println("Accessing EnumSingleton class instance.") } }
 * 
 */

class EagerSingletonClass
{
    private EagerSingletonClass()
    {
    }

    private static final EagerSingletonClass instance = new EagerSingletonClass();

    public static EagerSingletonClass getInstance()
    {
        return instance;
    }
}

class StaticBlockSingleton
{
    private StaticBlockSingleton()
    {
    }

    private static final StaticBlockSingleton instance;

    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Exception occured while creating singleton class instance.");
        }
    }

    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}

class LazySingleton
{
    private static LazySingleton instance = null;

    private LazySingleton()
    {
    }

    public static LazySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }
}

class ThreadSafeSingleton
{
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {
    }

    // public static synchronized ThreadSafeSingleton getInstance()//synchronized method overhead cost is more. low performance.
    public static ThreadSafeSingleton getInstance()
    {
        synchronized (ThreadSafeSingleton.class)
        {
            if (instance == null)
                instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class DoubleCheckedThreadSafeSingleton
{
    private volatile static DoubleCheckedThreadSafeSingleton instance;

    private DoubleCheckedThreadSafeSingleton()
    {
    }

    // public static synchronized DoubleCheckedThreadSafeSingleton getInstance()//synchronized method overhead cost is more. low performance.
    public static DoubleCheckedThreadSafeSingleton getInstance()
    {
        if (instance == null)//1st check  instance variable should be volatile
        {
            synchronized (DoubleCheckedThreadSafeSingleton.class)
            {
                if (instance == null)//2nd check
                    instance = new DoubleCheckedThreadSafeSingleton();
            }
        }
        return instance;
    }
}

class BillPughSingleton
{
    private BillPughSingleton()
    {
    }

    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}

class SerializationSingleton implements Serializable
{
    private static final long serialVersionUID = -7604857685486587465L;

    private SerializationSingleton()
    {
    }

    private static class SingletonHelper
    {
        private static final SerializationSingleton INSTANCE = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}

enum EnumSingleton
{
    INSTANCE;
    public void doMethod()
    {
        System.out.println("Accessing EnumSingleton class instance.");
    }
}

enum BestWaySingleton
{
    INSTANCE;

    public void doBusinessLogic()
    {
        System.out.println("Doing business logic.........");
    }
}

public class _1_SingletonDemo
{

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {

        System.out.println("Eager Singleton instance hashCode():" + EagerSingletonClass.getInstance().hashCode());
        System.out.println("Eager Singleton instance hashCode():" + EagerSingletonClass.getInstance().hashCode());
        System.out.println("Eager Singleton instance hashCode():" + EagerSingletonClass.getInstance().hashCode());
        System.out.println("Eager Singleton instance hashCode():" + EagerSingletonClass.getInstance().hashCode());

        System.out.println("Staic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());
        System.out.println("Staic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());
        System.out.println("Staic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());
        System.out.println("Staic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());

        System.out.println("Lazy Singleton instance hashCode():" + LazySingleton.getInstance().hashCode());
        System.out.println("Lazy Singleton instance hashCode():" + LazySingleton.getInstance().hashCode());
        System.out.println("Lazy Singleton instance hashCode():" + LazySingleton.getInstance().hashCode());
        System.out.println("Lazy Singleton instance hashCode():" + LazySingleton.getInstance().hashCode());

        System.out.println("Thread-safe instance hashCode():" + ThreadSafeSingleton.getInstance().hashCode());
        System.out.println("Thread-safe instance hashCode():" + ThreadSafeSingleton.getInstance().hashCode());
        System.out.println("Thread-safe instance hashCode():" + ThreadSafeSingleton.getInstance().hashCode());
        System.out.println("Thread-safe instance hashCode():" + ThreadSafeSingleton.getInstance().hashCode());

        System.out.println("BillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());
        System.out.println("BillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());
        System.out.println("BillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());
        System.out.println("BillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());

        System.out.println("SerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());
        System.out.println("SerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());
        System.out.println("SerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());
        System.out.println("SerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());

        System.out.println("----------------------------Break Singleton behavior by Reflections---------------------------------------");

        EagerSingletonClass objOne = EagerSingletonClass.getInstance();
        EagerSingletonClass objTwo = null;
        Constructor[] ConstructoArray = EagerSingletonClass.class.getDeclaredConstructors();
        for (Constructor c : ConstructoArray)
        {
            c.setAccessible(true);
            objTwo = (EagerSingletonClass) c.newInstance();

        }
        System.out.println("ObjOne and ObjTwo hashCodes:" + objOne.hashCode() + " and " + objTwo.hashCode());

        System.out.println("EnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
        System.out.println("EnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
        System.out.println("EnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
        System.out.println("EnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
        EnumSingleton.INSTANCE.doMethod();

        BestWaySingleton.INSTANCE.doBusinessLogic();

    }

}
