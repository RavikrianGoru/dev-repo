
class A1
{
    static
    {
        System.out.println("static Block :A1");
    }

    {
        System.out.println("instanceBlock:A1");
    }

    public A1()
    {
        System.out.println("Constructor:A1()");
    }
}

public class InstanceBlockDemo extends A1
{
    int a;

    static
    {
        System.out.println("static block of InstanceBlockDemo");
    }

    public InstanceBlockDemo()
    {
        super();// optional compiler will takecare of it.
        System.out.println("Constructor:InstanceBlockDemo()");
    }

    public InstanceBlockDemo(int a)
    {
        this.a = a;
        System.out.println("Constructor:InstanceBlockDemo()");
    }

    {
        System.out.println("Instce Block:InstanceBlockDemo");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {

        InstanceBlockDemo obj = new InstanceBlockDemo();
        System.out.println("---");
        InstanceBlockDemo obj1 = new InstanceBlockDemo(100);

        System.out.println("------------Class.forName()----------------");
        try
        {
            Class.forName("com.javatpoint.A1");
            System.out.println("Loaded clas Name:" + Class.forName("com.javatpoint.A1").newInstance().getClass().getName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

}
