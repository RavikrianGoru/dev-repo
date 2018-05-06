package designpatterns.behavioral.observer;

public interface IObservervable
{
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObserver();
    
}
