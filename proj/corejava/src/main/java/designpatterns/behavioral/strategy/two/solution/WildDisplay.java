package designpatterns.behavioral.strategy.two.solution;

public class WildDisplay implements IDisplayStrategy
{
    @Override
    public void display()
    {
        System.out.println("Soft Display");
    }
}