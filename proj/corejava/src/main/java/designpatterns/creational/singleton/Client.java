package designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client
{

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        // Singleton obj=new Singleton();
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        // SingletonEager obj=new SingletonEager();
        System.out.println("\nEager without static block  Singleton instance hashCode():"+SingletonEager.getInstance().hashCode());
        System.out.println("Eager without static block  Singleton instance hashCode():"+SingletonEager.getInstance().hashCode());

        System.out.println("\nStaic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());
        System.out.println("Staic Block Singleton instance hashCode():" + StaticBlockSingleton.getInstance().hashCode());

        // SingletonLazy obj=new SingletonLazy();
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());

        // SingletonLazyDoubleCheck obj=new SingletonLazyDoubleCheck();
        System.out.println(SingletonLazyDoubleCheck.getInstance());
        System.out.println(SingletonLazyDoubleCheck.getInstance());

        // SingletonLazyMultithreaded obj=new SingletonLazyMultithreaded();
        System.out.println(SingletonLazyMultithreaded.getInstance());
        System.out.println(SingletonLazyMultithreaded.getInstance());

        //BillPughSingleton
        System.out.println("\nBillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());
        System.out.println("BillPughSingleton instance hashCode():" + BillPughSingleton.getInstance().hashCode());

        
        System.out.println("\nSerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());
        System.out.println("SerializationSingleton instance hashCode():" + SerializationSingleton.getInstance().hashCode());

        System.out.println("\nEnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
        System.out.println("EnumSingleton instance hashCode():" + EnumSingleton.INSTANCE.hashCode());
  
        EnumSingleton.INSTANCE.doMethod();
        BestWaySingleton.INSTANCE.doBusinessLogic();

        //Break singletone by reflection
        SingletonEager objOne = SingletonEager.getInstance();
        SingletonEager objTwo = null;
        Constructor[] ConstructoArray = SingletonEager.class.getDeclaredConstructors();
        for (Constructor c : ConstructoArray)
        {
            c.setAccessible(true);
            objTwo = (SingletonEager) c.newInstance();

        }
        System.out.println("ObjOne and ObjTwo hashCodes:" + objOne.hashCode() + " and " + objTwo.hashCode());


    }

}
