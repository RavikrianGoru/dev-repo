package designpatterns.behavioral.strategy.two.problem;

public class CityDuck implements IDuck
{

    @Override
    public void quack()
    {
        System.out.println("Quacks :loud");
    }

    @Override
    public void fly()
    {
        System.out.println("Can Fly");
    }

    @Override
    public void display()
    {
        System.out.println("soft Disply");
    }

}