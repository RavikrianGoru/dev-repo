package designpatterns.creational.singleton;

public enum EnumSingleton
{
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void doMethod()
    {
        System.out.println("Accessing EnumSingleton class instance.");
    }


}
