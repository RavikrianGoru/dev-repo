package com.rk.java.cache.one;

public class CachedManagerTestProgram
{
    public CachedManagerTestProgram()
    {
    }

    public static void main(String[] args)
    {
        CachedManagerTestProgram cacheManagerTestProgram1 = new CachedManagerTestProgram();
        String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        CachedObject co = new CachedObject(s, new Long(1234), 1);
        CacheManager.putCache(co);
        CachedObject o = (CachedObject) CacheManager.getCache(new Long(1234));
        if (o == null)
            System.out.println("CacheManagerTestProgram.Main:  FAILURE!  Object not Found.");
        else
            System.out.println("CacheManagerTestProgram.Main:  SUCCESS! " + ((String) o.object).toString());
    }
}
