package org.corejava.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfWordsInString
{

    public static void main(String[] args)
    {
        // " This is input data. please find no of words in it. ";
        // "This is input data. please find no of words in it."
        String input = "This is  input data.   please find no of words in it.";
        wordCountPattern(input);
        wordCount(input);
    }

    private static void wordCountPattern(String input)
    {
        int noOfWords = 0;
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(input);
        while (m.find())
        {
            System.out.println(m.group());
            noOfWords++;
        }
        System.out.println("total number of words:" + noOfWords);
    }

    private static void wordCount(String input)
    {
        int noOfWords = 0;
        boolean isWordStarted = false;
        // "This is input data. please find no of words in it."
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == ' ' && isWordStarted)
            {
                noOfWords++;
                isWordStarted = false;
            }
            else if (charArray[i] != ' ' && !isWordStarted)
            {
                isWordStarted = true;
            }
            else if (charArray[i] != ' ' && i == input.length() - 1 && isWordStarted)
            {
                noOfWords++;
            }
        }

        System.out.println("total number of words:" + noOfWords);
    }

}
