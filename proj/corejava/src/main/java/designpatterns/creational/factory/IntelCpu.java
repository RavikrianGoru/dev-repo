package designpatterns.creational.factory;

public class IntelCpu extends Cpu
{
    @Override
    void orderCpu()
    {
        System.out.println("Ordered Intel CPU");
    }

}
