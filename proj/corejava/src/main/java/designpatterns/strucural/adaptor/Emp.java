package designpatterns.strucural.adaptor;

public class Emp
{
    private int id;
    private String name;
    private String designamtion;
    private double sal;
    public Emp(int id, String name, String designamtion, double sal)
    {
        super();
        this.id = id;
        this.name = name;
        this.designamtion = designamtion;
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
    public String getDesignamtion()
    {
        return designamtion;
    }
    public void setDesignamtion(String designamtion)
    {
        this.designamtion = designamtion;
    }
    public double getSal()
    {
        return sal;
    }
    public void setSal(double sal)
    {
        this.sal = sal;
    }
}
