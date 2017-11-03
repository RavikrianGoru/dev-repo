package javatpoint.progs
;

class Sample
{
    int c = 30;
}

public class CallByRefTest
{

    static int a = 10;
    static Integer b = new Integer(20);
    static Sample obj = new Sample();

    public static void main(String[] args)
    {
        System.out.println("Call by referece example, here, int, Integer(immutable), CustomeObject are passed");
        System.out.println(a + " " + b + " " + obj.c);
        method(a, b, obj);
        System.out.println(a + " " + b + " " + obj.c);

    }

    public static void method(int a, Integer b, Sample obj)
    {
        a = 100;
        b = 200;
        obj.c = 300;
        System.out.println(a + " " + b + " " + obj.c);
    }
}
