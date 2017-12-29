import java.io.IOException;

public class RuntimeClassDemo
{

    public static void main(String[] args) throws IOException
    {
        Runtime r=Runtime.getRuntime();
//        r.exec("notepad");
//        r.exec("calc");
        System.out.println(r.availableProcessors());
        System.out.println("Free memory:"+r.freeMemory());
        System.out.println("Total memory:"+r.totalMemory());
        System.out.println("Max memory:"+r.maxMemory());
        r.gc();
        
    }

}
