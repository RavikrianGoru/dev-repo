package javatpoint.progs;

class AClass
{
    public AClass()
    {
        System.out.println("Hi");
    }
    public AClass(String s)
    {
        
    }
}

class BClass extends AClass
{
    public BClass()
    {
        System.out.println("Hi");
    }
}

public class InharitanceDemoTest
{

    public static void main(String[] args)
    {
        BClass obj =new BClass();
        AClass obj1=(AClass)obj;
        
        AClass obj01=new AClass();
       // BClass obj11=(BClass)obj01;//runtime Exception ClassCastException
        
        int a=0b10001011;
        System.out.println(a); 
        
        
    }

}
