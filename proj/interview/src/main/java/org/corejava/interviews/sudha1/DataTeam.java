package org.corejava.interviews.sudha1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DataTeam
{

    public static String getControllers(char[] c)
    {
        StringBuffer sb = new StringBuffer();
        boolean start1 = false, start2 = false;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < c.length; ++i)
        {
            if (c[i] == 'I' && start1 == false)
            {
                count1 = 1;
                start1 = true;
                start2 = false;
            }
            else if (c[i] == 'I' && start1 == true)
            {
                count1++;
                sb.append(count1).append(',');
                start1 = false;
                start2 = false;
                count1 = 0;
            }
            else if (c[i] == 'C' && start2 == false)
            {
                count2 = 1;
                start2 = true;
                start1 = false;
            }
            else if (c[i] == 'C' && start2 == true)
            {
                count2++;
                sb.append(count2).append(',');
                start2 = false;
                start1 = false;
                count2 = 0;
            }
            else if (c[i] == '.' && start1 == true)
            {
                count1++;
            }
            else if (c[i] == '.' && start2 == true)
            {
                count2++;
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        return sb.toString();
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // br.readLine();
        System.out.println("Enter Inputs:");
        String input1 = "...I...C...C...I...I...I.I.I.....C.....C....CC";// br.readLine();
        System.out.println(getControllers(input1.toCharArray()));

        String case1_InputOne = "203,204,205,206,207,208,203,204,205,206";
        String case1_inputTwo = "204,204,203,209,206,203,201,208,205,205";
        getOrderedUniqueElements(case1_InputOne, case1_inputTwo);

        String case2_InputOne = "203,204,205,203,204";
        String case2_inputTwo = "204,203,205,203,204";
        getOrderedUniqueElements(case2_InputOne, case2_inputTwo);
    }

    public static void getOrderedUniqueElements(String inputOne, String inputTwo)
    {
        // Get unique ordered number from inputOne and inputTwo separated by ','
        TreeMap<String, Integer> ts = new TreeMap<>();

        for (String each : inputOne.split(","))
        {
            if (ts.containsKey(each))
            {
                ts.put(each, ts.get(each) + 1);
            }
            else
            {
                ts.put(each, 0);
            }
        }
        for (String each : inputTwo.split(","))
        {
            if (ts.containsKey(each))
            {
                ts.put(each, ts.get(each) - 1);
            }
            else
            {
                ts.put(each, 0);
            }
        }
        StringBuffer sb = new StringBuffer();
        for (Entry<String, Integer> each : ts.entrySet())
        {
            if (each.getValue() == 0)
            {
                sb.append(each.getKey()).append(",");
            }
        }
        if (sb.lastIndexOf(",") != -1)
        {
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        
        if (sb.length() == 0)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println(sb.toString());
        }
    }

}
