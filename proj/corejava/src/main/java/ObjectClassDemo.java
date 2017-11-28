public class ObjectClassDemo
{

    public static void main(String[] args)
    {
        Object obj = new ObjectClassDemo();
        System.out.println("getClass()---------------:"+obj.getClass());
        System.out.println("hashCode()---------------:"+obj.hashCode());
        System.out.println("equals(obj)---------------:"+obj.equals(new Object()));
        System.out.println("toString()---------------:"+obj.toString());
//        obj.finalize();
        obj=null;
    }

    @Override
    public int hashCode()
    {
        System.out.println("hashCode() method is overridden");
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("equals() method is overridden");
        return false;
    }

    @Override
    public String toString()
    {
        System.out.println("toString() method is overridden");
        return "";
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("Finalized() method is overridden: is invoked by the garbage collector before object is being garbage collected.");
    }

}
