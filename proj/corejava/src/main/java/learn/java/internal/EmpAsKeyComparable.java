package learn.java.internal;

public class EmpAsKeyComparable implements Comparable<EmpAsKeyComparable>
{
    private int id;
    private String name;
    private int sal;

    public EmpAsKeyComparable()
    {

    }

    public EmpAsKeyComparable(int id, String name, int sal)
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

    public double getSal()
    {
        return sal;
    }

    public void setSal(int sal)
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
        result = prime * result + sal;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        EmpAsKeyComparable other = (EmpAsKeyComparable) obj;
        if (id != other.id) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (sal != other.sal) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "EmpAsKeyComparable [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    @Override
    public int compareTo(EmpAsKeyComparable o)
    {
        return this.getId()>o.getId()?1:-1;
    }
}
