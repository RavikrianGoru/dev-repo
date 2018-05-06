package designpatterns.behavioral.strategy.two.problem;

public class RubberDuck implements IDuck
{

    @Override
    public void quack()
    {
        System.out.println("Quacks :soft");
    }

    @Override
    public void fly()
    {
        System.out.println("Can't Fly");
    }

    @Override
    public void display()
    {
        System.out.println("Soft Disply");
    }

}
