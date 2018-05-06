package learn.java.internal.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import learn.java.internal.EmpPojo;;;

public class ThreadSafeHashMap
{

    public static void main(String[] args)
    {

        /*
        (Full concurrency)
        0) Hashtable is synchronized: All methods get,contains,put,remove.....
        1) Hashtable does not allow null keys, null values
        2) The Objects used as keys must implement the equals() and hashCode() methods.
        3) The capacity(default initial capacity 11) is the number of buckets in the hash table.
        4) The load factor(default .75)  is a measure of how full the hashtable is allowed to get before its capacity is automatically increased.
        5) Fail-fast: Throws ConcurrentModificationException when tries to do structural changes while iteration hashtable.
           modCount....
           
        
        0) ConcurrentHashMap is synchronized except retrieval operations.
        1) default capacity=16, load factor:0.75
        2) ConcurrentHashMap does not allow null for key/value
        
        
        
        */
        populateStringHashtable();
        populateEmpPojoHashtable();
        collectionsSynchronizedMap();
        populateConcurrentHashMap();
        
        
    }

    public static void populateConcurrentHashMap()
    {
        System.out.println("=======ConcurrentHashMap chm=new ConcurrentHashMap();==========no null key & value===");
        ConcurrentHashMap chm=new ConcurrentHashMap();
        //chm.put(null, "val1"); Runtime Excpetion when key is null.
        //chm.put("key", null); Runtime Excpetion when value is null.
        chm.put("Ravi", "One");
        System.out.println(chm);
    }

    public static void collectionsSynchronizedMap()
    {
        System.out.println("=======Map m=Collections.synchronizedMap(hm);=============");
        HashMap hm=new HashMap();
        hm.put(null, "value1");
        hm.put(null, "value2");
        hm.put("key1", null);
        hm.put("key2", null);
        System.out.println(hm);
        Map m=Collections.synchronizedMap(hm);
        System.out.println(m);
    }

    public static void populateEmpPojoHashtable()
    {
        System.out.println("====================");
        Hashtable <EmpPojo,String>hb=new Hashtable<>();
        EmpPojo e1=new EmpPojo(1,"ravi1",1000);
        EmpPojo e2=new EmpPojo(2,"ravi2",1000);
        EmpPojo e3=new EmpPojo(3,"ravi3",1000);
        EmpPojo e4=new EmpPojo(1,"ravi1",1000);
        
        System.out.println("hb.put(e1, \"One\")----"+hb.put(e1, "One"));
        System.out.println("hb.put(e2, \"Two\")----"+hb.put(e2, "Two"));
        System.out.println("hb.put(e3, \"Three\")----"+hb.put(e3, "Three"));
        System.out.println("hb.put(e4, \"Four\")----"+hb.put(e4, "Four"));
        
        Set<Entry<EmpPojo,String>> entrySet=hb.entrySet();
        for(Entry each:entrySet)
        {
            System.out.println(each.getKey()+"----"+each.getValue());
        }
        
        System.out.println(hb);
    }

    public static void populateStringHashtable()
    {
        System.out.println("==========no null key & no null value in Hashtable==========");
        Hashtable hb=new Hashtable<>();
        //hb.put(null, "Ravi"); //Runtime Error : it calls key.hashCode():NullPointerException
        //hb.put("ravi", null);
        hb.put("one", "ravi");
        hb.put("one", "ravi");
        System.out.println("hashtable :"+hb);
    }

}
