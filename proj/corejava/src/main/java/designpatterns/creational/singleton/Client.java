package designpatterns.creational.singleton;

public class Client
{

    public static void main(String[] args)
    {
        // Singleton obj=new Singleton();
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        // SingletonEager obj=new SingletonEager();
        System.out.println(SingletonEager.getInstance());
        System.out.println(SingletonEager.getInstance());

        // SingletonLazy obj=new SingletonLazy();
        System.out.println(SingletonLazy.getInstance());
        System.out.println(SingletonLazy.getInstance());

        // SingletonLazyDoubleCheck obj=new SingletonLazyDoubleCheck();
        System.out.println(SingletonLazyDoubleCheck.getInstance());
        System.out.println(SingletonLazyDoubleCheck.getInstance());

        // SingletonLazyMultithreaded obj=new SingletonLazyMultithreaded();
        System.out.println(SingletonLazyMultithreaded.getInstance());
        System.out.println(SingletonLazyMultithreaded.getInstance());

    }

}
