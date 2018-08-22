package org.corejava.interview.sapient;
import java.util.HashSet;
import java.util.TreeSet;

class Emp implements Comparable
{
    int id;
    String name;
    String sal;

    public Emp(int id, String name, String sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSal()
    {
        return sal;
    }

    public void setSal(String sal)
    {
        this.sal = sal;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sal == null) ? 0 : sal.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Emp other = (Emp) obj;
        if (id != other.id) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (sal == null)
        {
            if (other.sal != null) return false;
        }
        else if (!sal.equals(other.sal)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    @Override
    public int compareTo(Object o)
    {
        Emp eObj = (Emp) o;
        if (this.equals(eObj))
        {
            return 0;
        }
        else if (this.id > eObj.getId())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}

public class HashCode_Equals_Methods
{

    public static void main(String[] args)
    {
        Emp e1 = new Emp(1, "ravi", "20K");
        Emp e2 = new Emp(2, "ram", "30K");
        Emp e3 = new Emp(1, "ravi", "20K");

        System.out.println("e1.hasCode():" + e1.hashCode());
        System.out.println("e2.hasCode():" + e2.hashCode());
        System.out.println("e3.hasCode():" + e3.hashCode());

        System.out.println("e1.equals(e3):" + e1.equals(e3));

         HashSet<Emp> hs = new HashSet();
         hs.add(e1);
         hs.add(e2);
         hs.add(e3);
         System.out.println("HashSet:"+hs);

        TreeSet<Emp> ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        System.out.println("TreeSet:" + ts);

    }

}
