package org.corejava.interview.sapient.liftdesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GlobalRequestListener implements Runnable
{

    @Override
    public void run()
    {
        while(true)
        {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println(Thread.currentThread().getName()+" Request lift with floor number(-3,-2,-1,0,1,2,3,4,5,6):");
            try
            {
                Integer input=Integer.parseInt(reader.readLine());
                if(validate(input))
                {
                    ILift.reqOrCancelFloorGlobal(input);
                }
            }
            catch (IOException e)
            {
                System.err.println("Invalid input req.");
                e.printStackTrace();
            }
            try
            {
                Thread.currentThread().sleep(10000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
    private boolean validate(Integer in)
    {
        if(in<=6 && in>=-3)
        {
            return true;
        }
        System.err.println("Invalid input number.");
        return false;
    }

}
