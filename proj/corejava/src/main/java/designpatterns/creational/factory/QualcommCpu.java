package designpatterns.creational.factory;

public class QualcommCpu extends Cpu
{
    @Override
    void orderCpu()
    {
        System.out.println("Ordered Qualcomm CPU");
    }

}
