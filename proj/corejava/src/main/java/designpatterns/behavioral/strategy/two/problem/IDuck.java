package designpatterns.behavioral.strategy.two.problem;

public interface IDuck
{
    // CloudDuck,MountainDuck,WildDuck,RubberDuck & CityDuck
    // behavior or strategy or algorithem

    // CloudDuck,WildDuck,CityDuck and MountainDuck quack have the same behavior: duplicate code in 4 classes.
    // But RubberDuck will have different behavior
    public void quack();

    // CloudDuck,WildDuck and MountainDuck can fly have the same behavior: duplicate code in 3 classes.
    // CityDuck and RubberDuck can not fly:duplicate code in 2 classes
    public void fly();

    // CloudDuck,WildDuck and MountainDuck have wild display behavior
    // CityDuck and RubberDuck have soft display
    public void display();
}
