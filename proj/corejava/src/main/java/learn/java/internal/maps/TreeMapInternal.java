package learn.java.internal.maps;

import java.util.ConcurrentModificationException;
import java.util.TreeMap;

public class TreeMapInternal
{
/*
 
     TreeMap is 2-d Collection stores data in (key,value) pairs lly to HashMap but it sorts entries based on key(asc).
     TreeMap is a Red-Black tree based NavigableMap implementation.
     It takes O(log n) for containskey(-),get(-), put(-,-) & remove(-) operations.
     No Synchronization/thread-safty.
     Fail-fast iterator: throws ConcurrentModificationException.
     
     //Red-Black Tree Algo psudo code:
     Red Black algorithm is a complex algorithm . We should read the pseudo code of Red Black algorithm in order to understand the internal implementation .
     
     
     Collections.synchronizedSortedMap(-) to get thread-safe SortedMap. it locks entire Map object.
     
     TreeMap() /TreeMap(-):
     we can pass Conparator object to sort entries of map in specific order.
     By using default TreeMap() constructor while adding elemnts put(-,-) has the logic to compare based on key( key.compareTo(-) then no comparator object initialized.
     
 
 
 
 
 
 
 */
    public static void main(String[] args)
    {
        TreeMap tm = new TreeMap();
    }

}
