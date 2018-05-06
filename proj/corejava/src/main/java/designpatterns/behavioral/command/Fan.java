package designpatterns.behavioral.command;

public class Fan
{
    private int speed=0;
    public Fan()
    {
        
    }
    
    public void clickOn()
    {
        System.out.println("Fan is (swiched On) speed:"+speed);
    }
    public void clickOff()
    {
        System.out.println("Fan is (swiched Off) speed:"+speed );
    }
    public void speedUp()
    {
        speed++;
        System.out.println("Fan speed is set to :"+speed);
    }
    public void speedDown()
    {
        speed--;
        System.out.println("Fan speed is set to :"+speed);
    }
}
