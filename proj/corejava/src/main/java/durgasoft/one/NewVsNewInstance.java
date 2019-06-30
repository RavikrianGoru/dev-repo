package durgasoft.one;

public class NewVsNewInstance
{

    public NewVsNewInstance()
    {
        System.out.println("NewVsNewInstance obj created.");
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {

        // dynamic classs
        // ClassNotFoundException is checked
        // default constructor is mandatory else InstantiationException
        Class.forName("durgasoft.one.NewVsNewInstance").newInstance();

        // Know at beginning
        // NoClassDefFoundError is unchecked.
        NewVsNewInstance obj = new NewVsNewInstance();

    }

}
