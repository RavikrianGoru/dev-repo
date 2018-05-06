package designpatterns.behavioral.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WetherStation implements IObservervable
{

    List<IObserver> observersList=new CopyOnWriteArrayList<IObserver>();
    static String temp="25\" cs ";
    
    @Override
    public void add(IObserver obj)
    {
        observersList.add(obj);
    }

    @Override
    public void remove(IObserver obj)
    {
        observersList.remove(obj);
    }

    @Override
    public void notifyObserver()
    {
        for(IObserver each:observersList)
        {
            each.update();
        }
    }

    public String getTemperature()
    {
        return temp;
    }
    public void updatTemp(String temp)
    {
        this.temp=temp;
        notifyObserver();
    }
}
