package designpatterns.behavioral.command;

public class Client
{

    public static void main(String[] args)
    {
        Fan fan=new Fan();
        FanInvokerRemote fanRemote=new FanInvokerRemote(new FanOnCommand(fan), new FanOffCommand(fan), new FanSpeedUpCommand(fan), new FanSpeedDownCommand(fan));
        fanRemote.clickOn();
        fanRemote.speedUp();
        fanRemote.speedUp();
        fanRemote.clickOff();
        fanRemote.clickOn();
        fanRemote.speedDown();
    }

}
