package java8features.streams;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class _3_StreamTerminalOpts
{

    public static void main(String[] args)
    {
        ConcurrentHashMap<String,List<Double>> opriceMap =new ConcurrentHashMap<>();
        
        Supplier<Stream<Integer>> streamSupplier=()->Stream.of(3,1,3,3,6,6);

        System.out.println("----- Optional<Integer> optn=streamSupplier.get().findFirst();");
        Optional<Integer> optn=streamSupplier.get().findFirst();
        if(optn.isPresent())
            System.out.println(optn.get());
        
        System.out.println("----- Optional<Integer> optn1=streamSupplier.get().reduce((a,b)->{return a*b;});");
        Optional<Integer> optn1=streamSupplier.get().reduce((a,b)->{return a*b;});
        if(optn1.isPresent())
            System.out.println(optn1.get());
        
        System.out.println("----- streamSupplier.get().count();");
        long count=streamSupplier.get().count();
        System.out.println("count :"+count);
        
        System.out.println("----- streamSupplier.get().distinct().forEach((a)->{System.out.println(a);});");
        streamSupplier.get().distinct().forEach((a)->{System.out.println(a);});
        
        //we don’t have any order defined for parallel processing. If we use sequential stream, then this problem will not arise.

        //Once a Stream is consumed, it can’t be used later on. 
        
        //There are a lot of methods in Stream API and the most confusing part is the overloaded methods. It makes the learning curve time taking.
        
    }

}
