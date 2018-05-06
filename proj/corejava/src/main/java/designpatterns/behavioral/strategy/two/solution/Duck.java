package designpatterns.behavioral.strategy.two.solution;

class Duck
{
    // each method is a behavior/stretagy/algorithem
    IQuackStrategy quackStrategy;
    IFlyStrategy flyStrategy;
    IDisplayStrategy displayStrategy;

    public Duck(IQuackStrategy quackStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy)
    {
        this.quackStrategy = quackStrategy;
        this.flyStrategy = flyStrategy;
        this.displayStrategy = displayStrategy;
    }

    public void quack()
    {
        quackStrategy.quack();
    }

    public void fly()
    {
        flyStrategy.fly();
    }

    public void display()
    {
        displayStrategy.display();
    }
}
