package designpatterns.behavioral.command;

public class FanSpeedDownCommand implements ICommand
{
    Fan fan;

    public FanSpeedDownCommand(Fan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
        fan.speedDown();
    }

    @Override
    public void unexecute()
    {
        fan.speedUp();
    }

}
