package designpatterns.strucural.adaptor;

public class ClientHRSystem
{

    public static Emp[] getEmployees()
    {
        Emp[] empArray=new Emp[5];
        empArray[0]=new Emp(1,"ravi","SE",20000);
        empArray[1]=new Emp(2,"kiran","SE",20000);
        empArray[2]=new Emp(3,"Siva","TL",40000);
        empArray[3]=new Emp(4,"Chinna","TL",40000);
        empArray[4]=new Emp(5,"Surya","Mgr",60000);
        return empArray;
    }
   
    public static void main(String[] args)
    {
        IEmpAdaptor adaptor= new EmpAdaptor();
        adaptor.processSal(getEmployees());
    }

}
