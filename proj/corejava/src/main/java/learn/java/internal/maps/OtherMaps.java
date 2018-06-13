package learn.java.internal.maps;

import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class OtherMaps
{

    public static void main(String[] args) throws InterruptedException
    {
        populateIdentityHashMap();
        populateLinkedHashMap();
        populateWeakHashMap();
        
    }

    public static void populateWeakHashMap() throws InterruptedException
    {
        /* 
         1) WeakHashMap: Map implementation with weak keys.
         2) An entry in a WeakHashMap will automatically be removed when its key is no longer in ordinary use
         3) Allows null keys and values
         4) Default capacity 16
            Load factor: 0.75
         */
        
        System.out.println("=======WeakHashMap====== allows null key, null value, if the key has no reference then this map removes that entity automatically.");
        WeakHashMap<String, String> whm=new WeakHashMap<>();
        String s1=new String("key");
        String s2=new String("value");
        String d1=new String("Hi");
        String d2=new String("Bye");
        
        System.out.println("whm.put(\"key\",\"value\")-----"+whm.put("key","value"));
        System.out.println("whm.put(s1,s2)-----"+whm.put(s1,s2));
        System.out.println("whm.put(d1,d2)-----"+whm.put(d1,d2));
        System.out.println("whm.put(null,null)-----"+whm.put(null,null));
        System.out.println("Entire Map:"+whm);
        
        s1=null;
        d1=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("Entire Map:"+whm);
    }

    public static void populateLinkedHashMap()
    {
        /* 
         * LinkedHashMap is the Hashtable (synchronized HashMap) and linkedlist implementation of the Map interface , with predictable iteration order.
         LinkedHashMap: implementation Map and double linked list.
         : Insertion order
         Note that this implementation is not synchronized.
         
         Collections.synchronizedMap()
         
         Insertion order of the LinkedHashMap does not get affected if a key is re-inserted into the LinkedHashMap object.
         It first checks containsKey() method  before invoking put() method . If containsKey(K) returns true then the key is not added to the LinkedHashMap.

         O(1) add,remove & contains operations.
         */
        
        System.out.println("=======LinkedHashMap====== allows null key, null value");
        LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
        String s1=new String("key");
        String s2=new String("value");
        String d1=s1;
        String d2=s2;
        
        System.out.println("lhm.put(\"key\",\"value\")-----"+lhm.put("key","value"));
        System.out.println("lhm.put(s1,s2)-----"+lhm.put(s1,s2));
        System.out.println("lhm.put(d1,d2)-----"+lhm.put(d1,d2));
        System.out.println("lhm.put(null,null)-----"+lhm.put(null,null));
        System.out.println(lhm);
    }

    public static void populateIdentityHashMap()
    {
        /*
        0) IdentityHashMap: it is Map implementation with a hash table. 
        1) It uses reference equality in place of object-equality when comparing keys (and values).
            An IdentityHashMap, two keys k1 and k2 are considered equal if and only if (k1==k2). 
        2) Default capacity: 32
           Load factor:2/3
        */
        
        System.out.println("=======IdentityHashMap====== allows null key, null value");
        IdentityHashMap ihm= new IdentityHashMap();
        String s1=new String("key");
        String s2=new String("value");
        String d1=s1;
        String d2=s2;
        
        System.out.println("ihm.put(\"key\",\"value\")-----"+ihm.put("key","value"));
        System.out.println("ihm.put(s1,s2)-----"+ihm.put(s1,s2));
        System.out.println("ihm.put(d1,d2)-----"+ihm.put(d1,d2));
        System.out.println("ihm.put(null,null)-----"+ihm.put(null,null));
        
        System.out.println(ihm);
    }

}
