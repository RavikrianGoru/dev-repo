package org.corejava.interview.sapient.liftdesign;

import java.util.TreeSet;

public class Lift implements ILift, Runnable
{
    private TreeSet<Integer> localReqs = new TreeSet<Integer>();// TreeSet is fine as it is local
    private Integer currentFloor = -3;
    private Integer destFloor = -3;

    private boolean DIRECTION_UP_DOWN = true;// true=up and false=down

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                Integer gloTemp = null;
                Integer locTemp = null;
                Integer min = null;
                if (ILift.ref.get().isEmpty() && localReqs.isEmpty())
                {
                    System.out.println("No Request: " + Thread.currentThread().getName() + " is stoped at the floor " + currentFloor);
                    Thread.currentThread().sleep(5000);
                }
                else if (!ILift.ref.get().isEmpty() && !localReqs.isEmpty())
                    {
                        gloTemp = ILift.ref.get().ceiling(currentFloor);
                        locTemp = localReqs.ceiling(currentFloor);

                        if (gloTemp == null && locTemp == null)
                        {
                            DIRECTION_UP_DOWN = !DIRECTION_UP_DOWN;
                            continue;
                        }
                        else if (gloTemp != null && locTemp != null)
                        {
                            min = Math.min(gloTemp, locTemp);
                        }
                        else if (gloTemp != null)
                        {
                            min = gloTemp;
                        }
                        else if (locTemp != null)
                        {
                            min = locTemp;
                        }
                    }else if(!ILift.ref.get().isEmpty())
                    {
                        
                    }

                    System.out.println(Thread.currentThread().getName() + ":-----:Moved to " + min + "--Floor");
                    localReqs.remove(min);
                    ILift.ref.get().remove(min);

                Thread.currentThread().sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

    }

    @Override
    public void nextFloorUp()
    {
        System.out.println("Next Move Global Req:" + ref.get());
        System.out.println("Next Move Local Req:" + localReqs);
        System.out.println("Current floor:" + currentFloor);
    }

    @Override
    public void nextFloorDown()
    {
        System.out.println("Next Move Global Req:" + ref.get());
        System.out.println("Next Move Local Req:" + localReqs);
        System.out.println("Current floor:" + currentFloor);
    }

    @Override
    public void reqOrCancelFloorLlobal(Integer reqLFloor)
    {
        System.out.println("Local:" + localReqs);
        if (!localReqs.remove(reqLFloor))
        {
            System.out.println("Req floor:" + reqLFloor);
            localReqs.add(reqLFloor);
        }
        System.out.println("Cancel selected floor:" + reqLFloor);
        System.out.println("After reqOrCancel Local:" + localReqs);
    }

}
