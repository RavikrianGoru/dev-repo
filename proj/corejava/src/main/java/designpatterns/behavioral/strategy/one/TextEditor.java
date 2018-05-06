package designpatterns.behavioral.strategy.one;

public class TextEditor
{
    public TextFormatter formatter;
    
    public TextEditor(TextFormatter formatter)
    {
        this.formatter=formatter;
    }
    
    public void publishText(String text)
    {
        this.formatter.format(text);
    }

}
