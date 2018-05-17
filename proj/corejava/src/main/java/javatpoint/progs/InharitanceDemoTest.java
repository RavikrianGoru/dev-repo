package javatpoint.progs;

class AClass
{
    public AClass()
    {
        System.out.println("Hi AClass");
    }
    public AClass(String s)
    {
        
    }
}

class BClass extends AClass
{
    public BClass()
    {
        System.out.println("Hi BClass");
    }
}


class Animal1 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal1");
    }
}


class Dog1 extends Animal1 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog1");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog1");
    }
}
public class InharitanceDemoTest
{

    public static void downCastingMethod(BClass obj)
    {
        
    }
    public static void main(String[] args)
    {
        System.out.println("d is instance of Dog1");
        Dog1 d = new Dog1();
        
        System.out.println("Upcasting d to Animal1 class. Type casting is required.");
        Animal1 a = (Animal1)d;
        d.callme();
        a.callme();
//       a.callme2();// compiler will thorw exception Undefined method as it referes to Animal1 class (only one method is available )
        
        if(a instanceof Dog1)
        {
            ((Dog1) a).callme2();
        }
        
        
        
        BClass obj =new BClass();
        AClass obj1=(AClass)obj;//UpCasting Allowed
        
        AClass obj01=new AClass();
        if(obj01 instanceof BClass)
        {
            BClass obj11=(BClass)obj01;
            System.out.println("Down Casting is possible with instanceof operator");
        }
       // BClass obj11=(BClass)obj01;//runtime Exception ClassCastException
        
        int n1=0b10001011;
        System.out.println(n1); 
        
        
    }

}
