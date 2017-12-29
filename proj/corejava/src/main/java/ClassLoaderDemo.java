public class ClassLoaderDemo
{

    public static void main(String[] args)
    {
        System.out.println("Bootstarp class loaders are implemented by native languages, it gives null");
        System.out.println(String.class.getClassLoader());
        System.out.println(Class.class.getClassLoader());
        
        System.out.println("Any application class would be loaded by application/system class loader");
        System.out.println(ClassLoaderDemo.class.getClassLoader());
    }

}
