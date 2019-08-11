package org.corejava.interview.sapient;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissigLetterFromPangrams
{

    public static void main(String[] args)
    {
        String pangramSt="abcdefghijlmnopqrstuvwxyz";
        findMissingLetter(pangramSt);
    }

    public static void findMissingLetter(String pangramSt)
    {
        int c[]=new int[26];
        int each;
        for(int i=0;i<pangramSt.length();i++)
        {
            each=pangramSt.charAt(i);
            each=each%97;
            c[each]=c[each]+1;
        }
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==0)
            {
            System.out.println((char)(i+97)+" is the missing letter occured "+c[i]+" times");
            }
        }
    }

}
