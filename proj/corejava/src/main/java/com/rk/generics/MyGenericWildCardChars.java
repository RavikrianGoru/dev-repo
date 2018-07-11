package com.rk.generics;

class Emp
{
    String name;
    int sal;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSal()
    {
        return sal;
    }

    public void setSal(int sal)
    {
        this.sal = sal;
    }

    public Emp(String name, int sal)
    {
        super();
        this.name = name;
        this.sal = sal;
    }
}

class CompanyA extends Emp
{
    public CompanyA(String name, int sal)
    {
        super(name, sal);
    }
}

class CompanyB extends Emp
{
    public CompanyB(String name, int sal)
    {
        super(name, sal);
    }
}

class EmpUtil<T extends Emp>
{
    T empObj;

    public EmpUtil(T empObj)
    {
        this.empObj = empObj;
    }

    public boolean isSalEqual(EmpUtil<?> obj)
    {
        if (this.empObj.getSal() == obj.empObj.getSal())
            return true;
        else
            return false;
    }
}

public class MyGenericWildCardChars
{

    public static void main(String[] args)
    {
        EmpUtil<CompanyA> e1=new EmpUtil(new CompanyA("A_ravi",2000));
        EmpUtil<CompanyA> e2=new EmpUtil(new CompanyA("A_Goru",2060));
        EmpUtil<CompanyA> e3=new EmpUtil(new CompanyA("A_kiran",2000));
        
        EmpUtil<CompanyB> e4=new EmpUtil(new CompanyB("B_ravi",2050));
        EmpUtil<CompanyB> e5=new EmpUtil(new CompanyB("B_Goru",2060));
        EmpUtil<CompanyB> e6=new EmpUtil(new CompanyB("B_kiran",2000));
        
        System.out.println("if Both objs are same type: isSalEqual(EmpUtil<T> obj)");
        System.out.println("is e1 and e2 has same salary:"+e1.isSalEqual(e2));
        System.out.println("is e1 and e3 has same salary:"+e1.isSalEqual(e3));
        System.out.println("is e4 and e5 has same salary:"+e4.isSalEqual(e5));
        System.out.println("is e4 and e6 has same salary:"+e4.isSalEqual(e6));

        System.out.println("if Both objs are different type: isSalEqual(EmpUtil<?> obj)");
        System.out.println("is e1 and e5 has same salary:"+e1.isSalEqual(e5));
        System.out.println("is e1 and e6 has same salary:"+e1.isSalEqual(e6));

        System.out.println("is e4 and e2 has same salary:"+e4.isSalEqual(e2));
        System.out.println("is e4 and e3 has same salary:"+e4.isSalEqual(e3));
        
        
        
    }

}
