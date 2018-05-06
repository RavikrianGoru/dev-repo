package designpatterns.creational.abstractfactory;

public class Amd32BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered AMD 32 bit CPU.");
    }

}
