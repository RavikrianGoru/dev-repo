package learn.java.internal;

public class EmpPojo
{
    private int id;
    private String name;
    private int sal;
    
    public EmpPojo()
    {

    }

    public EmpPojo(int id, String name, int sal)
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
    public String toString()
    {
        return "EmpPojo [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
    
}
