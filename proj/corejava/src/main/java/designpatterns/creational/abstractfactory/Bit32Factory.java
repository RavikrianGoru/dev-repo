package designpatterns.creational.abstractfactory;

public class Bit32Factory extends AbstractFactory
{
    public Cpu getCpuIntsance(CpuTypes type)
    {
        if (type == CpuTypes.INTEL_CPU)
        {
            return new Intel32BitCpu();
        }
        else if (type == CpuTypes.AMD_CPU)
        {
            return new Amd32BitCpu();
        }
        else if (type == CpuTypes.QUALCOMM_CPU)
        {
            return new Qualcomm32BitCpu();
        }
        else
        {
            return null;
        }
    }
}
