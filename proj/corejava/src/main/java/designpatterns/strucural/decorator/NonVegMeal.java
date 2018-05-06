package designpatterns.strucural.decorator;

public class NonVegMeal implements IMeal
{
    @Override
    public String getDescription()
    {
        return "Ordered Meal type:"+MealType.NONVEG;
    }

    @Override
    public double getCost()
    {
        return 120;
    }

}
