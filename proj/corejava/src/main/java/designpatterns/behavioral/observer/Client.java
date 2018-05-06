package designpatterns.behavioral.observer;

public class Client
{

    public static void main(String[] args) throws InterruptedException
    {
        WetherStation station=new WetherStation();
        PhoneDisplay phone= new PhoneDisplay(station);
        TabDisplay tab= new TabDisplay(station);
        
        Thread.sleep(2000);
        station.add(phone);
        station.add(tab);
        station.updatTemp("30\" cs");
        System.out.println("-------------");
        
        Thread.sleep(2000);        
        station.remove(phone);
        station.updatTemp("35\" cs");
        System.out.println("-------------");
        
        
        Thread.sleep(2000);        
        station.add(phone);
        station.updatTemp("42\" cs");
        
        
        
        
    }

}
