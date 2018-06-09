
class MOA_Parent
{
    public static void staticMethod()
    {
        System.out.println("MOA_Parent-staticMethod()");
    }

    public final void finalMethod()
    {
        System.out.println("MOA_Parent-finalMethod()");
    }

    private void privateAMMethod()
    {
        System.out.println("MOA_Parent-privateAMMethod()");
    }

    void defaultAMMethod()
    {
        System.out.println("MOA_Parent-defaultAMMethod()");
    }

    protected void protectedAMMethod()
    {
        System.out.println("MOA_Parent-protectedAMMethod()");
    }

    public void publicAMMethod()
    {
        System.out.println("MOA_Parent-publicAMMethod()");
    }
}

class MOA_Child extends MOA_Parent
{
    /*
     * @Override public static void staticMethod() { System.out.println("MOA_Parent-staticMethod()"); }
     * 
     * @Override public final void finalMethod() { System.out.println("MOA_Parent-finalMethod()"); }
     * 
     * @Override private void privateAMMethod() { System.out.println("MOA_Child-privateAMMethod()"); }
     */

    // Not allowed:(private)
    // Allowed: (default,protected,public)
    @Override
    void defaultAMMethod()
    {
        System.out.println("MOA_Child-defaultAMMethod()");
    }

    // Not allowed(default,private)
    // Allowed( protected,public)
    @Override
    protected void protectedAMMethod()
    {
        System.out.println("MOA_Child-protectedAMMethod()");
    }

    // Not allowed(default,private,protected)
    // Allowed(public)
    @Override
    public void publicAMMethod()
    {
        System.out.println("MOA_Child-publicAMMethod()");
    }
}

public class _0_MethodOverriingAccessModifiersRules
{

    public static void main(String[] args)
    {
        System.out.println("Overiding in Java: Is a feature that allows Sub/Child class provides specific implementation od a method which is already provided by Parent calss.");
        System.out.println("private-->default-->protected--->public");
        System.out.println("-------Method overriding with access modifiers has to following rules--------");
        System.out.println("1. private,static and final methods can not be overriden.");
        System.out.println("2. private,static methods of Parent class can be hide in child calls.");
        System.out.println("3. The access modifier for an overriding method can allow same/more, but not less, access than the overridden method.");
        System.out.println("4. The overriding method must have same return type (or subtype) :covariant type");
        
        
        //Overriding and Exception-Handling : Below are two rules to note when overriding methods related to exception-handling.
        
        //Rule#1 : If the super-class overridden method does not throws an exception, subclass overriding method can only throws the unchecked exception, 
        //throwing checked exception will lead to compile-time error.
        
        //Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. 
        //Throwing parent exception in Exception hierarchy will lead to compile time error.
        //Also there is no issue if subclass overridden method is not throwing any exception.
        
        
        MOA_Parent p = new MOA_Parent();
        MOA_Child c = new MOA_Child();
        p.defaultAMMethod();
        p.protectedAMMethod();
        p.publicAMMethod();

        c.defaultAMMethod();
        c.protectedAMMethod();
        c.publicAMMethod();

        System.out.println("1. ");
        System.out.println("1. ");
        System.out.println("1. ");
        System.out.println("1. ");
        System.out.println("1. ");

    }

}
