package com.gfg.javabeats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class SpiderWellUpDownSingleStep
{
    public static void findNoOfSteps(String a[])
    {
        int h = Integer.parseInt(a[0].trim());
        int u = Integer.parseInt(a[1].trim());
        int d = Integer.parseInt(a[2].trim());
        int temp = 0, steps = 0;
        temp += u;
        steps++;
        while (h >= temp)//to reache pole (>) & out of well (>=)
        {
            temp -= d;
            temp += u;
            steps++;
        }
        System.out.println(steps);
    }

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of Test Cases:");//2
        int nofTCs = Integer.valueOf(br.readLine());// 200 50 1
        String[] input = new String[nofTCs];//500 20 15
        for (int i = 0; i < nofTCs; i++)
        {
            System.out.println("Enter h u d:");
            input[i] = br.readLine();
        }
        for (int i = 0; i < nofTCs; i++)
        {
            findNoOfSteps(input[i].split(" "));
        }
    }
    
    ////17942987 UHGabc@123567
}
