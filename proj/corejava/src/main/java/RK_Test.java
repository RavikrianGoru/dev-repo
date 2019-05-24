import javax.servlet.jsp.el.ImplicitObjectELResolver;

//class E0 extends Exception
//{
//    
//}
//class E1 extends E0
//{
//    
//}

class T implements Runnable
{
    private Thread t;
    private String tName;
    T (String tName)
    {
        this.tName=tName;
    }
    public void run()
    {
        for(int i=0; i<10;i++)
            System.out.println(tName);
    }
    public void start()
    {
        if(t==null)
        {
            t=new Thread(this, tName);
            t.start();
        }
    }
    
}

interface I
{
    public void m1();
}
class BaseC
{
    public void m1()
    {
        System.out.println("BaseC");
    }
}
public class RK_Test extends BaseC implements I
{

//    public void RK_Test()
//    {
//        System.out.println("Hi");
//    }
    public static void main(String[] args)
    {
       // (new RK_Test()).m1();
        String s ="Hi";
System.out.println( Character.toUpperCase(s.charAt(0)));
//        T t1=new T("A");
//        T t2=new T("B");
//        t2.start();
//        t1.start();
        
//        RK_Test obj = new RK_Test();
//        System.out.println("bye");
//        try
//        {
//            throw new E1();
//        }catch(E0 e)
//        {
//            System.out.println("hi"); 
//            
//        }catch(Exception e)
//        {
//            System.out.println("hI"); 
//        }
    }

}
