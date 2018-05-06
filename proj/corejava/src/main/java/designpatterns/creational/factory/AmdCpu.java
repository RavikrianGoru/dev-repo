package designpatterns.creational.factory;

public class AmdCpu extends Cpu
{
    @Override
    void orderCpu()
    {
        System.out.println("Ordered AMD CPU");
    }

}
