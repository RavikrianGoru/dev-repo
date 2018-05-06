package designpatterns.behavioral.command;

public class FanOnCommand implements ICommand
{
    Fan fan;
    public FanOnCommand(Fan fan)
    {
        this.fan=fan;
    }
    @Override
    public void execute()
    {
        fan.clickOn();
    }

    @Override
    public void unexecute()
    {
        fan.clickOff();
    }

}
