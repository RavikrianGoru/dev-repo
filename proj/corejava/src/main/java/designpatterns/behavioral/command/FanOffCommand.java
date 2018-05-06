package designpatterns.behavioral.command;

public class FanOffCommand implements ICommand
{
    Fan fan;
    public FanOffCommand(Fan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
        fan.clickOff();
    }

    @Override
    public void unexecute()
    {
        fan.clickOn();
    }

}
