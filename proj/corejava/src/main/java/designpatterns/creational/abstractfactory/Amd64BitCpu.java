package designpatterns.creational.abstractfactory;

public class Amd64BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered AMD 64 bit CPU.");
    }
}
