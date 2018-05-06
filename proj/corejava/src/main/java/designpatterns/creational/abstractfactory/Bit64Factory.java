package designpatterns.creational.abstractfactory;

public class Bit64Factory extends AbstractFactory
{
    public Cpu getCpuIntsance(CpuTypes type)
    {
        if (type == CpuTypes.INTEL_CPU)
        {
            return new Intel64BitCpu();
        }
        else if (type == CpuTypes.AMD_CPU)
        {
            return new Amd64BitCpu();
        }
        else if (type == CpuTypes.QUALCOMM_CPU)
        {
            return new Qualcomm64BitCpu();
        }
        else
        {
            return null;
        }
    }
}
