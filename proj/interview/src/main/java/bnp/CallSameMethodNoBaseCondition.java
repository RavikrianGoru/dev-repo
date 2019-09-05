package bnp;

public class CallSameMethodNoBaseCondition
{
    public void wish()
    {
        System.out.println("Hi");
        wish();
        // No: C.E but  will cause stackOverFlow as no base condition.
    }

    public static void main(String[] args)
    {
        CallSameMethodNoBaseCondition t =new CallSameMethodNoBaseCondition();
        t.wish();
    }

}
