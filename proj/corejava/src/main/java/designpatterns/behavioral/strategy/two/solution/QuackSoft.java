package designpatterns.behavioral.strategy.two.solution;


public class QuackSoft implements IQuackStrategy
{
    @Override
    public void quack()
    {
        System.out.println("Quacks :Soft");
    }
}