package designpatterns.strucural.decorator;

public class CheckenFryAddOn implements IMealAddOns
{
    IMeal meal;
    public CheckenFryAddOn(IMeal meal)
    {
        this.meal=meal;
    }
    @Override
    public String getDescription()
    {
        return new StringBuffer(meal.getDescription()).append(" + 1 Checken Fry").toString();
    }

    @Override
    public double getCost()
    {
        return meal.getCost()+100;
    }

}
