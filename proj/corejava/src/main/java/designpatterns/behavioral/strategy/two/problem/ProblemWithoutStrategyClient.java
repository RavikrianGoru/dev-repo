package designpatterns.behavioral.strategy.two.problem;

public class ProblemWithoutStrategyClient
{
    public static void main(String[] args)
    {
        IDuck obj = new CityDuck();
        obj.quack();
        obj.fly();
        obj.display();

        obj = new RubberDuck();
        obj.quack();
        obj.fly();
        obj.display();

        obj = new WildDuck();
        obj.quack();
        obj.fly();
        obj.display();

        obj = new MountainDuck();

        obj.quack();
        obj.fly();
        obj.display();

        obj = new CloudDuck();
        obj.quack();
        obj.fly();
        obj.display();

    }

}
