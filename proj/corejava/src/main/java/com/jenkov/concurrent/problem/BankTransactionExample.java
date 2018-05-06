package com.jenkov.concurrent.problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

class Account
{
    private double balance;

    public Account(double balance)
    {
        this.balance=balance;
    }
    
    public void deposit(double balance)
    {
        this.balance+=balance;
    }
    public boolean withdraw(double balance)
    {
        if(this.balance-balance>=0)
        {
            this.balance-=balance;
            return true;
        }
        return false;
    }
    public double getBalance()
    {
        return this.balance;
    }

}
class Bank
{
    public static final int MAX_ACCOUNTS=5;
    public static final double INITAIL_BALANCE=500;
    Account[] allAccounts=new Account[MAX_ACCOUNTS];
    public Bank()
    {
        for(int i=1;i<=MAX_ACCOUNTS;i++)
        {
            allAccounts[i-1]=new Account(INITAIL_BALANCE);
        }
    }
    public double getBalance(int accountNo)
    {
        try
        {
            return allAccounts[accountNo].getBalance();
        }catch(Exception e)
        {
            System.err.println("Invalid account number.");
        }
        return -1;
    }
    public boolean transferAmt(int accSrc, int accDest, double amt)
    {
        if(allAccounts[accSrc].withdraw(amt))
        {
            allAccounts[accDest].deposit(amt);
            return true;
        }
        return false;
    }
}
public class BankTransactionExample
{

    public static void main(String[] args)
    {
        
    }

}
