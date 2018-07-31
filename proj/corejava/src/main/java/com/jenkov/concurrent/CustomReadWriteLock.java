package com.jenkov.concurrent;

public class CustomReadWriteLock
{
    private int readers = 0;
    private int writers = 0;
    private int writersRequets = 0;

    public CustomReadWriteLock()
    {
        System.out.println("CustomReadWriteLock is not Reentrant.\n If a thread that has write access requests it again, it will block because there is already one writer - itself");
        System.out.println("Thre is a chance of dead lock:");
        System.out.println("(1) Thread 1 gets read access.\r\n" +
                "\r\n" +
                "(2) Thread 2 requests write access but is blocked because there is one reader.\r\n" +
                "\r\n" +
                "(3) Thread 1 re-requests read access (re-enters the lock), but is blocked because there is a write request\r\n" +
                "In this situation the previous ReadWriteLock would lock up - a situation similar to deadlock. No threads requesting neither read nor write access would be granted so");
    }

    public synchronized void lockRead() throws InterruptedException
    {
        while (writers > 0 || writersRequets > 0)
        {
            wait();
        }
        readers++;
    }

    public synchronized void unlockRead()
    {
        readers--;
        notifyAll();
    }

    public synchronized void lockWrite() throws InterruptedException
    {
        writersRequets++;
        if (writers > 0 || readers > 0)
        {
            wait();
        }
        writersRequets--;
        writers++;
    }

    public synchronized void unlockWrite()
    {
        writers--;
        notifyAll();
    }

}
