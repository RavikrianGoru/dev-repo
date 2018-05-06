package designpatterns.behavioral.strategy;

public class Bird extends Animal
{
    public Bird()
    {
        setFlys(new CanFlys());
    }
}
