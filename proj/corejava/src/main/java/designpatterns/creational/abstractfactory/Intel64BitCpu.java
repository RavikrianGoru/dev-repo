package designpatterns.creational.abstractfactory;

public class Intel64BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered Intel 64 bit CPU.");
    }

}
