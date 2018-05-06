package designpatterns.behavioral.strategy.two.solution;

public class CanFly implements IFlyStrategy
{
    @Override
    public void fly()
    {
        System.out.println("Can Fly");
    }
}
