package designpatterns.behavioral.strategy.one;

public class LowerCaseFormatter implements TextFormatter
{

    @Override
    public void format(String text)
    {
        System.out.println("LowerCase :"+text.toLowerCase());
    }

}
