package com.rk.java.cache.one;

public class CacheManager
{
    private static java.util.HashMap cacheHashMap = new java.util.HashMap();
    private static Object lock = new Object();
    static
    {
        try
        {
            Thread threadCleanerUpper = new Thread(new Runnable()
            {
                int milliSecondSleepTime = 5000;

                public void run()
                {
                    try
                    {
                        while (true)
                        {
                            System.out.println("ThreadCleanerUpper Scanning For Expired Objects...");
                            java.util.Set keySet = cacheHashMap.keySet();
                            java.util.Iterator keys = keySet.iterator();
                            while (keys.hasNext())
                            {
                                Object key = keys.next();
                                Cacheable value = (Cacheable) cacheHashMap.get(key);
                                if (value.isExpired())
                                {
                                    cacheHashMap.remove(key);
                                    System.out.println("ThreadCleanerUpper Running. Found an Expired Object in the Cache.");
                                }
                            }
                            Thread.sleep(this.milliSecondSleepTime);
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    return;
                }
            });
            threadCleanerUpper.setPriority(Thread.MIN_PRIORITY);
            threadCleanerUpper.start();
        }
        catch (Exception e)
        {
            System.out.println("CacheManager.Static Block: " + e);
        }
    }

    public CacheManager()
    {
    }

    public static void putCache(Cacheable object)
    {
        cacheHashMap.put(object.getIdentifier(), object);
    }

    public static Cacheable getCache(Object identifier)
    {
        Cacheable object;
        synchronized (lock) // UNCOMMENT LINE XXX
        {
            object = (Cacheable) cacheHashMap.get(identifier);
        }
        if (object == null)
            return null;
        if (object.isExpired())
        {
            cacheHashMap.remove(identifier);
            return null;
        }
        else
        {
            return object;
        }
    }
}
