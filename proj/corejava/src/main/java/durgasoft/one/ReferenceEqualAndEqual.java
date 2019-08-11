package durgasoft.one;

public class ReferenceEqualAndEqual
{

    public static void main(String[] args)
    {

        System.out.println("== and instaneof operator need compatable types else Compile time errors");
        String s = "Hi";
        Object o = new Object();
        Thread t = new Thread();
        System.out.println(s == o);
        System.out.println(t == o);
        // System.out.println(s == t);// CE: System.out.println(s == t); there is no parent child relation between Thread and String

        String n = null;
        System.out.println(n == null);// true

        System.out.println(s instanceof Object);// true String and object has parent-child relation
        // System.out.println(s instanceof Thread);//C.E as nor relation
        
        StringBuilder sbuilder = new StringBuilder("Ravi");
        String s1 = new String("Ravi");
        StringBuffer sbuf1 = new StringBuffer("Ravi");

         //System.out.println(sbuf1 == sbuilder);//C.E no relation
        // System.out.println(sbuf1 instanceof StringBuilder);//C.E no relation
        
        

    }

}
