class A
{
    public void m1()
    {

    }

    public static void m2()
    {

    }

    public static void m3()
    {
        System.out.println("static method of A");
    }

}

class B extends A
{

    /*
     * public static void m1() //compile time error: static method can not hide instance method of parent class {
     * 
     * } public void m2() //compile time error: static method can not hide instance method of parent class {
     * 
     * }
     */

    public static void m2()
    {

    }

    public static void m3()
    {
        System.out.println("static method of B");
    }

    public static void staticMethod()
    {
        System.out.println("A obj=null; obj.staticMethod() ----->executes fine.");
    }
}

public class OverridingMethods
{

    public static void main(String[] args)
    {
        System.out.println("m1() is instance method is available in parant class. if we try to create \'static m1()\' method in sub class: C.T Error: static method can not hide instance method of parant class");
        B obj = null;
        obj.staticMethod();
        B.m3();
    }

}
