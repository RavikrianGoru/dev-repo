package com.sapient.feecalculator.exception;

public class InvalidTransactionException extends Exception
{
    private static final long serialVersionUID = 1L;

    public InvalidTransactionException(String msg)
    {
        super(msg);
    }
}
