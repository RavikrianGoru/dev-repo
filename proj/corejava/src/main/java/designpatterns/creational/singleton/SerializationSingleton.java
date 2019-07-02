package designpatterns.creational.singleton;


public class SerializationSingleton
{

    private static final long serialVersionUID = -7604857685486587465L;

    private SerializationSingleton()
    {
    }

    private static class SingletonHelper
    {
        private static final SerializationSingleton INSTANCE = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }

}
