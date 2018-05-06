package designpatterns.behavioral.strategy.one;

public class Client
{

    public static void main(String[] args)
    {
        TextEditor editor;
            editor=new TextEditor(new UpperCaseFormatter());
            editor.publishText("Hi, This is Ravikiran Goru");
        
            editor=new TextEditor(new LowerCaseFormatter());
            editor.publishText("Hi, This is Ravikiran Goru");
            
    }

}
