package designpatterns.creational.abstractfactory;

public class Qualcomm32BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered Qualcommm 32 bit CPU.");
    }

}
