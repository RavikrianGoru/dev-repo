package designpatterns.strucural.facade;

public class FundsCheck
{
    private double cashInAccount=1000;
    public double getCashInAccount()
    {
        return cashInAccount;
    }
    public void decreaseCashInAccount(double amt)
    {
        cashInAccount-=amt;
    }
    public void increaseCashInAccount(double amt)
    {
        cashInAccount+=amt;
    }
    public boolean isEnoughFunds(double amt)
    {
        if(amt> getCashInAccount())
        {
            System.out.println("You dont have enough money.");
            System.out.println("current balance:"+getCashInAccount());
            return false;
        }else
        {
            decreaseCashInAccount(amt);
            System.out.println("current balance:"+getCashInAccount());
            return true;
        }
    }
    public void makeDeposit(double amt)
    {
        increaseCashInAccount(amt);
        System.out.println("Current balance:"+getCashInAccount());
    }
}
