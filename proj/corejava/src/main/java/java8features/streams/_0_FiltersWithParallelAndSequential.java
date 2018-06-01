package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _0_FiltersWithParallelAndSequential
{
    static List<Integer> intList=new ArrayList<>();
    
    public static void addElementsToList(int n)
    {
        for(int i=1;i<=n;i++)
        {
            intList.add(i);
        }
    }
    
    
    public static void main(String[] args)
    {
//        Collections and Java Stream
//        A collection is an in-memory data structure to hold values and before we start using collection, all the values should have been populated. 
//        Whereas a java Stream is a data structure that is computed on-demand.
        
//        Java Stream doesn’t store data, it operates on the source data structure (collection and array) and produce pipelined data that we can use and perform specific operations. 
//        Such as we can create a stream from the list and filter it based on a condition.
        
//        Stream operations used functional interfaces and lambda expressions.
//        Java 8 Stream support sequential as well as parallel processing, parallel processing can be very helpful in achieving high performance for large collections.
        
        
        
        System.out.println("Size of List(Before adding elements):"+intList.size());
        addElementsToList(10);
        System.out.println("Size of List(After adding elements):"+intList.size());
        
        System.out.println("Sequential Stream ------");
        Stream<Integer>seqStream= intList.stream();
        System.out.println("Is Parallel:"+seqStream.isParallel());
       
        Stream<Integer> evenSeqStreams=seqStream.filter( (a)->{return a%2==0;} );//Predicate--->boolean test(T t);
        System.out.println("Even filter of seq streams:(Ordered as it is sequential streams)");
        evenSeqStreams.forEach((a)->{System.out.println(a);});//Consumer---->void accept(T t);
        
        
        // Parallel processing will be very helpful while working with huge collections.
        System.out.println("Parallel Stream   ------");
        Stream<Integer>parallelStream=intList.parallelStream();
        System.out.println("Is Parallel:"+parallelStream.isParallel());
        
        Stream<Integer> oddParallelStream=parallelStream.filter( (b)->{return b%2!=0;} );//Predicate--->boolean test(T t);
        System.out.println("Odd filter of parallel streams:(Unordered as it is parallel streams)");
        oddParallelStream.forEach((b)->{System.out.println(b);});//Consumer---->void accept(T t);
    }

}
