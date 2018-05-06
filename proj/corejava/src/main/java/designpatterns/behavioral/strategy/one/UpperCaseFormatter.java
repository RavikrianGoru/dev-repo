package designpatterns.behavioral.strategy.one;

public class UpperCaseFormatter implements TextFormatter
{

    @Override
    public void format(String text)
    {
        System.out.println("UpperCase :"+text.toUpperCase());
    }

}
