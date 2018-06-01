package java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _0_0_Streams
{

    public static void main(String[] args)
    {

        // Each Stream class represents a single-use sequence of data and supports several I/O operations. we can not reuse the same stream.
        Stream<Integer> stream1=Stream.of(1,11,22,33,44,55);
        stream1.forEach((a)->{System.out.println(a);});
        // stream1.forEach((b)->{System.out.println(b);});//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        System.out.println("Supplier<Stream<T>> supplier can be used for resuable operations. supplier.get() returns new Stream");
        Supplier<Stream<Integer>> supplier= ()->Stream.of(new Integer[] {1,10,20,30,40,50});
        supplier.get().forEach((a)->{System.out.println(a);});
        supplier.get().forEach((a)->{System.out.println(a);});
        
        
        System.out.println("Concate two streams:");
        Stream<Integer> s1=Stream.of(1,11,22,33,44,55);//homogeneous data
        Stream<Integer> s2=Stream.of(new Integer[] {1,10,20,30,40,50});//array
        Stream<Integer> concatinatedStream=Stream.concat(s1, s2);
        concatinatedStream.forEach((a)->{System.out.println(a);});
        
        
        System.out.println("Collection.stream() and Collection.parallelStream() can be used to create Stream");
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Stream<Integer> str1=list.stream();                                 //-----1
        Stream<Integer> str2=list.parallelStream();                         //-----2

        IntStream intS1= Arrays.stream(new int[] {1,2,3});                  //-----3
        intS1.forEach((a)->{System.out.println(a);});
        
        DoubleStream doubleS1= Arrays.stream(new double[] {1.5,2.5,3.5});   //----4
        doubleS1.forEach((a)->{System.out.println(a);});
        
        String strOne="This is ravikiran";
        IntStream fromString=strOne.chars();            //-------------5
        fromString.forEach((a)->{System.out.println(a);});
        
        
     // Function and BiFunction: Function represents a function that takes one type of argument and returns another type of argument.
        // map(-)
        // mapToInt(-)
        // flatMapToInt(-)
        // toArray(-)
        
        // Predicate and BiPredicate: It represents a predicate against which elements of the stream are tested. This is used to filter elements from the java stream.
        // filter(-)
        // anyMatch(-)
        // allMatch(-)
        // noneMatch(-)
        
        // Consumer and BiConsumer: It represents an operation that accepts a single input argument and returns no result. 
        // It can be used to perform some action on all the elements of the java stream.
        // peek(-)
        // forEach(-)
        // forEachOrdered(-)
        
        // Supplier: Supplier represent an operation through which we can generate new values in the stream.
        // generate(-)
        // collect(-)
        
        // java.util.Optional: Java Optional is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
        // reduce(-)
        // min(-)
        // max(-)
        // findFirst()
        // findAny()
    }
    

}
