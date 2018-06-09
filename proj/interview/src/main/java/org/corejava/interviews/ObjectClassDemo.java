package org.corejava.interviews;

public class ObjectClassDemo implements Cloneable
{
    @Override
    public int hashCode()
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        return false;
    }

    @Override
    public String toString()
    {
        return getClass() + "@" + hashCode();
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalized() method is overridden: is invoked by the garbage collector before object is being garbage collected.");
    }

    public static void main(String[] args) throws ClassNotFoundException
    {
        ObjectClassDemo obj = new ObjectClassDemo();
        System.out.println("getClass()---------------:" + obj.getClass());
        System.out.println("hashCode()---------------:" + obj.hashCode());
        System.out.println("equals(obj)---------------:" + obj.equals(new Object()));
        System.out.println("toString()---------------:" + obj.toString());

        System.out.println("=================================================");
        System.out.println("Different ways to create object:");
        System.out.println("1. By using \"new\" key word:" + new ObjectClassDemo());

        try
        {
            System.out.println("2. By implementing Cloanable and clone() :" + obj.clone());
            System.out.println("3. By using deserialization :");
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        try
        {
            System.out.println("*. By using Class.forName(\"ClassName\") : It gives Class details not instance:" + Class.forName("ObjectClassDemo"));
            System.out.println("*. By using Class.forName(\"ClassName\").newInstance() :  It internally uses new key word :" + Class.forName("ObjectClassDemo").newInstance());
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
