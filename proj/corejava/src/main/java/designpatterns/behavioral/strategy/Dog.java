package designpatterns.behavioral.strategy;

public class Dog extends Animal
{

    public Dog()
    {
        setFlys(new CantFlys());
    }
}
