package designpatterns.behavioral.command;

public class FanInvokerRemote
{
    FanOnCommand on;
    FanOffCommand off;
    FanSpeedUpCommand speedUp;
    FanSpeedDownCommand speedDown;
    public FanInvokerRemote(FanOnCommand on, FanOffCommand off, FanSpeedUpCommand speedUp, FanSpeedDownCommand speedDown)
    {
        super();
        this.on = on;
        this.off = off;
        this.speedUp = speedUp;
        this.speedDown = speedDown;
    }
    
    public void clickOn()
    {
        on.execute();
    }
    public void clickOff()
    {
        off.execute();
    }
    public void speedUp()
    {
        speedUp.execute();
    }
    public void speedDown()
    {
        speedDown.execute();
    }
}
