package designpatterns.strucural.decorator;

public class OmletAddOn implements IMealAddOns
{
    IMeal meal;
    public OmletAddOn(IMeal meal)
    {
        this.meal=meal;
    }
    
    @Override
    public String getDescription()
    {
        return new StringBuffer(meal.getDescription()).append(" + 1 Omlet").toString();
    }

    @Override
    public double getCost()
    {
        return meal.getCost() + 15;
    }

}
