package bnp;

import java.util.ArrayList;

class A
{
    public void f()
    {
        System.out.println("f");
    }
}

public class Abc implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("run");
        throw new RuntimeException("Problem");
    }
    public static void main(String[] args)
    {
        Thread t =new Thread(new Abc());
        
        ArrayList al =new ArrayList();
//        al.ensureCapacity(20);
        t.start();
        System.out.println("Abc-Edn");
        t.run();
        t.run();
        t.start();
        
        
    }
}
 class Abc1 extends A
{
    public void f() throws RuntimeException
    {
        super.f();
        System.out.println("abc");
        if(true)
        {
            throw new RuntimeException();
        }
        System.out.println("next");
    }

    public static void main(String[] args)
    {
        
        //new Abc().f();
        
//        try
//        {
//           int a = args.length;
//           int b= 10/a;
//           System.out.println(a);
//        }catch(ArithmeticException s)
//        {
//            System.err.println("1");
//        }
        
        
    }

}
