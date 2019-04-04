package com.rk.java.guava;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class SimpleCache
{

    public static void main(String[] args)
    {
        testSimpleCache();
        testCacheWithWeakKeys();

    }

    public static void testCacheWithWeakKeys()
    {
        String s1 = "ravi";
        String s2 = "kiran";
        String s3 = "ravi1";
        String s4 = s1;

        LoadingCache<String, String> cache2 = getCacheWithWeakKeys();
        System.out.println(cache2.asMap());
        System.out.println(cache2.size());
        System.out.println(cache2.stats());
        try
        {
            cache2.get(s1);
            cache2.get(s2);
            cache2.get(s3);
            cache2.get(s4);
            System.out.println(cache2.asMap());
            System.out.println(cache2.size());
            s1 = null;
            s3 = null;
            Thread.sleep(60000);
            System.gc();
            System.out.println(cache2.asMap());
            System.out.println(cache2.size());
        }
        catch (ExecutionException | InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void testSimpleCache()
    {
        LoadingCache<String, String> cache1 = getSimpleCache();
        System.out.println(cache1.asMap());
        System.out.println(cache1.size());
        System.out.println(cache1.stats());

        System.out.println(cache1.getUnchecked("Hi, Dear"));
        System.out.println(cache1.getUnchecked("Bye, Dear"));
        System.out.println(cache1.asMap());
        System.out.println(cache1.size());

        System.out.println(cache1.getUnchecked("Hi, Dear"));
        try
        {
            System.out.println(cache1.get("Hi, Dear"));
        }
        catch (ExecutionException e1)
        {
            e1.printStackTrace();
        }
        System.out.println(cache1.stats());
    }

    public static LoadingCache<String, String> getSimpleCache()
    {
        CacheLoader<String, String> loader = new CacheLoader<String, String>()
        {

            @Override
            public String load(String key) throws IOException, Exception
            {
                return doSomeProcess(key);
            }

            private String doSomeProcess(String key)
            {
                return key.toUpperCase();
            }
        };

        // No eviction conditions.
        LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(loader);
        return cache;
    }

    public static LoadingCache<String, String> getCacheWithWeakKeys()
    {
        CacheLoader<String, String> loader = new CacheLoader<String, String>()
        {

            @Override
            public String load(String key) throws IOException, Exception
            {
                return doSomeProcess(key);
            }

            private String doSomeProcess(String key)
            {
                return key.toUpperCase();
            }
        };

        LoadingCache<String, String> cache = CacheBuilder.newBuilder().weakKeys().build(loader);
        return cache;
    }

}
