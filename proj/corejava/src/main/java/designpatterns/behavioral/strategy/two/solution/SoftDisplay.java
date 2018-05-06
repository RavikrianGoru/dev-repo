package designpatterns.behavioral.strategy.two.solution;

public class SoftDisplay implements IDisplayStrategy
{
    @Override
    public void display()
    {
        System.out.println("Wild Display");
    }
}
