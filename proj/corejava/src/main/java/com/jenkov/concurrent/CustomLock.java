package com.jenkov.concurrent;

class CustomLock
{
    private volatile boolean isLocked = false;
    private Thread lockedThread=null;
    
    CustomLock()
    {
        System.out.println("This lock implementation is not reentrant. check lock method carefully");
    }
    public synchronized void lock() throws InterruptedException
    {
        while (isLocked)// locked in loop: is called "spin lock".
        {
            wait();
        }
        isLocked = true;
        lockedThread=Thread.currentThread();
    }

    public synchronized void unlock()
    {
        if(this.lockedThread!=Thread.currentThread())
        {
            throw new IllegalMonitorStateException("Calling thread has not locked this lock");
        }
        isLocked = false;
        lockedThread=null;
        notify();
    }
}