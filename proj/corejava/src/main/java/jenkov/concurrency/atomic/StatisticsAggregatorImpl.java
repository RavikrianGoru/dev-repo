package jenkov.concurrency.atomic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

public class StatisticsAggregatorImpl implements StatisticsAggregator
{
    ConcurrentHashMap<String, DoubleAdder> map1 = new ConcurrentHashMap<>();
    ConcurrentHashMap<String, LongAdder> map2 = new ConcurrentHashMap<>();

    public static void main(String[] args)
    {
        StatisticsAggregatorImpl obj = new StatisticsAggregatorImpl();
        obj.putNewPrice("IBM", 189.5);
        System.out.println(obj.getTickCount("IBM"));
        obj.putNewPrice("IBM", 189.5);
        System.out.println(obj.getTickCount("IBM"));
        System.out.println(obj.getTickCount("ERIC"));
        System.out.println(obj.getAveragePrice("IBM"));
    }

    @Override
    public void putNewPrice(String symbol, double price)
    {
        DoubleAdder da = null;
        LongAdder la = null;
        if (map1.get(symbol) == null || map2.get(symbol) == null)
        {
            da = new DoubleAdder();
            da.add(price);

            la = new LongAdder();
            la.increment();

            map1.put(symbol, da);
            map2.put(symbol, la);
        }
        else
        {
            map1.get(symbol).add(price);
            map2.get(symbol).increment();
        }
    }

    @Override
    public double getAveragePrice(String symbol)
    {
        if (map1.get(symbol) == null || map2.get(symbol) == null)
        {
            return 0;
        }
        else
        {
            return map1.get(symbol).doubleValue() / map2.get(symbol).intValue();
        }
    }

    @Override
    public int getTickCount(String symbol)
    {
        if (map2.get(symbol) == null)
        {
            return 0;
        }
        else
        {
            return map2.get(symbol).intValue();
        }
    }

}
