package designpatterns.creational.abstractfactory;

public abstract class AbstractFactory
{
    public abstract Cpu getCpuIntsance(CpuTypes type);
    
    public static AbstractFactory getFactory(BitTypes type)
    {
        if (type == BitTypes.BIT_32)
        {
            return new Bit32Factory();
        }
        else if (type == BitTypes.BIT_64)
        {
            return new Bit64Factory();
        }
        return null;
    }
}
