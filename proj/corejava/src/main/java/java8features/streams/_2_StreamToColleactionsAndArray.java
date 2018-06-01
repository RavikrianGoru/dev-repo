package java8features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _2_StreamToColleactionsAndArray
{

    public static void main(String[] args)
    {
        Supplier<Stream<Integer>> st1=()->Stream.of(1,2,3,5,6,4,77);
        
        System.out.println("List from Stream:"+st1.get().collect(Collectors.toList()));
        System.out.println("Set from Stream:"+st1.get().collect(Collectors.toSet()));
        Map<Integer,Integer> map=st1.get().collect(Collectors.toMap((a)->{return a;},(a)->{return a+10;}));
        System.out.println("Map from Stream:"+map);
        Map<Integer,Integer> concurrentMap=st1.get().collect(Collectors.toConcurrentMap((a)->{return a;}, (a)->{return a+5;}));
        System.out.println("Concurrent Map from Stream:"+concurrentMap);
        
        
        Integer[] a=st1.get().toArray(Integer[]::new);
        for(int s:a)
        {
            System.out.println(s);
        }
        
        
        System.out.println("-------------stream.map((a)->{retrun a.toUpper();}).collect(Collectors.toList());");
        System.out.println("stream.map(-): we can update elements and collect those in any Collections.");
        Stream<String> stringStream=Stream.of("Ravi","kiran","goru", "Chinna","Devi");
        
        // Stream map() example: We can use map() to apply functions to an stream. Let’s see how we can use it to apply upper case function to a list of Strings.
        List<String> list=stringStream.map((a1)->{return a1.toUpperCase();}).collect(Collectors.toList());
        System.out.println(list);
        
        String[] s= {"Rhi", "fsdfd", "fsdfsd", "kdfj"};
        Stream<String> s1=Stream.of(s);
        System.out.println(s1.map((aa)->{return aa.toLowerCase();}).collect(Collectors.toList()));
        
        
        // Stream filter() example: We can use filter() method to test stream elements for a condition and generate filtered list.
        
        System.out.println("-------------stream.filer((a)->{return a%2=0;}).forEach((a)->{System.out.println(a);})");
        st1.get().filter((d)->{return d%2==0;}).forEach((d)->{System.out.println(d);});

        // Stream sorted() example: We can use sorted() to sort the stream elements by passing Comparator argument.
        System.out.println("-----stream.sorted().forEach((a)->{System.out.println(a);})--- will give default sorted order.");
        st1.get().sorted().forEach((a1)->{System.out.println(a1);});
        System.out.println("-----stream.sorted(Collections.reverseOrder()).forEach((a)->{System.out.println(a);})--- will give reverse sorted order.");
        st1.get().sorted(Collections.reverseOrder()).forEach((a1)->{System.out.println(a1);});

        
        System.out.println("--------streamList.flatMap(stringList->stringList.stream());---");
        Stream<List<String>> streamList=Stream.of(
                                                    Arrays.asList("Hi", "Hey"),
                                                    Arrays.asList("Hi", "Ravi"),
                                                    Arrays.asList("Hi", "Anitha"),
                                                    Arrays.asList("Bye", "Bye")
                                                 );
        Stream<String> flarStream=streamList.flatMap(stringList->stringList.stream());
        flarStream.forEach((s3)->{System.out.println(s3);});
    }

}
