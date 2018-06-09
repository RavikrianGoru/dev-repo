package org.corejava.interview.sapient;

class SingletonDC
{
    private static volatile SingletonDC _instance=null;
    public static SingletonDC getInstanceDC() {
        if (_instance == null) {                // Single Checked: make _intsance as volatile to resolve a half initialized instance of singleton
            synchronized (SingletonDC.class) {
                if (_instance == null) {        // Double checked
                    _instance = new SingletonDC();
                }
            }
        }
        return _instance;
}
}
public class DoubleCheckedSingleton
{
    public static void main(String args[])
    {
        // it’s been asked to code double checked locking of Singleton by hand on companies
        System.out.println("Project: EventGeneration.java locadsschemas and created CelDeserialization.java instance");
        System.out.println("private class variable and synchronized factory method: singleton but expensive due to synchronized method");
        System.out.println("when we use synchronized block we need double check and volatile class variable");

    }
}
