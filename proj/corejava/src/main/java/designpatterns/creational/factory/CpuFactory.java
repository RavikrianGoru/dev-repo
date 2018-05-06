package designpatterns.creational.factory;

public class CpuFactory
{
    public static Cpu orderCpu(CpuTypes cputype)// Factory Method
    {
        if (CpuTypes.INTEL_CPU == cputype)
        {
            return new IntelCpu();
        }
        else if (CpuTypes.AMD_CPU == cputype)
        {
            return new AmdCpu();
        }
        else if (CpuTypes.QUALCOMM_CPU == cputype)
        {
            return new QualcommCpu();
        }
        else
        {
            return null;
        }
    }

}
