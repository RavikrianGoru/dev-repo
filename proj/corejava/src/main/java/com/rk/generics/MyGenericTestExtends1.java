package com.rk.generics;

class Level1Top
{
    private int level;
    public Level1Top(int level)
    {
        this.level = level;
    }
    public void printLevel()
    {
        System.out.println(this.getClass().getName()+"---> level value="+this.level);
    }
}

class Level2Middle1 extends Level1Top
{
    private int level;
    public Level2Middle1(int level)
    {
        super(level-1);
        this.level = level;
    }
    public void printLevel()
    {
        System.out.println(this.getClass().getName()+"---> level value="+this.level);
    }
}

class Level2Middle2 extends Level1Top
{
    private int level;
    public Level2Middle2(int level)
    {
        super(level-1);
        this.level = level;
    }
    public void printLevel()
    {
        System.out.println(this.getClass().getName()+"---> level value="+this.level);
    }
}

class Level3Bottom1 extends Level2Middle1
{
    private int level;
    public Level3Bottom1(int level)
    {
        super(level-1);
        this.level = level;
    }
    public void printLevel()
    {
        System.out.println(this.getClass().getName()+"---> level value="+this.level);
    }
}

class Level3Bottom2 extends Level2Middle2
{
    private int level;
    public Level3Bottom2(int level)
    {
        super(level-1);
        this.level = level;
    }
    public void printLevel()
    {
        System.out.println(this.getClass().getName()+"---> level value="+this.level);
    }
}

class GenericBoundedExtends<T extends Level2Middle1>
{
    private T objRef;
    public GenericBoundedExtends(T objRef)
    {
        this.objRef=objRef;
    }
    public void print()
    {
        System.out.println(this.objRef.getClass().getName());
        objRef.printLevel();
    }
}

public class MyGenericTestExtends1
{

    public static void main(String[] args)
    {
        System.out.println("GenericBounded1<T extends Level2Middle1>: any sub class of Level2Middle1 or same class (Level2Middle1) can be allowd. else compile time error.");
        /*
         
                       Level1Top
                           |
                           |
                       /       \
         Level2Middle1          Level2Middle2     
               |                      |
         Level3Bottom1          Level3Bottom2


         GenericBounded1<T extends Level2Middle1>: any sub class of Level2Middle1 or same class (Level2Middle1) can be allowd. else compile time error.

         */
        
        GenericBoundedExtends<Level3Bottom1> obj1=new GenericBoundedExtends(new Level3Bottom1(3));
        obj1.print();
        
        GenericBoundedExtends<Level2Middle1> obj2=new GenericBoundedExtends(new Level2Middle1(2));
        obj2.print();
        
        //GenericBounded1<Level3Bottom2> obj3=new GenericBounded1(new Level3Bottom2(3));

        
        
    }

}
