package d_and_b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class _2_Integer_Number
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        System.out.println("List before remove:" + list);

        Iterator<Integer> itr = list.iterator();
        System.out.println("List item can be removed while iterating with iterator.remove() method. {No ConcurrentModificationException}");
        System.out.println("List item can not be removed while iterating with list.remove(-) method. {Throws ConcurrentModificationException}");

        while (itr.hasNext())
        {
            Object ob = itr.next();// ob%2 CT Error
            Integer obj = (Integer) itr.next();
            if (obj % 2 == 0)
            {
                itr.remove();// --------------------possible: removes the elements from list.
                // list.remove(obj);----------------not possible java.util.ConcurrentModificationException
                System.out.println("Removed element :" + obj);
            }
        }
        System.out.println("List after remove:" + list);

    }

}
