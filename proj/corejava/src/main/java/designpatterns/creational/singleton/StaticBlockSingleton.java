package designpatterns.creational.singleton;

public class StaticBlockSingleton
{
    private StaticBlockSingleton()
    {
    }

    private static final StaticBlockSingleton instance;

    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Exception occured while creating singleton class instance.");
        }
    }

    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}
