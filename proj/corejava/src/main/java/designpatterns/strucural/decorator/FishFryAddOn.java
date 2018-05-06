package designpatterns.strucural.decorator;

public class FishFryAddOn implements IMealAddOns
{
    IMeal meal;
    public FishFryAddOn(IMeal meal)
    {
        this.meal=meal;
    }
    
    @Override
    public String getDescription()
    {
        return new StringBuffer(meal.getDescription()).append(" + 1 Fish Fry").toString();
    }

    @Override
    public double getCost()
    {
        return meal.getCost()+150;
    }

}
