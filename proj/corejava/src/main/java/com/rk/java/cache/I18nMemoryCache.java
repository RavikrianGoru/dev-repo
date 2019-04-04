package com.rk.java.cache;

import java.util.ArrayList;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.map.LRUMap;

public class I18nMemoryCache<K, T>
{

    private long timeToLive;
    private LRUMap i18nCacheMap;

    protected class I18NCacheObject
    {
        public long lastAccessed = System.currentTimeMillis();
        public T value;

        protected I18NCacheObject(T value)
        {
            this.value = value;
        }

        @Override
        public String toString()
        {
            return "I18NCacheObject [lastAccessed=" + lastAccessed + ", value=" + value + "]";
        }
    }

    public I18nMemoryCache(long i18nTimeToLive, final long i18nTimerInterval, int maxItems)
    {
        this.timeToLive = i18nTimeToLive * 1000;

        i18nCacheMap = new LRUMap(maxItems);

        if (timeToLive > 0 && i18nTimerInterval > 0)
        {

            Thread t = new Thread(new Runnable()
            {
                public void run()
                {
                    while (true)
                    {
                        try
                        {
                            Thread.sleep(i18nTimerInterval * 1000);
                        }
                        catch (InterruptedException ex)
                        {
                        }
                        cleanup();
                    }
                }
            });

            t.setDaemon(true);
            t.start();
        }
    }

    public void put(K key, T value)
    {
        synchronized (i18nCacheMap)
        {
            i18nCacheMap.put(key, new I18NCacheObject(value));
        }
    }

    @SuppressWarnings ("unchecked")
    public T get(K key)
    {
        synchronized (i18nCacheMap)
        {
            I18NCacheObject c = (I18NCacheObject) i18nCacheMap.get(key);

            if (c == null)
                return null;
            else
            {
                c.lastAccessed = System.currentTimeMillis();
                return c.value;
            }
        }
    }

    public void remove(K key)
    {
        synchronized (i18nCacheMap)
        {
            i18nCacheMap.remove(key);
        }
    }

    public int size()
    {
        synchronized (i18nCacheMap)
        {
            return i18nCacheMap.size();
        }
    }

    @SuppressWarnings ("unchecked")
    public void cleanup()
    {

        long now = System.currentTimeMillis();
        ArrayList<K> deleteKey = null;

        synchronized (i18nCacheMap)
        {
            MapIterator itr = i18nCacheMap.mapIterator();

            deleteKey = new ArrayList<K>((i18nCacheMap.size() / 2) + 1);
            K key = null;
            I18NCacheObject c = null;

            while (itr.hasNext())
            {
                key = (K) itr.next();
                c = (I18NCacheObject) itr.getValue();

                if (c != null && (now > (timeToLive + c.lastAccessed)))
                {
                    deleteKey.add(key);
                }
            }
        }

        for (K key : deleteKey)
        {
            synchronized (i18nCacheMap)
            {
                i18nCacheMap.remove(key);
            }

            Thread.yield();
        }
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((i18nCacheMap == null) ? 0 : i18nCacheMap.hashCode());
        result = prime * result + (int) (timeToLive ^ (timeToLive >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        I18nMemoryCache other = (I18nMemoryCache) obj;
        if (i18nCacheMap == null)
        {
            if (other.i18nCacheMap != null) return false;
        }
        else if (!i18nCacheMap.equals(other.i18nCacheMap)) return false;
        if (timeToLive != other.timeToLive) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "I18nMemoryCache [timeToLive=" + timeToLive + ", i18nCacheMap=" + i18nCacheMap + "]";
    }
}
