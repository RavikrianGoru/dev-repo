package designpatterns.behavioral.strategy.two.solution;

public class CanNotFly implements IFlyStrategy
{
    @Override
    public void fly()
    {
        System.out.println("Can't Fly");
    }
}
