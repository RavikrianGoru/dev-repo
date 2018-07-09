package java8features.optional;

import java.util.Optional;

public class OptionalDemo
{

    public static void main(String[] args)
    {
        System.out.println("Java 8 has introduced a new class Optional in java.util package to check checking NullPointerException.");
        System.out.println("The main advantage is no more too many null checks");
        System.out.println("The Optional is a wrapper class which makes a field optional which means it may or may not have values.");
        
        Optional<String> opt=Optional.of(new String("Ravi"));
        System.out.println(opt.get());
    }

}
