package learn.java.internal.maps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapInternals
{
/*
 
 ConcurrentHashMap utilizes the same principles of HashMap, but is designed primarily for a multi-threaded application and hence it does not require explicit synchronization.
 
 Hashtable vs ConcurrentHashMap
 -----------------------------
 Hashtable locaks entire map to perform any sort of operation (update,delete,read,create).
 ConcurrentHashMap provide the same functionality as of Hashtable but with a performance comparable to HashMap.

 initial capacity=16
 
 default level =16(at a time 16 threads can access concurrent map without any issues.
 i.e ConcurrentHashMap mintains 16 locks by default.
 Using a significantly higher value than you need can waste space and time, and a significantly lower value can lead to thread contention
 
 Retrieval operations (including get) generally do not block.
 
 It is possible to achieve full  concurrency for reads (all the threads read at the same time) in  ConcurrentHashMap by using volatile keyword.
 
 ConcurrentHashMap iterator behaves like fail safe iterator. It will not throw ConcurrentModificationException 
 
 
 */
    public static void main(String[] args)
    {
        ConcurrentHashMap chm=new ConcurrentHashMap();
    }

}
