package javatpoint.progs;


class Animal
{
    String kind="Not Yet Defined";
    int lifeTime;
    public void run()
    {
        System.out.println("Animal is running");
    }
}
class Cat extends Animal
{
    String kind="Not wild";
    int lifeTime=12;
    public void run()
    {
        System.out.println("Cat is running");
    }
}
class Dog extends Animal
{
    String kind="Not wild";
    int lifeTime=20;
    public void run()
    {
        System.out.println("Dog is running");
    }  
}
public class UpCastingAndDownCasting
{

    public static void main(String[] args)
    {
        Animal a=new Dog();//upcasting
        a.run();
        
        
//      1. CT:Error
//      Dog d=new Animal();
        
//      2. Compiles successfully but ClassCastException is thrown at runtime 
//      Dog d=(Dog)new Animal();
//      d.run();
  
//      3. executes without error 
        Animal an=new Dog();
        if(an instanceof Dog)
        {
            Dog d=(Dog)an;
            d.run();
        }
        
        
        
        
        

    }

}
