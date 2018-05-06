package designpatterns.creational.factory;

public class Client
{
    // Problem1: Normal code uses new keyword, tight coupling.
    // Problem2: Client is aware of all classes.

    public static void main(String[] args) throws ClassNotFoundException
    {
        // Solution1: No usage of new keywords
        // Solution2: Client will know only ICpu and CpuFactory, not concrete classes.
        Cpu obj = CpuFactory.orderCpu(CpuTypes.INTEL_CPU);
            obj.orderCpu();

            obj = CpuFactory.orderCpu(CpuTypes.AMD_CPU);
            obj.orderCpu();

            obj = CpuFactory.orderCpu(CpuTypes.QUALCOMM_CPU);
            obj.orderCpu();
        // Examples JDK:
        // Calendar c=Calendar.getInstance(-);
        // NumberFormat nb=NumberFormat.getInstance(-);
        // Class.forName(
        // Class.forName("designpatterns.creational.factory.Client");
    }

}
