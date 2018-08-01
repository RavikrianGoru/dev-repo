package accessmodifiers.subpack;

public class PublicClass
{
    public int pubInt = 10;
    int defInt = 20;
    protected int protInt = 30;
    private int priInt = 40;

    public PublicClass()
    {
        System.out.println("accessmodifiers.subpack.PublicClass()");
    }

    void defM()
    {
        System.out.println("default method:defM()");
    }

    public void pubM()
    {
        System.out.println("public method:pubM()");
    }
    
    protected void protM()
    {
        System.out.println("protected method");
    }

    private void priM()
    {
        System.out.println("private method");
    }
}
