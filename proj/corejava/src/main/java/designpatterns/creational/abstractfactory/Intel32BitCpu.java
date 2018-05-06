package designpatterns.creational.abstractfactory;

public class Intel32BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered Intel 32 bit CPU.");
    }
}
