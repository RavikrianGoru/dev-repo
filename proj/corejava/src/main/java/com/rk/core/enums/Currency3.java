package com.rk.core.enums;

public enum Currency3
{
    PENNY(1)
    {
        @Override
        public void color()
        {
            System.out.println("Color : Copper");
        }
    },
    NICKLE(5)
    {
        @Override
        public void color()
        {
            System.out.println("Color : bronze");
        }
    },
    DIME(10)
    {
        @Override
        public void color()
        {
            System.out.println("Color : Mixed Copper and Silver");
        }
    },
    QUARTER(25)
    {
        @Override
        public void color()
        {
            System.out.println("Color : Silver");
        }
    };

    private int value;

    private Currency3(int value)// must be private
    {
        this.value = value;
    }

    public abstract void color();// abstract method

    @Override
    public String toString()
    {
        return this.name() + ":" + this.value;
    }
}
