package learn.java.basic;

public class ClassLoaderDemo
{

    /*
     * 
     * ClassLoader: Java ClassLoader loads a java class file into java virtual machine.
     * 
     * [[1]] <<Bootstrap class loader:>> It is responsible to load core Java API classes i.e. the classes present in rt.jar
     * 
     * It loads core java API classes from <JAVA_HOME/jre/lib directory>(bootstrap path).
     * 
     * Bootstrap class loader loads java�s core classes like java.lang, java.util etc.
     * 
     * <This is implemented by native languages like C C++.>
     * 
     * [[2]] <<Extension class loader:>> Child of Bootstrap class loader implemented by java.
     * 
     * It loads classes form <JAVA_HOME/jre/lib/ext> or any other path specified by <java.ext.dirs> path
     * 
     * JVM implemented extension class loader is <sun.misc.Launcher$ExtClassLoader> class.
     * 
     * [[3]] <<System/Application class loader:>>It is child of extension class loader. It loads classes from <application path> or any other from
     * environment variable <java.class.path>.
     * 
     * JVM implemented extension class loader is <sun.misc.Launcher$AppClassLoader> class.
     * 
     * We can see more class loaders like java.net.URLClassLoader, java.security.SecureClassLoader etc. Those are all extended from
     * java.lang.ClassLoader
     * 
     * 
     * ClassLoader Delegation:
     * 
     * When requested to find a class or resource, a ClassLoader instance will delegate the search for the class or resource to its parent class
     * loader before attempting to find the class or resource itself.
     * 
     * A proper class loader implementation will:
     * 
     * 1) Check if the class has already been loaded.
     * 
     * 2) Typically ask the parent class loader to load the class
     * 
     * 3) Attempt to find the class in its own class path.
     * 
     * 
     * 
     * when JVM required any class ----> check .class is loaded or not in method area.
     * 
     * ----> if already loaded in method area. JVM consider it it is loaded.
     * 
     * ----> JVM request to Class Loader Sub System to load perticular class
     * 
     * ----> Class Loader Sub System handovers the req to Application Class loader
     * 
     * ----> Delegate req to Applicaltion Class Loader ---> to Extention Class Loader ---> to BootStrap Class Loader
     * 
     * ----> Bootstrap class loader checks the class in jre/lib path's rt.jar. if available loades the class. else delegate req to Extention class
     * loader
     * 
     * ----> Extention class loader checks the class in jre/lib/ext. if available loades the class. else delegate req to Application class loader
     * 
     * ----> Application class loader checks the class in class path. if available loades the class. else throws RunTime
     * Exception(ClassNotFoundException).
     * 
     */
    public static void main(String[] args)
    {
        System.out.println("The classes available in <JAVA_HOME/jre/lib directory>. can be loaded by Boostrap class loader.");
        System.out.println("Bootstarp class loaders are implemented by native languages, it gives null");
        System.out.println(String.class.getClassLoader());
        System.out.println(Class.class.getClassLoader());

        System.out.println("Any application class would be loaded by application/system class loader");
        System.out.println(ClassLoaderDemo.class.getClassLoader());
    }

}
