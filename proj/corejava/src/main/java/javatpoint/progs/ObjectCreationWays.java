package javatpoint.progs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student implements Serializable, Cloneable
{
    private static final long serialVersionUID = 7889839652913593002L;
    String name;
    int age;
    String standard;

    Student()
    {
    }
    public Student(String name, int age, String standard)
    {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "Student [name=" + name + ", age=" + age + ", standard=" + standard + "]";
    }

    
}

public class ObjectCreationWays
{

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException, IllegalArgumentException, InvocationTargetException
    {
        
        System.out.println("1. By using new keyword");
        Student st1=new Student("ravi", 17, "12");
        System.out.println(st1);
        
        System.out.println("2. By using class.forName(\"className\").newIndtance()");
        Student Obj1=(Student)Class.forName("javatpoint.progs.Student").newInstance();
        System.out.println(Obj1);
        
        System.out.println("3. By clone() on Clonable object");
        Student st2=(Student)st1.clone();
        System.out.println(st2);
        
        System.out.println("4. By Deserialization object");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\corejava\\src\\main\\resources\\txt\\student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st1);
        
        FileInputStream fis=new FileInputStream("C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\corejava\\src\\main\\resources\\txt\\student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student st3=(Student)(ois.readObject());
        System.out.println(st3);
        
        System.out.println("5. By Reflection API object");
        Constructor<Student>[] studentConstructors=(Constructor<Student>[]) Student.class.getDeclaredConstructors();
        System.out.println(studentConstructors[0].newInstance());
        
    }

}
