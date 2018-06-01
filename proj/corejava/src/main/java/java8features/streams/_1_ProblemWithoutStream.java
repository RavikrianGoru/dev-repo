package java8features.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_ProblemWithoutStream
{
    static List<Integer> intList = new ArrayList<>();

    public static void main(String[] args)
    {
        addElementsToList(10000);
        getSumByIterator();
        getSumByStream();
        
    }

    public static void getSumByStream()
    {
        // Internal iteration provides several features such as sequential and parallel execution, filtering based on the given criteria, mapping etc
        long sum=intList.stream().filter((p)->{return p>10?true:false;}).mapToLong((i)->{ return (long)i;}).sum();
        System.out.println("Sum of with Streams:"+sum);
    }
    
    public static void addElementsToList(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            intList.add(i);
        }
    }
    public static void getSumByIterator()
    {
        // Problem-1. find the sum of all elements which are >10
        // Sequential,
        // Iterator used here
        // more lines of code
        
        Iterator<Integer> itr=intList.iterator();
        int sum=0,i;
        while(itr.hasNext())
        {
            i=itr.next();
            if(i>10)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of with Iterator:"+sum);
    }
    

}
