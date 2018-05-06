package designpatterns.behavioral.strategy;

public class Animal
{
    private String name;
    private String sound;
    private double weight;
    private double height;
    
    
    public Flys fly;
    public void setFlys(Flys flys)
    {
        this.fly=flys;
    }
    public void tryToFly()
    {
        fly.fly();
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSound()
    {
        return sound;
    }
    public void setSound(String sound)
    {
        this.sound = sound;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    
    
}
