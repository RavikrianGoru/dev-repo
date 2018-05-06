package designpatterns.strucural.facade;

public class SecurityCodeCheck
{
    private int securityCode=9876;
    public int getSecurityCode()
    {
        return securityCode;
    }
    public boolean isCodeCorrect(int securityCode)
    {
        if(securityCode==getSecurityCode())
        {
            return true;
        }else
        {
            return false;
        }
    }
}
