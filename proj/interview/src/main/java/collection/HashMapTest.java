package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

class Dog implements Comparable<Dog>
{
    String color;
    Random r = new Random();

    Dog(String c)
    {
        color = c;
    }

    public int hashCode()
    {
        // int a = color.length() + r.nextInt();
        return color.length();
    }

    public boolean equals(Object o)
    {
        return ((Dog) o).color.equals(this.color);
    }

    public String toString()
    {
        return color + " dog";
    }

    @Override
    public int compareTo(Dog o)
    {
        return o.color.compareTo(this.color);
    }
}

public class HashMapTest
{

    public static void main(String[] args)
    {
         HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
//        TreeMap<Dog, Integer> hashMap = new TreeMap<Dog, Integer>();
        Dog d1 = new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");

        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);

        // print size
        System.out.println(hashMap.size());

        // loop HashMap
        for (Entry<Dog, Integer> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }

}
