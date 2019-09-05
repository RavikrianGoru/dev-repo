package bnp;

import java.util.ArrayList;
import java.util.List;

class Emp
{
    private int id;
    private String name;

    public Emp(int id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Emp [id=" + id + ", name=" + name + "]";
    }
}

public class ListOfList
{
    private static ArrayList<ArrayList<Emp>> getListOfList(List<Emp> l, int m)
    {
        ArrayList<ArrayList<Emp>> al = new ArrayList<>();
        int count = 0;
        ArrayList<Emp> internalList = new ArrayList<>();
        for (int i = 0; i < l.size(); i++)
        {
            count++;
            if (count == m || i == l.size() - 1)
            {
                al.add(internalList);
                internalList = new ArrayList<>();
                // Never user internalList.clear() wont work. it clear elements from al as reference is still in use.
                count = 0;
            }
            internalList.add(l.get(i));
        }
        return al;
    }

    public static void main(String[] args)
    {
        List<Emp> l = new ArrayList<>();
        l.add(new Emp(1, "ravi1"));
        l.add(new Emp(2, "ravi2"));
        l.add(new Emp(3, "ravi3"));
        l.add(new Emp(4, "ravi4"));
        l.add(new Emp(5, "ravi5"));
        l.add(new Emp(6, "ravi6"));
        l.add(new Emp(7, "ravi7"));
        l.add(new Emp(8, "ravi8"));
        l.add(new Emp(9, "ravi9"));
        l.add(new Emp(10, "ravi10"));
        System.out.println(getListOfList(l, 3));
    }
}
