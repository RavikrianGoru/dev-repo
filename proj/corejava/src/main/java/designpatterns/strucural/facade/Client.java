package designpatterns.strucural.facade;

public class Client
{

    public static void main(String[] args)
    {
        XyzBankFacade accountfacade=new XyzBankFacade(100001,9876);
        accountfacade.withdraw(150);
        accountfacade.withdraw(250);
        accountfacade.deposit(150);
    }
}
