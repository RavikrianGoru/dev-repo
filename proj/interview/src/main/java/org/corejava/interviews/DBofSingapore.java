package org.corejava.interviews;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


interface Department
{
    public void setName(String name);

    public void display();
}
class Sales implements Department
{
    private String name;
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void display()
    {
        System.out.println(Sales.class.getName() + " " + name);
    }
}
class Dev implements Department
{
    private String name;
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void display()
    {
        System.out.println(Dev.class.getName() + " " + name);
    }
}


class Testing implements Department
{
    private String name;
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void display()
    {
        System.out.println(Testing.class.getName() + " " + name);
    }
}
public class DBofSingapore
{
    public static void main(String[] args) throws IOException
    {
        Department dep;
        String temp;
        String[] strArray = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of inputs:");

        int n = sc.nextInt();
        sc.nextLine();// to suppress "\n"

        for (int i = 1; i <= n; i++)
        {
            temp = sc.nextLine();
            if (temp.split(" ").length != 2)
            {
                System.out.println("Envalid input format.");
            }
            else
            {
                strArray = temp.split("\\s");
                dep = getRef(strArray[0]);
                if (dep != null)
                {
                    dep.setName(removeSplChars(strArray[1]));
                    dep.display();
                }
                else
                {
                    System.out.println("Invalid input or dep not available");
                }
            }
        }
    }

    private static String removeSplChars(String eName)
    {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(eName);
        StringBuffer eNameSplRem = new StringBuffer();
        while (matcher.find())
        {
            eNameSplRem.append(matcher.group());
        }
        return eNameSplRem.toString();
    }

    private static Department getRef(String dName)
    {
        Department dep;
        if (dName.equalsIgnoreCase("sales"))
        {
            dep = new Sales();
        }
        else if (dName.equalsIgnoreCase("test"))
        {
            dep = new Testing();
        }
        else if (dName.equalsIgnoreCase("dev"))
        {
            dep = new Dev();
        }
        else
            dep = null;
        return dep;
    }
}
