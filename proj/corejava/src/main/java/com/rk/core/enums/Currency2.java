package com.rk.core.enums;

public enum Currency2
{
    // Enum with values, constructors

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int value;

    private Currency2(int value)// must be private
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        switch (this)
        {
            case PENNY:
                System.out.println(this.name() + ":" + this.value);
                break;
            case NICKLE:
                System.out.println(this.name() + ":" + this.value);
                break;
            case DIME:
                System.out.println(this.name() + ":" + this.value);
                break;
            case QUARTER:
                System.out.println(this.name() + ":" + this.value);

        }
        return super.toString();
    }

}
