package designpatterns.behavioral.command;

public class FanSpeedUpCommand implements ICommand
{
    Fan fan;

    public FanSpeedUpCommand(Fan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute()
    {
        fan.speedUp();
    }

    @Override
    public void unexecute()
    {
        fan.speedDown();
    }

}
