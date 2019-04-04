package com.rk.java.cache.one;

public interface Cacheable
{
    public boolean isExpired();
    public Object getIdentifier();
}
