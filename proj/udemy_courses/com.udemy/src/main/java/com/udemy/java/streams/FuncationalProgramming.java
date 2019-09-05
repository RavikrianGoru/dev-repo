package com.udemy.java.streams;

class Human implements Walkable
{
    public void walk()
    {
        System.out.println("Human is walking");
    }
}

class Robot implements Walkable
{
    public void walk()
    {
        System.out.println("Robot is walking");
    }
}

interface Walkable
{
    public void walk();
}

public class FuncationalProgramming
{

    public static void main(String[] args)
    {
        // Functional programming in java before java8 can be achived through anonymous class.

        Human h = new Human();
        // h.walk();
        walk(h);

        Robot r = new Robot();
        // r.walk();
        walk(r);
        System.out.println("------------------");
        walk(new Walkable()
        {
            @Override
            public void walk()
            {
                System.out.println("Funcational programming before java8");
                System.out.println("Custome obj walk");
            }
        });
        System.out.println("------------------");
        walk(() -> {
            System.out.println("Funcational programming with Lambda");
            System.out.println("Custome obj walk");
        });

        System.out.println("------------------");
        Walkable blockOfCode = () -> {
            System.out.println("Funcational programming with Lambda");
            System.out.println("Custome obj walk");
        };
        walk(blockOfCode);
    }

    public static void walk(Walkable obj)
    {
        obj.walk();
    }

}
