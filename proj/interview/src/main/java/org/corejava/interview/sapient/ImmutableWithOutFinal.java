package org.corejava.interview.sapient;

class Immutable
{
    private String val;
    private Immutable(String val)
    {
        this.val=val;
    }
    
    public static Immutable create(String val)
    {
        return new Immutable(val);
    }
    public String getVal()
    {
        return val;
    }
}

public class ImmutableWithOutFinal
{

    public static void main(String[] args)
    {
        Immutable obj1=Immutable.create("Hi");
        Immutable obj2=Immutable.create("Hi");
        System.out.println("Immutable class:"+obj1.hashCode());
        System.out.println("Immutable class:"+obj1.hashCode());
        String s=null;
        
    }

}
