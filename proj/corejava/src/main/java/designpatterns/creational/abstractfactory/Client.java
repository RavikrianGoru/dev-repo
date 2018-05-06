package designpatterns.creational.abstractfactory;

public class Client
{
    // Problem1: Normal code uses new keyword, tight coupling.
    // Problem2: Client is aware of concrete classes.
    // Factory Method pattern solves the above two problems. But can not introduces Factory class

    public static void main(String[] args)
    {
        AbstractFactory factory = null;
        Cpu obj = null;

        // Solution1: No usage of new keywords
        // Solution2: Client will know only ICpu and CpuFactory, not concrete classes.
        // Solution3: Hides Factory classes by introducing AbstractFactory class.

        factory = AbstractFactory.getFactory(BitTypes.BIT_32);
        obj = factory.getCpuIntsance(CpuTypes.INTEL_CPU);
        obj.orderCpu();
        obj = factory.getCpuIntsance(CpuTypes.AMD_CPU);
        obj.orderCpu();
        obj = factory.getCpuIntsance(CpuTypes.QUALCOMM_CPU);
        obj.orderCpu();

        factory = AbstractFactory.getFactory(BitTypes.BIT_64);
        obj = factory.getCpuIntsance(CpuTypes.INTEL_CPU);
        obj.orderCpu();
        obj = factory.getCpuIntsance(CpuTypes.AMD_CPU);
        obj.orderCpu();
        obj = factory.getCpuIntsance(CpuTypes.QUALCOMM_CPU);
        obj.orderCpu();

        // Examples JDK:
        // java.sql.DriverManager#getConnection()
        // java.sql.Connection#createStatement()
        // java.sql.Statement#executeQuery()

    }

}
