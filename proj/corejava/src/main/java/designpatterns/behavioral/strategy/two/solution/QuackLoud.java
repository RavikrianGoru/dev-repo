package designpatterns.behavioral.strategy.two.solution;

public class QuackLoud implements IQuackStrategy
{
    @Override
    public void quack()
    {
        System.out.println("Quacks :Loud");
    }
}
