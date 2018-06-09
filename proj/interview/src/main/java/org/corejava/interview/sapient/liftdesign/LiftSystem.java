package org.corejava.interview.sapient.liftdesign;

import java.util.TreeSet;

public class LiftSystem
{

    public static void main(String[] args)
    {
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        
//        Thread gloReq=new Thread(new GlobalRequestListener(),"Glo_Req_Name");
//        gloReq.start();
        
        TreeSet<Integer> s1=new TreeSet<Integer>();
        TreeSet<Integer> s2=new TreeSet<Integer>();
        Integer cel=-3;
        System.out.println(s1.ceiling(cel));
        System.out.println(s2.ceiling(cel));
        
        
        
    }

}
