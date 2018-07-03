package com.jenkov.concurrent;

public class CustomReentrantLock
{
    private boolean isLocked = false;
    private Thread lockedThread = null;
    private int lockCount = 0;

    public synchronized void lock() throws InterruptedException
    {
        Thread callingThread = Thread.currentThread();
        while (isLocked && lockedThread != callingThread)
        {
            wait();
        }
        isLocked = true;
        lockCount++;
        lockedThread = callingThread;
    }

    public synchronized void unlock()
    {
        if (Thread.currentThread() == lockedThread)
        {
            lockCount--;
            if (lockCount == 0)
            {
                isLocked = false;
                notify();
            }
        }
        else
        {
            throw new IllegalMonitorStateException("Calling thread is not accuaired lock.");
        }
    }
}
