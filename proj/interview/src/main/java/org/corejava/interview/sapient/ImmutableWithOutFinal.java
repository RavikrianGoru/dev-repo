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
        Immutable obj=Immutable.create("Hi");
        System.out.println("Immutable class:"+obj.hashCode());
        String s=null;
        
    }

}
