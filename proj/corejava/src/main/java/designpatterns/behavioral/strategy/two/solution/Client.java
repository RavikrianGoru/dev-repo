package designpatterns.behavioral.strategy.two.solution;

public class Client
{

    public static void main(String[] args)
    {
        Duck obj = new Duck(new QuackLoud(), new CanFly(), new WildDisplay());
        obj.quack();
        obj.fly();
        obj.display();

        obj = new Duck(new QuackSoft(), new CanNotFly(), new SoftDisplay());
        obj.quack();
        obj.fly();
        obj.display();
        
        obj = new Duck(new QuackLoud(), new CanFly(), new SoftDisplay());
        obj.quack();
        obj.fly();
        obj.display();
        
        obj = new Duck(new QuackLoud(), new CanNotFly(), new WildDisplay());
        obj.quack();
        obj.fly();
        obj.display();
    }

}
