package asg;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CropRatio
{
    private AtomicInteger totalWeight =new AtomicInteger();
    private ConcurrentHashMap<String, Integer> crops = new ConcurrentHashMap<>();

    public void add(String name, int cropWeight)
    {
        Integer currentCropWeight = crops.get(name) == null ? cropWeight : (crops.get(name) + cropWeight);
        crops.put(name, currentCropWeight);
        totalWeight.getAndAdd(cropWeight);
    }

    public double proportion(String name)
    {
        return (crops.get(name) / (totalWeight.get()+0.0));
    }

    public static void main(String[] args)
    {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }
}
