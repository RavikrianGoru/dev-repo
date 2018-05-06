package learn.java.internal.sets;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import learn.java.internal.EmpAsKeyComparable;
import learn.java.internal.EmpPojo;
import learn.java.internal.EmpPojoAsKey;

public class TreeSetInternals
{

    public static void main(String[] args)
    {
        /*
         TreeSet-  extends  AbstractSet and implements NavigableSet, Cloneable 
         
         private transient NavigableMap<E,Object> m;
         
         TreeSet contains NavigableMap(TreeMap) internally.
         
         It takes O(n) time cost on add(-), remove(-) & contains().
         
         Not synchronized.
         
         Iterator returned by iterator() : fail-fast behavior
         Fail-fast iterators throws ConcurrentModificationException.
         
         * For synchronized HashSet
           Collections.synchronizedSortedSet(new TreeSet());
         
         public boolean add(E e) 
         {
            return m.put(e, PRESENT)==null;
         }
         
         public boolean remove(Object o) 
         {
            return m.remove(o)==PRESENT;
         }


         */
        
        populateStringTypeTreeSet();
       // populateEmpPojoTreeSet();//Exception in thread "main" java.lang.ClassCastException: learn.java.internal.EmpPojo cannot be cast to java.lang.Comparable
       // populateEmpPojoAsKeyTreeSet();//Exception in thread "main" java.lang.ClassCastException:learn.java.internal.EmpPojoAsKey cannot be cast to java.lang.Comparable
        populateEmpAsKeyComparableTreeSet();
    }
    public static void populateStringTypeTreeSet()
    {
        String s=new String();
        System.out.println("============No null entries=======");
        TreeSet<String> ts =new TreeSet<>();
        System.out.println("ts.add(\"ravi\")----->"+ts.add("ravi"));// return map.("ravi" PRESENT)==null
        System.out.println("ts.add(\"kiran\")----->"+ts.add("kiran"));//return map.("kiran" PRESENT)==null
        System.out.println("ts.add(\"ravi\")----->"+ts.add("ravi"));//return map.("ravi" PRESENT)==null
        System.out.println("ts.add(\"chinna\")----->"+ts.add("chinna"));//return map.("chinna" PRESENT)==null
        System.out.println("ts.add(\"devi\")----->"+ts.add("devi"));//return map.("devi" PRESENT)==null

        
        Iterator<String> itr=ts.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire set:"+ts);
        System.out.println("Head set kiran :"+ts.headSet("kiran"));
        System.out.println("Tail set kiran :"+ts.tailSet("kiran"));
    }
    public static void populateEmpPojoTreeSet()
    {
        System.out.println("===================EmpPojo not implements equals(-) and hashCode() methods");
        TreeSet<EmpPojo> ts =new TreeSet<>();
        System.out.println("ts.add(new EmpPojo(20,\"ravi\",20000)):----->"+ts.add(new EmpPojo(20,"ravi",20000)));
        System.out.println("ts.add(new EmpPojo(2,\"kiran\",40000)):----->"+ts.add(new EmpPojo(2,"kiran",40000)));
        System.out.println("ts.add(new EmpPojo(20,\\\"ravi\\\",20000))----->"+ts.add(new EmpPojo(20,"ravi",20000)));
        System.out.println("ts.add(new EmpPojo(1,\\\"chinnu\\\",20000))----->"+ts.add(new EmpPojo(1,"chinnu",20000)));

        Iterator<EmpPojo> itr=ts.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+ts);
    }
    
    public static void populateEmpPojoAsKeyTreeSet()
    {
        System.out.println("===================EmpPojoAsKey implements equals(-) and hashCode() methods");
        TreeSet<EmpPojoAsKey> ts =new TreeSet<>();
        System.out.println("ts.add(new EmpPojoAsKey(20,\"ravi\",20000)):----->"+ts.add(new EmpPojoAsKey(20,"ravi",20000)));
        System.out.println("ts.add(new EmpPojoAsKey(2,\"kiran\",40000)):----->"+ts.add(new EmpPojoAsKey(2,"kiran",40000)));
        System.out.println("ts.add(new EmpPojoAsKey(20,\\\"ravi\\\",20000))----->"+ts.add(new EmpPojoAsKey(20,"ravi",20000)));
        System.out.println("ts.add(new EmpPojoAsKey(1,\\\"chinnu\\\",20000))----->"+ts.add(new EmpPojoAsKey(1,"chinnu",20000)));
        
        Iterator<EmpPojoAsKey> itr=ts.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+ts);
    }
    
    public static void populateEmpAsKeyComparableTreeSet()
    {
        System.out.println("===================EmpAsKeyComparable overrides equals(-) and hashCode() methods");
        TreeSet<EmpAsKeyComparable> ts =new TreeSet<>();

        System.out.println("ts.add(new EmpAsKeyComparable(20,\"ravi\",20000)):----->"+ts.add(new EmpAsKeyComparable(20,"ravi",20000)));
        System.out.println("ts.add(new EmpAsKeyComparable(2,\"kiran\",40000)):----->"+ts.add(new EmpAsKeyComparable(2,"kiran",40000)));
        System.out.println("ts.add(new EmpAsKeyComparable(20,\\\"ravi\\\",20000))----->"+ts.add(new EmpAsKeyComparable(20,"ravi",20000)));
        System.out.println("ts.add(new EmpAsKeyComparable(1,\\\"chinnu\\\",20000))----->"+ts.add(new EmpAsKeyComparable(1,"chinnu",20000)));

        Iterator<EmpAsKeyComparable> itr=ts.iterator();
        System.out.println("Print each element:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Entire map:"+ts);
    }

}
