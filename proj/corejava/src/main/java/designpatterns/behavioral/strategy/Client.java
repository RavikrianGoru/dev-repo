package designpatterns.behavioral.strategy;

public class Client
{

    public static void main(String[] args)
    {
        Animal  obj=new Dog();
                obj.tryToFly();
                
                obj=new Bird();
                obj.tryToFly();
    }

}
