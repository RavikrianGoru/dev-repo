package java8features.functionalinterface;


class MyThread implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("MyThread implementation by Runnable interface.");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    
}
public class FuncationalInferfaceUsage
{

    public static void main(String[] args) throws InterruptedException
    {
        
        /*
        FunctionalInterface: 
        An interface with only one abstarct method/unimplemented method is called functional interface.
              It can have n-number default/static implemented methods.
              We can use the annotaion @FunctionalInterface for Functional interfaces which is optional and restricts to have 2 or more unimplemneted method in interface.
              The purpose of Functional interface to use in Lambda Expression/creating annonimous class implementation for Functional interfaces.
        Ex: Runnable interface.
         */
        
        way1Normal();
        way2Anonymous();
        way3LambdaExpressions();
        
    }

    public static void way3LambdaExpressions() throws InterruptedException
    {
        System.out.println("Lambda Expressions on Functional interface- Runnable interface in new Thread(()->{//business logic}) constructor.");
        Thread t1=new Thread( 
                            ()-> {
                                    for(int i=1;i<=5;i++)
                                    {
                                        System.out.println(i*10);
                                    }
                                 }
                            );
        t1.start();
        t1.join();
    }

    public static void way2Anonymous() throws InterruptedException
    {
        System.out.println("Anonymous implementation of Runnable interface in new Thread(-) constructor.");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run()
            {System.out.println("Anonymous implementation by Runnable interface.");
            for(int i=1;i<=5;i++)
            {
                System.out.println(i*5);
            }}});
        t1.start();
        t1.join();
    }

    public static void way1Normal() throws InterruptedException
    {
        System.out.println("Normal way of creating thread by implementing Runnable interface.");
        System.out.println("1. Create a class which implements Runnable interfaace and override run() method");
        System.out.println("2. Create an instance for class which implements Runnable interface");
        System.out.println("3. Create thread instance by passing instance which is created in step2");
        
        
        MyThread mt1=new MyThread();
        Thread t1=new Thread(mt1);
        t1.start();
        t1.join();
    }

}
