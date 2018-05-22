
class A_Hi
{
    static int a=123;
}
class A_Thread extends Thread
{
    private ThreadLocal<Integer> tl1=new ThreadLocal<>();
    private InheritableThreadLocal<Integer> itl1=new InheritableThreadLocal<>();
    Integer s=120;
    public void run()
    {
        tl1.set(A_Hi.a);
        itl1.set(A_Hi.a);
        System.out.println(tl1.get());
        System.out.println(itl1.get());
         System.out.println(s);
        System.out.println(Thread.currentThread().getName()+" is running");
        tl1.set(tl1.get()+1);
        itl1.set(itl1.get()+1);
        s++;
    }
}
class B_Thread extends A_Thread
{
    
}

public class ThreadLocalDemo
{

    public static void main(String[] args)
    {
        A_Thread t1=new A_Thread();
        t1.start(); 
        A_Thread t2=new A_Thread();
        t2.start();
        B_Thread b1=new B_Thread();
        b1.start();
        
    }

}
