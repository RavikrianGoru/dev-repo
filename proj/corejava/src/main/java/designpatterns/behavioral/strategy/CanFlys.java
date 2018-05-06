package designpatterns.behavioral.strategy;

public class CanFlys implements Flys
{
    @Override
    public void fly()
    {
        System.out.println("I am flying....");
    }
}