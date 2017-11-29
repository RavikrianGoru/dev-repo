package org.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReadOnlyListSetMap
{

    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add("ravi");
        list.add("kiran");
        list = Collections.unmodifiableList(list);
        System.out.println(list);
        try
        {
            list.add("goru");
        }
        catch (Exception e)
        {
            System.err.println("Cannot modify Collections.unmodifiableList(-):" + e);
        }

        Set set = new HashSet();
        set.add("ravi");
        set.add("kiran");
        set = Collections.unmodifiableSet(set);
        System.out.println(set);
        try
        {
            set.add("goru");
        }
        catch (Exception e)
        {
            System.err.println("Cannot modify Collections.unmodifiableSet(-):" + e);
        }

        SortedSet sortedSet = new TreeSet();
        sortedSet.add("ravi");
        sortedSet.add("kiran");
        sortedSet = Collections.unmodifiableSortedSet(sortedSet);
        System.out.println(sortedSet);
        try
        {
            sortedSet.add("goru");
        }
        catch (Exception e)
        {
            System.err.println("Cannot modify Collections.unmodifiableSortedSet(-):" + e);
        }

        Map map = new HashMap();
        map.put(1, "ravi");
        map.put(2, "kiran");
        map = Collections.unmodifiableMap(map);
        System.out.println(map);
        try
        {
            map.put(3, "goru");
        }
        catch (Exception e)
        {
            System.err.println("Cannot modify Collections.unmodifiableMap(-):" + e);
        }

        SortedMap sortedMap = new TreeMap();
        sortedMap.put(1, "ravi");
        sortedMap.put(2, "kiran");
        sortedMap = Collections.unmodifiableSortedMap(sortedMap);
        System.out.println(sortedMap);
        try
        {
            sortedMap.put(3, "goru");
        }
        catch (Exception e)
        {
            System.err.println("Cannot modify Collections.unmodifiableSortedMap(-):" + e);
        }

    }

}
