package designpatterns.behavioral.observer;

public class PhoneDisplay implements IObserver
{
    WetherStation station;
    
    public PhoneDisplay(WetherStation obj)
    {
        station=obj;
    }

    @Override
    public void update()
    {
        System.out.println("PhoneDisplay: temperature is "+station.getTemperature());
    }

}
