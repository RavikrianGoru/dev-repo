package com.jenkov.concurrent;

/**
Read / Write Lock Reentrance:
----------------------------
Reentrance for readers and writers will be dealt with separately.
1) Read Reentrance
   A thread is granted read reentrance if it can get read access (no writers or write requests), or if it already has read access (regardless of write requests).




 */
public class CustomReentrantRWLock
{
    private int readers = 0;
    private int writers = 0;
    private int writersRequets = 0;

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
