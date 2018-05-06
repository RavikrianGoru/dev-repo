package learn.java.internal.sets;

import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class OtherSets
{
    public static void main(String[] args)
    {
        populateCopyOnWriteArraySet();
        populateLinkedHashSet();
        populateConcurrentSkipListSet();

    }

    public static void populateConcurrentSkipListSet()
    {
        /*
         * 
         * ConcurrentSkipListSet internally has ConcurrentNavigableMap(Interface) ConcurrentSkipListMap instance. Suitable for multithreaded
         * environment. log(n) time for add,remove,contains operations.
         * 
         * 
         */
        System.out.println("ConcurrentSkipListSet===== internal instance ConcurrentNavigableMap====== thread-safe, no nulls");
        ConcurrentSkipListSet<String> csls = new ConcurrentSkipListSet<>();
        // csls.add(null); Runtime Exception
        csls.add("Ravi");
        csls.add("Kiran");
        csls.add("Abhi");
        csls.add("Chinna");
        csls.add("Chotu");
        csls.add("Kumar");
        System.out.println("All elements forEach");
        for (String each : csls)
        {
            System.out.println(each);
        }

        System.out.println("Entire Map:" + csls);
    }

    public static void populateLinkedHashSet()
    {
        /*
         *
         * LinkedHashSet: extends HashSet. So, same HashSet internals with doubly linked list + insertion order. Hashtable and doubly-linkeds list
         * implementation if Set interface preserves insertion order. default capacity 16 load factor :0.75 allows null
         * 
         * 
         */
        System.out.println("LinkedHashSet=========== extends HasSet( doubly linked list + insertion order).");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add(null);
        lhs.add("Ravi");
        lhs.add("Kiran");
        lhs.add("Abhi");
        lhs.add("Chinna");
        lhs.add("Chotu");
        lhs.add("Kumar");
        System.out.println("All elements forEach");
        for (String each : lhs)
        {
            System.out.println(each);
        }

        System.out.println("Entire Map:" + lhs);
    }

    public static void populateCopyOnWriteArraySet()
    {
        /*
         * CopyOnWriteArraySet is thread safe & best suited when size is small and read-only
         * internally has CopyOnWriteArrayList instance.
         * 
         */
        System.out.println("CopyOnWriteArraySet=====internal instance CopyOnWriteArrayList======No ConcurrentModificationException, allows null");
        CopyOnWriteArraySet cowas = new CopyOnWriteArraySet();
        cowas.add(null);
        cowas.add("ravi");
        cowas.add(1);
        cowas.add(234.565);
        System.out.println(cowas);
    }
}
