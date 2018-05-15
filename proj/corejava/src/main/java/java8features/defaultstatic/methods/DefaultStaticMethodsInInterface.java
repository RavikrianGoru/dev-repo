package java8features.defaultstatic.methods;

interface InterF1
{
    public void test();
    
    default public void log()
    {
        System.out.println("Default log from InterF1");
    }
    
    static void sMethod()
    {
        System.out.println("Static Method from InterF1");
    }
}
interface InterF2
{
   default void test()
   {
       System.out.println("Default Test method from InterF2");
   }
}
interface InterF3 extends InterF1,InterF2
{

    @Override
    default void test()
    {
        System.out.println("Default Test method from InterF3");
    }
}

public class DefaultStaticMethodsInInterface implements InterF3
{

    public static void main(String[] args)
    {
        InterF3 obj=(InterF3) new DefaultStaticMethodsInInterface();
        obj.test();
        obj.log();
    }

    @Override
    public void test()
    {
       System.out.println("implemented test method in class");
    }
}
