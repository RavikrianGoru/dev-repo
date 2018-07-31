package array;

public class Emp
{
    int no;
    String name;

    public Emp(int no, String name)
    {
        this.no = no;
        this.name = name;
    }

    public int getNo()
    {
        return no;
    }

    public void setNo(int no)
    {
        this.no = no;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Emp [no=" + no + ", name=" + name + "]";
    }
}
