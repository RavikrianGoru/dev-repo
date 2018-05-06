package learn.java.internal.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import learn.java.internal.EmpAsKeyComparable;
import learn.java.internal.EmpPojo;
import learn.java.internal.EmpPojoAsKey;

public class HashSetInternals
{

    public static void main(String[] args)
    {
        /*
         HashSet---> Set implementation , Hashing technique.
         HashSet contains HashMap internally.
         Default capacity=16
         resized when load reaches to 0.75(load factor)
         
         
         It takes constant O(1) time on add(-), remove(-), containes(-) and size()
         
         Not synchronized.
         
         Iterator returned by iterator() : fail-fast behavior
         Fail-fast iterators throws ConcurrentModificationException.
         
         * For synchronized HashSet
           Collections.synchronizedSet(new HashSet());
         
         public boolean add(E e) 
         {
            return map.put(e, PRESENT)==null;
         }

         public boolean remove(Object o) 
         {
            return map.remove(o)==PRESENT;
         }
         
         */
        
        populateStringTypeHashSet();
        populateEmpPojoHashSet();
        populateEmpPojoAsKeyHashSet();
        populateEmpAsKeyComparableHashSet();
        
    }

    public static void populateStringTypeHashSet()
    {
        String s=new String();
        System.out.println("===========allowed null========");
        HashSet<String> hs =new HashSet<>();
        System.out.println("hs.add(\"null\")----->"+hs.add(null));
        System.out.println("hs.add(\"null\")----->"+hs.add(null));
        System.out.println("hs.add(\"ravi\")----->"+hs.add("ravi"));// return map.("ravi" PRESENT)==null
        System.out.println("hs.add(\"kiran\")----->"+hs.add("kiran"));//return map.("kiran" PRESENT)==null
        System.out.println("hs.add(\"ravi\")----->"+hs.add("ravi"));//return map.("ravi" PRESENT)==null

        Iterator<String> itr=hs.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+hs);
    }
    public static void populateEmpPojoHashSet()
    {
        System.out.println("===================EmpPojo not implements equals(-) and hashCode() methods");
        HashSet<EmpPojo> hs =new HashSet<>();
        System.out.println("hs.add(new EmpPojo(20,\"ravi\",20000)):----->"+hs.add(new EmpPojo(20,"ravi",20000)));
        System.out.println("hs.add(new EmpPojo(2,\"kiran\",40000)):----->"+hs.add(new EmpPojo(2,"kiran",40000)));
        System.out.println("hs.add(new EmpPojo(20,\\\"ravi\\\",20000))----->"+hs.add(new EmpPojo(20,"ravi",20000)));
        System.out.println("hs.add(new EmpPojo(1,\\\"chinnu\\\",20000))----->"+hs.add(new EmpPojo(1,"chinnu",20000)));

        Iterator<EmpPojo> itr=hs.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+hs);
    }
    
    public static void populateEmpPojoAsKeyHashSet()
    {
        System.out.println("===================EmpPojoAsKey implements equals(-) and hashCode() methods");
        HashSet<EmpPojoAsKey> hs =new HashSet<>();
        System.out.println("hs.add(new EmpPojoAsKey(20,\"ravi\",20000)):----->"+hs.add(new EmpPojoAsKey(20,"ravi",20000)));
        System.out.println("hs.add(new EmpPojoAsKey(2,\"kiran\",40000)):----->"+hs.add(new EmpPojoAsKey(2,"kiran",40000)));
        System.out.println("hs.add(new EmpPojoAsKey(20,\\\"ravi\\\",20000))----->"+hs.add(new EmpPojoAsKey(20,"ravi",20000)));
        System.out.println("hs.add(new EmpPojoAsKey(1,\\\"chinnu\\\",20000))----->"+hs.add(new EmpPojoAsKey(1,"chinnu",20000)));
        
        Iterator<EmpPojoAsKey> itr=hs.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+hs);
    }
    
    public static void populateEmpAsKeyComparableHashSet()
    {
        System.out.println("===================EmpAsKeyComparable implements equals(-) and hashCode() methods");
        HashSet<EmpAsKeyComparable> hs =new HashSet<>();
        System.out.println("hs.add(new EmpAsKeyComparable(20,\"ravi\",20000)):----->"+hs.add(new EmpAsKeyComparable(20,"ravi",20000)));
        System.out.println("hs.add(new EmpAsKeyComparable(2,\"kiran\",40000)):----->"+hs.add(new EmpAsKeyComparable(2,"kiran",40000)));
        System.out.println("hs.add(new EmpAsKeyComparable(20,\\\"ravi\\\",20000))----->"+hs.add(new EmpAsKeyComparable(20,"ravi",20000)));
        System.out.println("hs.add(new EmpAsKeyComparable(1,\\\"chinnu\\\",20000))----->"+hs.add(new EmpAsKeyComparable(1,"chinnu",20000)));

        Iterator<EmpAsKeyComparable> itr=hs.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+hs);
    }

}
