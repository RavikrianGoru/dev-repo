package javatpoint.abs;

import java.io.Serializable;
import java.rmi.Remote;

abstract class AbstractClass
{

    public AbstractClass()
    {
        System.out.println("AbstractClass class - default constructor");
    }

    public AbstractClass(String msg)
    {
        System.out.println("AbstractClass class : Hi " + msg);
    }

    public static void main(String[] args)
    {
        System.out.println("An abstract class can have data member, abstract method, method body, constructor and even main() method.");
    }
    public void toDoMethod()
    {
        System.out.println("toDoMethod() of AbstractClass");
    }
}

abstract class AbstractClass2 extends AbstractClass
{
    AbstractClass2(String msg)
    {
        System.out.println("AbstractClass2 class : Hi " + msg);
    }

    abstract void print();
}

public class AbstractClassDemo extends AbstractClass2
{

    public AbstractClassDemo()
    {
        this("Ravi");
        System.out.println("Concreat class - default constructor");
    }

    public AbstractClassDemo(String msg)
    {
        super(msg);
        System.out.println("AbstractClassDemoConcreat class  : Hi " + msg);
    }

    public static void main(String[] args)
    {
//        AbstractClass absObj=new AbstractClass().toDoMethod();
        AbstractClassDemo obj = new AbstractClassDemo();
        obj.print();
        System.out.println("An abstract class can have data member, abstract method, method body, constructor and even main() method.");
        System.out.println("An abstract class can have all implemented methods.");
    }

    @Override
    void print()
    {
        System.out.println("AbstractClassDemo provides print() implementation");
    }

}
