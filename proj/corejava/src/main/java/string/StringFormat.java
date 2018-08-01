package string;

public class StringFormat
{

    public static void main(String[] args)
    {
        System.out.println(String.format("%s", "Ravi"));
        System.out.println(String.format("%10s", "Ravi"));
        System.out.println(String.format("%.5s", "RaviKiran Goru"));

        System.out.println(String.format("%,d", 5000000));
        System.out.println("Octal----");
        System.out.println(String.format("%o", 93));
        System.out.println(String.format("%#o", 93));
        System.out.println("Hexa----");
        System.out.println(String.format("%x", 93));
        System.out.println(String.format("%#x", 93));
        
        
        String str = "GeeksforGeeks.";
        // Concatenation of two strings
        String gfg1 = String.format("My Company name is %s", str);
        // Output is given upto 8 decimal places
        String str2 = String.format("My answer is %.8f", 47.65734);
        // between "My answer is" and "47.65734000" there are 15 spaces
        String str3 = String.format("My answer is %15.8f", 47.65734);
 
        System.out.println(gfg1);
        System.out.println(str2);
        System.out.println(str3);

        String s1 = "GFG";
        String s2 = "GeeksforGeeks";
 
        //%1$ represents first argument, %2$ second argument
        String gfg2 = String.format("My Company name" + " is: %1$s, %1$s and %2$s", s1, s2);
 
        System.out.println(gfg2);
    }

}
