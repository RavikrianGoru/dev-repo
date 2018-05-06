package designpatterns.behavioral.strategy;

class CantFlys implements Flys
{
    @Override
    public void fly()
    {
        System.out.println("I can not fly...."); 
    }
}