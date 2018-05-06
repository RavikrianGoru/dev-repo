package designpatterns.strucural.decorator;

public class VegMeal implements IMeal
{
    @Override
    public String getDescription()
    {
        return "Ordered Meal type:"+MealType.VEG;
    }

    @Override
    public double getCost()
    {
        return 65;
    }

}
