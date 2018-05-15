package java8features.functionalinterface;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.apache.log4j.helpers.SyslogQuietWriter;
import org.apache.log4j.net.SyslogAppender;

@FunctionalInterface
interface AddtionaInf
{
    public int add(int a, int b);

    // public int add(int a, int b, int c);
    // Fonctional interface must have only one abstract method.
    default int increment(int a)
    {
        return ++a;
    }

    static int decrement(int a)
    {
        return --a;
    }
}

public class CustomeFunctionalInterfaceDemo
{
    AddtionaInf intF=null;
    public CustomeFunctionalInterfaceDemo(AddtionaInf intF)
    {
        this.intF=intF;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Hi, Here we created one fuctional interface with abstarct add(-,-) method which resturn addtion of two numbers.");
        System.out.println("& this functionl interface contins one default and one static method.");
        
        System.out.println("\nCustomeFunctionalInterfaceDemo is concreate class with single arg constructor. \n public CustomeFunctionalInterfaceDemo(AddtionaInf intF)");
        System.out.println( "\nWe are going to calls 1-arg constructor by passing lambdat expression of AddtionaInf implementation");
            
        CustomeFunctionalInterfaceDemo obj=new CustomeFunctionalInterfaceDemo(
                (a,b)-> {
                            System.out.println("This is add(-,-)");
                            return (a+b);
                        }
                );
        int sum=obj.intF.add(2, 3);
        System.out.println("addtion if 2,3="+sum);
    }   

}
