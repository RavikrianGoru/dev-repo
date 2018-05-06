package designpatterns.strucural.facade;

public class XyzBankFacade
{
    private int accountNo;
    private int securityCode;

    AccounNoCheck accountNoCheck;
    SecurityCodeCheck securityCheck;
    FundsCheck fundsCheck;
    XyzBank bank;

    public XyzBankFacade(int accountNo, int securityCode)
    {
        this.accountNo = accountNo;
        this.securityCode = securityCode;

        bank = new XyzBank();
        accountNoCheck = new AccounNoCheck();
        securityCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNo()
    {
        return accountNo;
    }

    public int getSecurityCode()
    {
        return securityCode;
    }

 public void withdraw(double amt)
 {
     if(accountNoCheck.isActiveAccount(getAccountNo())&&
        securityCheck.isCodeCorrect(getSecurityCode())&& 
        fundsCheck.isEnoughFunds(amt))
     {
         System.out.println("Transaction is completed");
     }else
     {
         System.out.println("Transaction is failed");
     }
 }
 
 public void deposit(double amt)
 {
     if(accountNoCheck.isActiveAccount(getAccountNo())&&
        securityCheck.isCodeCorrect(getSecurityCode()))
     {
         fundsCheck.makeDeposit(amt);
         System.out.println("Transaction is completed");
     }else
     {
         System.out.println("Transaction is failed");
     }
 } 
}
