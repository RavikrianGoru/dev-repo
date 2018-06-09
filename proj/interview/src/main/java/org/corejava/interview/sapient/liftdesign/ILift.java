package org.corejava.interview.sapient.liftdesign;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public interface ILift
{
    AtomicReference<TreeSet<Integer>> ref=new AtomicReference<TreeSet<Integer>>(new TreeSet<>());
    public void nextFloorUp();
    public void nextFloorDown();

    public static void reqOrCancelFloorGlobal(Integer reqGFloor)
    {
        System.out.println("Global:" + ref.get());
        if (!ref.get().remove(reqGFloor))
        {
            System.out.println("Req floor:" + reqGFloor);
            ref.get().add(reqGFloor);
        }
        System.out.println("Cancel selected floor:" + reqGFloor);
        System.out.println("After reqOrCancel Global:" + ref.get());
    }

    public void reqOrCancelFloorLlobal(Integer reqLFloor);

}
