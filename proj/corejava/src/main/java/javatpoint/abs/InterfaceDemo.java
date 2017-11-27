package javatpoint.abs;

import java.io.Serializable;
import java.rmi.Remote;

interface Bank
{
    String name="Superior Bank";
    default void interestRate()
    {
        System.out.println(name+" Default interest rates for PL:"+12+"%");
    }
    static void reservAmt()
    {
        System.out.println(name+" Reserve amt :"+17894.74+"cr");
    }
}

interface RuralBank extends Bank
{
    String name="Superior RuralBank";
    default void interestRate()
    {
        System.out.println(name+" Default interest rates for PL:"+12+"%");
    }
    default void interestRateRural()
    {
        System.out.println(name+" Default interest rates for PL:"+13+"%");
    }
    abstract void interestRateCrop();
    static void reservAmt()
    {
        System.out.println(name+" Reserve amt :"+986.74+"cr");
    }
}

interface UrbanBank extends Bank
{
    String name="Superior UrbanBank";
    default void interestRateUrban()
    {
        System.out.println(name+" Default interest rates for PL:"+11+"%");
    }
    static void reservAmt()
    {
        System.out.println(name+" Reserve amt :"+8791.74+"cr");
    }
    abstract void interestRateInsudtry();
}

class CitiBank implements UrbanBank
{
    String name="CITI-Bank";
    String address="OMR CITI main branch";
    @Override
    public void interestRateInsudtry()
    {
        System.out.println(name +" interest rate:10%"); 
    }
}
class HdfcBank  implements UrbanBank
{
    String name="HDFC-Bank";
    String address="Tnagar HDFC main branch";
    @Override
    public void interestRateInsudtry()
    {
        System.out.println(name +" interest rate:10%"); 
    }
}

class GraminBank implements RuralBank
{
    @Override
    public void interestRateCrop()
    {
        System.out.println("GraminBank crop interest rate:10%");
    }
    
}

class RKBank implements RuralBank,UrbanBank
{

    @Override
    public void interestRateCrop()
    {
            System.out.println("RKBank crop interest rate:10%");
    }

    @Override
    public void interestRateInsudtry()
    {
        System.out.println("RKBank Industry interest rate:11.5%"); 
    }
    
}
public class InterfaceDemo
{

    public static void main(String[] args)
    {
        //the below interfaces are marker / tagged interfaces.
        Serializable s = null;
        Cloneable c = null;
        Remote r=null;
    }

}
