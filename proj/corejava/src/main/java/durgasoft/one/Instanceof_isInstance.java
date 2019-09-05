package durgasoft.one;

public class Instanceof_isInstance
{

    public static void main(String[] args) throws ClassNotFoundException
    {

        Thread t = new Thread();
        Object o = new Object();
        String s = new String("Ravi");

        if (t instanceof Object)
        {
            System.out.println("t instanceof Object");
        }
        if (s instanceof Object)
        {
            System.out.println("s instanceof Object");
        }
        // if (s instanceof Thread)
        // {
        // System.out.println("s instanceof Object");
        // }
        
        if (null instanceof Object)
        {
            System.out.println("null instanceof Object");
        }

        System.out.println(Class.forName("java.lang.String").getName());

        // dynamic
        if (Class.forName("java.lang.String").isInstance(Object.class))
        {
            System.out.println("(Class.forName(String).isInstance(Object.class)");
        }
    }

}
