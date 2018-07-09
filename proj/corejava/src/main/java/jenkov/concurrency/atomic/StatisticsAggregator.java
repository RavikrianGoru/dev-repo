package jenkov.concurrency.atomic;

public interface StatisticsAggregator
{
    public void putNewPrice(String symbol, double price);// add new price for symbol

    public double getAveragePrice(String symbol);// get average prices for symbol

    public int getTickCount(String symbol);// no of prices received for symbol
}
