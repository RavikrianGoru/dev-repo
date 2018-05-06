package designpatterns.creational.abstractfactory;

public class Qualcomm64BitCpu extends Cpu
{
    @Override
    public void orderCpu()
    {
        System.out.println("Ordered Qualcomm 64 bit CPU.");
    }

}
