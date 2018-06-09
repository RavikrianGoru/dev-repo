package org.corejava.interview.sapient;

class NonFinalClass
{
    private final String finalVar_A;

    public String getA()
    {
        return finalVar_A;
    }

    public NonFinalClass(String a)
    {
        this.finalVar_A = a;
        System.out.println(this.hashCode());
    }
}

class ChildClass extends NonFinalClass
{

    public ChildClass(String a)
    {
        super(a);
    }
    @Override
    public String getA()
    {
        return super.getA();
    }

}

public class NonFinalImmutable
{
    public static void main(String[] args)
    {
        System.out.println("Class is not final it can be extended. but it preserves immutability.");
        ChildClass obj = new ChildClass("ravi");
        ChildClass obj1 = new ChildClass("ravi");
        NonFinalClass o1=new NonFinalClass("kiran");
        System.out.println("Here we cannot change/modify object. So immutable");
        
    }
}
