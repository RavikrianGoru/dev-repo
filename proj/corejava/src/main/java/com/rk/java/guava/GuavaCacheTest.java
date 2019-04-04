package com.rk.java.guava;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class GuavaCacheTest
{

    private static LoadingCache<String, String> cache;
    static GuavaCacheTest obj=new GuavaCacheTest();
    public static GuavaCacheTest getInstance()
    {
        return obj;
    }

    private GuavaCacheTest()
    {
        cache = CacheBuilder.newBuilder().refreshAfterWrite(2, TimeUnit.SECONDS).build(new CacheLoader<String, String>()
        {

            @Override
            public String load(String arg0) throws Exception
            {
                System.out.println("load is called");
                return addCache(arg0);
            }
        });
    }
    private String addCache(String arg0)
    {
        System.out.println("addCache is called");
        return arg0.toUpperCase();
    }
    public String getEntry(String arg0) throws ExecutionException
    {
        System.out.println("getEntry is called");
        return cache.get(arg0);
    }
    
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        GuavaCacheTest obj1=GuavaCacheTest.getInstance();
        System.out.println(cache.size());
        System.out.println(obj1.getEntry("ravi"));
        System.out.println(obj1.getEntry("ravi"));
        System.out.println(obj1.getEntry("RAVI"));
        Thread.sleep(5000);
        System.out.println(obj1.getEntry("ravi"));
    }

}
