package builtin_classes;

class A
{
    public A()
    {
        System.out.println("A()");
    }
}

class Employee implements Cloneable
{

    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    private int id;
    private String name;

    public Employee()
    {
    }

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class _2_Object
{
    public static void main(String[] args)
    {
        System.out.println("-------------");
        Object obj = new String("Goru");
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj.equals("Goru"));

        System.out.println("-------------");
        A ob = new A();
        System.out.println(ob.getClass());
        System.out.println(ob.toString());
        System.out.println(ob.hashCode());
        System.out.println(ob.equals(new A()));
        
        System.out.println("-------------");
        Employee obB = new Employee(1, "ravi");
        System.out.println(obB);
        System.out.println(obB.getClass());
        System.out.println(obB.hashCode());
        System.out.println(obB.toString());

        try
        {
            System.out.println(obB.clone());
        }
        catch (CloneNotSupportedException cnsex)
        {
            System.out.println(cnsex.getMessage());
        }
    }
}
