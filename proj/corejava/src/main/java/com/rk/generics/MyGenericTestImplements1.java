package com.rk.generics;

interface AInf
{
    public void whoRU();
}

class A1Impl implements AInf
{
    @Override
    public void whoRU()
    {
        System.out.println("I am A1Impl");
    }
}

class A2Impl implements AInf
{
    @Override
    public void whoRU()
    {
        System.out.println("I am A2Impl");
    }
}

interface BInf
{
    public void howRU();
}

class B1Impl implements BInf
{
    @Override
    public void howRU()
    {
        System.out.println("Greate! how r u?");
    }
}

class GenericImplForOne<T extends AInf>
{
    private T objRef = null;

    public GenericImplForOne(T objRef)
    {
        this.objRef = objRef;
    }

    public void iAm()
    {
        this.objRef.whoRU();
    }
}

class ABImpl implements AInf, BInf
{
    @Override
    public void howRU()
    {
        System.out.println("Great! How are you dude?");
    }

    @Override
    public void whoRU()
    {
        System.out.println("I am ABImpl.");
    }
}

class GenericImplForTwo<T extends AInf & BInf>
{
    private T objRef = null;

    public GenericImplForTwo(T objRef)
    {
        this.objRef = objRef;
    }

    public void iAm()
    {
        this.objRef.whoRU();
        this.objRef.howRU();
    }
}

public class MyGenericTestImplements1
{
    public static void main(String[] args)
    {
        System.out.println("This is demo for GenericImplForOne<T extends AInf>");

        GenericImplForOne<A1Impl> obj1 = new GenericImplForOne(new A1Impl());
        obj1.iAm();
        GenericImplForOne<A2Impl> obj2 = new GenericImplForOne(new A2Impl());
        obj2.iAm();

        // Compile Time error A1Impl, A2Impl and B1Impl not implemented both interfaces as defined:GenericImplForTwo<T extends AInf & BInf>
        /*
         * GenericImplForTwo<A1Impl> o1; GenericImplForTwo<A2Impl> o2; GenericImplForTwo<B1Impl> o3;
         */

        System.out.println("This is demo for GenericImplForTwo<T extends AInf & BInf>");
        GenericImplForTwo<ABImpl> obj3 = new GenericImplForTwo(new ABImpl());
        obj3.iAm();
    }

}
