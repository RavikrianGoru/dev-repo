import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class RuntimeClassDemo
{

    public static void main(String[] args) throws IOException
    {
        Runtime r=Runtime.getRuntime();
        final int MEGABYTE=(1024*1024);
        
//        r.exec("notepad");
//        r.exec("calc");
//      String strinArray[]={"notepad","Test.txt"};
//      r.exec(strinArray);

        System.out.println(r.availableProcessors());
        System.out.println("Free memory:"+r.freeMemory());
        System.out.println("Total memory:"+r.totalMemory());
        System.out.println("Max memory:"+r.maxMemory());
        r.gc();
        
        
        
        MemoryMXBean memoryBean=ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryUsage=memoryBean.getHeapMemoryUsage();
        System.out.println(memoryUsage.getInit()/MEGABYTE);
        System.out.println(memoryUsage.getMax()/MEGABYTE);
        
        System.out.println(memoryUsage.getUsed()/MEGABYTE);
        System.out.println(memoryUsage.getCommitted()/MEGABYTE); 
        
        
    }

}
