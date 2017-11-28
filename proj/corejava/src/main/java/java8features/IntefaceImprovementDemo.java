package java8features;


interface OrdinaryInteface
{
    void printName();//abstract method
    void doMethod();//abstract method
}

interface IntefaceWithStaticMethod extends OrdinaryInteface
{
    default void printName()
    {
        System.out.println("printName():defult implementation provided in child interface-IntefaceWithStaticMethod");
    }
    static void printAddress()
    {
        System.out.println("printAddress():is static method and implementation provided in IntefaceWithStaticMethod"); 
    }
    public static void main(String args[])
    {
        System.out.println("main method in interface");
    }
}
interface IntefaceWithDefaultMethod extends IntefaceWithStaticMethod
{
    default void printName()
    {
        System.out.println("printName():defult implementation provided in child interface-IntefaceWithDefaultMethod");
    }
}


public class IntefaceImprovementDemo implements IntefaceWithStaticMethod,IntefaceWithDefaultMethod
{

    public static void main(String[] args)
    {
        IntefaceImprovementDemo obj=new IntefaceImprovementDemo();
        obj.doMethod();
        obj.printName();
     
        IntefaceWithStaticMethod.printAddress();
        String[] s= {"a","b"};
        IntefaceWithStaticMethod.main(s);
    }

    @Override
    public void doMethod()
    {
        System.out.println("doMethod()--- implementation");
    }

}
