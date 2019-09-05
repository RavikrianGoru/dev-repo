package com.udemy.java.set;

import java.util.HashSet;
import java.util.TreeSet;

class Emp implements Comparable<Emp>
{
    private String name;
    private String id;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    @Override
    public String toString()
    {
        return "Emp [name=" + name + ", id=" + id + "]";
    }
    public Emp(String name, String id)
    {
        super();
        this.name = name;
        this.id = id;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Emp other = (Emp) obj;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        return true;
    }
    @Override
    public int compareTo(Emp o)
    {
        return o.getId().compareTo(this.getId());
    }
    
    
}
public class HashSet_TreeSet_Example
{
    public static void main(String[] args)
    {
        System.out.println("HashSet obs required hashCode() and equals() to be override:Recomendation to avoid duplicates");
        System.out.println("TreeSet obj must implement Comparable interface: ClassCastException");
        HashSet<Emp> set1 =new HashSet<>();
        TreeSet<Emp> set2 =new TreeSet<>();
        Emp e1 =new Emp("Ravi1", "ED_1");
        Emp e2 =new Emp("Ravi2", "ED_2");
        Emp e3 =new Emp("Ravi3", "ED_3");
        Emp e4 =new Emp("Ravi2", "ED_2");
        Emp e5 =new Emp("Ravi3", "ED_3");
        
        set1.add(e1);
        set1.add(e2);
        set1.add(e3);
        set1.add(e4);
        set1.add(e5);

        set2.add(e1);
        set2.add(e2);
        set2.add(e3);
        set2.add(e4);
        set2.add(e5);
        
        System.out.println("HashSet------>"+set1);
        System.out.println("TreeSet------>"+set2);
        
    }
}
