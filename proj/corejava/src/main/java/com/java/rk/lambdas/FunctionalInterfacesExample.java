package com.java.rk.lambdas;

@FunctionalInterface
interface MyFunctionOne
{
    public void apply();
}

@FunctionalInterface
interface MyFunctionTwo<T>
{
    public void apply(T t);
}

@FunctionalInterface
interface MyFunctionThree<T,R,U>
{
    public U apply(T t,R r);
}

@FunctionalInterface
interface Finder<T,R>
{
    public int find(T t,R r);
}


class StringConverter
{
    public int convertToInt(String s) {
        return Integer.parseInt(s);
    }
}
@FunctionalInterface
interface Converter
{
    public int convert(String t);
}

@FunctionalInterface
interface StrigFactory
{
    public String createNew(char[] t);
}


public class FunctionalInterfacesExample
{

    public static void main(String[] args)
    {
        MyFunctionOne mfOne=()->{System.out.println("Hello World");};
        mfOne.apply();
        
        MyFunctionTwo<String> mfTwo=(String s)->{System.out.println("Hello "+ s);};
                              mfTwo=(s)->{System.out.println("Hello "+ s);};
                              mfTwo=s->System.out.println("Hello "+ s);
        mfTwo.apply("Ravi");
        
        MyFunctionThree<String, String, StringBuffer> mfThree=(s1,s2)->{return new StringBuffer().append(s1).append(s2);};
        StringBuffer sb =mfThree.apply("Ravi", "Kiran");
        System.out.println(sb.toString());
        
        
        System.out.println("Parameter Method Reference");
        Finder<String,String> myFinder=(s1,s2)->s1.indexOf(s2);
                              myFinder=String::indexOf;
        System.out.println(myFinder.find("ravikiran", "kiran"));
        
        
        System.out.println("Instance Method References");
        StringConverter obj=new StringConverter();
        Converter myCon =obj::convertToInt;
        System.out.println(myCon.convert("1000"));
        
        System.out.println("Constructor References");
        StrigFactory sf= (s)->{return new String(s);};
                     sf= String::new;
        
        final char ch[]= {'h','i'};
        System.out.println(sf.createNew(ch));

    }

}
