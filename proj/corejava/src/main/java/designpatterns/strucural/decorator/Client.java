package designpatterns.strucural.decorator;

public class Client
{

    public static void main(String[] args)
    {
        IMeal meal =new VegMeal();
        System.out.println(meal.getDescription());
        System.out.println(meal.getCost());
        
        
        meal=new OmletAddOn(new VegMeal());
        System.out.println(meal.getDescription());
        System.out.println(meal.getCost());
        
        meal=new CheckenFryAddOn(new OmletAddOn(new VegMeal()));
        System.out.println(meal.getDescription());
        System.out.println(meal.getCost());
        
        
        meal=new FishFryAddOn(new CheckenFryAddOn(new OmletAddOn(new VegMeal())));
        System.out.println(meal.getDescription());
        System.out.println(meal.getCost());
               
    }

}
