package designpatterns.behavioral.observer;

public class TabDisplay implements IObserver
{
    WetherStation station;
    
    public TabDisplay(WetherStation obj)
    {
        station=obj;
    }

    @Override
    public void update()
    {
        System.out.println("TabDisplay: temperature is "+station.getTemperature());
    }

}
