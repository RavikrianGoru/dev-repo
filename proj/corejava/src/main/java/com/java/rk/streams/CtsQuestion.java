package com.java.rk.streams;

import java.util.ArrayList;
import java.util.List;

class Employee
{
    private String name;
    private int id;
    private float sal;
    private List<Company> workedIn;

    public Employee(String name, int id, float sal, List<Company> workedIn)
    {
        super();
        this.name = name;
        this.id = id;
        this.sal = sal;
        this.workedIn = workedIn;
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
        return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", workedIn=" + workedIn + "]";
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public float getSal()
    {
        return sal;
    }

    public void setSal(float sal)
    {
        this.sal = sal;
    }

    public List<Company> getWorkedIn()
    {
        return workedIn;
    }

    public void setWorkedIn(List<Company> workedIn)
    {
        this.workedIn = workedIn;
    }
}

class Company
{
    private String name;
    private int rating;

    public Company(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "Company [name=" + name + ", rating=" + rating + "]";
    }
}

public class CtsQuestion
{
    public static void main(String[] args)
    {
        List<Employee> el1 = new ArrayList<>();
        List<Company> cl1 = new ArrayList<>();
        List<Company> cl2 = new ArrayList<>();
        List<Company> cl3 = new ArrayList<>();
        List<Company> cl4 = new ArrayList<>();
        List<Company> cl5 = new ArrayList<>();
        Company c1 = new Company("HCL", 3);
        Company c2 = new Company("GL", 7);
        Company c3 = new Company("CTS", 4);
        Company c4 = new Company("Ericsson", 6);
        Company c5 = new Company("PayPal", 8);
        cl1.add(c1);
        cl1.add(c2);
        cl1.add(c3);
        cl1.add(c4);
        cl1.add(c5);

        cl2.add(c1);
        cl2.add(c3);

        cl3.add(c1);
        cl3.add(c2);
        cl3.add(c3);
        cl3.add(c4);
        cl3.add(c5);

        cl5.add(c1);

        Employee e1 = new Employee("Ravi", 100, 20000.00f, cl1);
        Employee e2 = new Employee("Kiran", 101, 25000.00f, cl2);
        Employee e3 = new Employee("Goru", 102, 30000.00f, cl3);
        Employee e4 = new Employee("Kumar", 103, 20500.00f, cl4);
        Employee e5 = new Employee("Babu", 105, 22500.00f, cl5);
        el1.add(e1);
        el1.add(e2);
        el1.add(e3);
        el1.add(e4);
        el1.add(e5);

        System.out.println("All employees:");
        System.out.println("----------------------------------");
        
        el1.stream().forEach(s -> {
            System.out.println(s.getName() + "----" + s.getWorkedIn());
        });
        
        System.out.println("\n\nEmployees who worked in atleast one 5 rating company");
        System.out.println("----------------------------------");
        el1.stream().filter((e)->{
            return e.getWorkedIn().stream().anyMatch((company)->{return company.getRating()>=5;});
        }).forEach((s)->{System.out.println(s.getName() + "----" + s.getWorkedIn());});

    }
}
