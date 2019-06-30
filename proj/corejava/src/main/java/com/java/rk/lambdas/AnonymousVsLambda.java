package com.java.rk.lambdas;

import java.util.Comparator;

public class AnonymousVsLambda
{

    public static void main(String[] args)
    {
        //Way-1
        Comparator<String> stringComparator = new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return o1.compareTo(o2);
            }
            
        };
        
        int strComparison  = stringComparator.compare("Hello", "World");
        System.out.println(strComparison);
        
        //Way-2
        Comparator<String> stringComparatorLambda=(o1,o2)->o1.compareTo(o2);
        int strComparisonLambda  = stringComparatorLambda.compare("Hello", "World");
        System.out.println(strComparisonLambda);
        
        
    }

}
