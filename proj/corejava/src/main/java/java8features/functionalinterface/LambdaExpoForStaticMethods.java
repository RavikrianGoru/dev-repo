package java8features.functionalinterface;

import java.util.Arrays;
import java.util.Comparator;

class Person
{
    public String fName;
    public String lName;
    public int age;

    //static comparators    
    public static Comparator<Person> compareFirstName=(lsh,rhs)->{return lsh.fName.compareTo(rhs.fName);};
    public static Comparator<Person> compareLastName=(lsh,rhs)->{return lsh.lName.compareTo(rhs.lName);};
    public static Comparator<Person> compareAge=(lsh,rhs)->{return lsh.age-rhs.age;};

    Person(String fName, String lName, int age)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
    }
}

public class LambdaExpoForStaticMethods
{
    public static void main(String[] args)
    {
        Person p1 = new Person("ravi", "Kiran", 20);
        Person p2 = new Person("Kumar", "Tanu", 30);
        Person p3 = new Person("Chinna", "Babu", 40);
        Person p4 = new Person("Anil", "Kota", 50);
        Person[] p = new Person[]{ p1, p2, p3, p4 };
        
        System.out.println("Actual Data unsorted:-----------");
        printArray(p);

        System.out.println("Actual Data sorted by lName:-----------");
        Arrays.sort(p,(lhs,rhs)->{return lhs.lName.compareTo(rhs.lName);});
        printArray(p);
        
        //Here it automaticall takes Person type at rhs.
        Comparator<Person> fNameComparator=(lsh,rhs)->{return lsh.fName.compareTo(rhs.fName);};
        Arrays.sort(p,fNameComparator);
        System.out.println("Actual Data sorted by fName:-----------");
        printArray(p);

 /*       //Here it automaticall takes Person type at rhs.
        Comparator<Person> lNameComparator=(l,r)->{return l.lName.compareTo(r.lName);};
        Arrays.sort(p,lNameComparator);
        System.out.println("Actual Data sorted by lName:-----------");
        printArray(p);
        
        //Here it automaticall takes Person type at rhs.
        Comparator<Person> ageComparator=(lhs,rhs)->{return lhs.age-rhs.age;};
        Arrays.sort(p,ageComparator);
        System.out.println("Actual Data sorted by age:-----------");
        printArray(p);*/
        
        
        //Here we used static comparator from Person class itself
        Arrays.sort(p, Person.compareFirstName);
        System.out.println("Actual Data sorted by First Name:-----------");
        printArray(p);

    }

    public static void printArray(Person[] p)
    {
        for(Person e:p)
        {
            System.out.println(e);
        }
    }
}
