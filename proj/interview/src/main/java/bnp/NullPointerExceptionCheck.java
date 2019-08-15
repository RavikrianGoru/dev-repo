package bnp;

class A1
{
    private String name1;
    private String name2;

    @Override
    public String toString()
    {
        return name1.concat(name2);
    }
}

class A2
{
    private String name1;
    private String name2;

    @Override
    public String toString()
    {
        return name1 + name2;
    }
}

public class NullPointerExceptionCheck
{

    public static void main(String[] args)
    {
        A1 obj1 = null;
        A2 obj2 = new A2();
        System.out.println(obj1);
        System.out.println(obj2);

    }

}
