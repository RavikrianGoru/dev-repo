package designpatterns.strucural.facade;

public class AccounNoCheck
{
    private int accountNo=100001;

    public int getAccountNo()
    {
        return accountNo;
    }

    public boolean isActiveAccount(int accountNo)
    {
        if(accountNo==getAccountNo())
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
}
