package com.rk.java.guava;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.Weigher;
import com.google.common.collect.ImmutableMap;

public class CacheWithEviction
{

    public static void main(String[] args)
    {
        // LoadingCache<String, String> cache = getMaxSizeBasedCache();
        // testMaxsizeBasedCache(cache);

        CacheLoader<String, String> loader = new CacheLoader<String, String>()
        {
            @Override
            public String load(String key) throws Exception
            {
                return key.toUpperCase();
            }
        };
        Weigher<String, String> weightByLength = new Weigher<String, String>()
        {
            @Override
            public int weigh(String key, String value)
            {
                return value.length();
            }
        };
        
        // Eviction based on max size and weigher
        LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumWeight(20).weigher(weightByLength).build(loader);
    }

    public static void testMaxsizeBasedCache(LoadingCache<String, String> cache)
    {
        try
        {
            System.out.println("Initial Cache:" + cache.asMap());
            System.out.println("Size:" + cache.size());
            cache.get("1Ravi");
            cache.get("2Kiran");
            cache.get("3Goru");
            cache.get("4Chinna");
            cache.get("5Devi");
            System.out.println("Cache with 5 entries:" + cache.asMap());
            System.out.println("Size:" + cache.size());
            cache.get("6Ramu");
            cache.get("7Sudha");
            cache.get("8Kumar");
            cache.get("9John");
            cache.get("10Raj");
            System.out.println("Cache with 10 entries but maxsize is 5:" + cache.asMap());
            System.out.println("Size:" + cache.size());
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
    }

    public static LoadingCache<String, String> getMaxSizeBasedCache()
    {
        CacheLoader<String, String> loader = new CacheLoader<String, String>()
        {
            @Override
            public String load(String key) throws Exception
            {
                return key.toLowerCase();
            }
        };

        // Eviction based on LRU, Max entries in cache is 5
        LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(5).build(loader);
        return cache;
    }

}
