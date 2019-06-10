package com.sapient.feecalculator.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sapient.feecalculator.constants.Priority;
import com.sapient.feecalculator.constants.TransactionFee;
import com.sapient.feecalculator.constants.TransactionType;
import com.sapient.feecalculator.exception.InvalidTransactionException;
import com.sapient.feecalculator.model.Transaction;
import com.sapient.feecalculator.util.EnumUtil;;

interface Reportable
{

    public int displayTransactionReport();

}

public abstract class TransactionReader implements Reportable
{
    public List<Transaction> transactionsList;

    public abstract void loadTransactionsData(String fileLocation) throws IOException;

    public void saveTransaction(Transaction oneTransaction)
    {
        if (transactionsList == null)
        {
            transactionsList = new ArrayList<Transaction>();
        }
        if (oneTransaction != null)
        {
            transactionsList.add(getFeeUpdatedTransaction(oneTransaction));
        }
    }

    private Transaction getFeeUpdatedTransaction(Transaction oneTransaction)
    {
        try
        {
            if (isIntraDayTransaction(oneTransaction))
            {
                oneTransaction.setTransactionFee(TransactionFee.TEN);
            }
            else
            {
                if (oneTransaction.getPriorityFlag() == Priority.YES)
                {
                    oneTransaction.setTransactionFee(TransactionFee.FIVE_HUNDRED);
                }
                else
                {
                    if (oneTransaction.getTransactionType().equals(TransactionType.SELL)
                            || oneTransaction.getTransactionType().equals(TransactionType.WITHDRAW))
                    {
                        oneTransaction.setTransactionFee(TransactionFee.HUNDRED);
                    }
                    else if (oneTransaction.getTransactionType().equals(TransactionType.BUY)
                            || oneTransaction.getTransactionType().equals(TransactionType.DEPOSIT))
                    {
                        oneTransaction.setTransactionFee(TransactionFee.FIFTY);
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            oneTransaction=null;
        }
        return oneTransaction;
    }

    public Transaction readTransaction(String[] transFields)
    {
        Transaction trans = new Transaction();
        try
        {
            if (transFields.length != 7)
            {
                throw new InvalidTransactionException("Invalied Transaction, Can not be stored this transaction.");
            }
            else
            {
                trans.setExternalTransactionId(transFields[0]);
                trans.setClientId(transFields[1]);
                trans.setSecurityId(transFields[2]);
                trans.setTransactionType(transFields[3]);
                trans.setTransactionDate(EnumUtil.parseDate(transFields[4]));
                trans.setMarketValue(EnumUtil.parseMarketValue(transFields[5]));
                trans.setPriorityFlag(transFields[6]);
            }
        }
        catch (InvalidTransactionException e1)
        {
            System.err.println(e1.getMessage());
            return null;
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            return null;
        }
        return trans;
    }

    private boolean isIntraDayTransaction(Transaction one)
    {
        boolean isIntraDayTrans = false;
        Transaction tempTran = null;

        if (transactionsList != null && transactionsList.size() > 0)
        {
            for (Transaction each : transactionsList)
            {
                if (each.getClientId().equals(one.getClientId()) && each.getSecurityId().equals(one.getSecurityId())
                        && each.getTransactionDate().equals(one.getTransactionDate()))
                {
                    if ((each.getTransactionType().equals(TransactionType.BUY)
                            && one.getTransactionType().equals(TransactionType.SELL))
                            || (each.getTransactionType().equals(TransactionType.SELL)
                                    && one.getTransactionType().equals(TransactionType.BUY)))
                    {
                        isIntraDayTrans = true;
                        tempTran = each;
                        break;
                    }
                }
            }
            if (tempTran != null)
            {
                transactionsList.remove(tempTran);
                tempTran.setTransactionFee(TransactionFee.TEN);
                transactionsList.add(tempTran);
            }
        }
        return isIntraDayTrans;
    }

    public int displayTransactionReport()
    {
        if(transactionsList!=null)
        {
            Collections.sort(transactionsList, new Transaction());
            System.out.println("-------------------------------------------Report-------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Client Id \t| Transaction Type \t| Transaction Date | Priority | Processing Fee    |");
            for (Transaction transaction : transactionsList)
            {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println(transaction.getClientId() + "\t \t| " + transaction.getTransactionType()
                        + "\t \t| " + transaction.getTransactionDate() + "\t| "
                        + (transaction.getPriorityFlag().equals("Y") ? "HIGH\t" : "NORMAL") + "\t| "
                        + transaction.getTransactionFee() + "\t|");
            }
            System.out.println("--------------------------------------------------------------------------------");
            return transactionsList.size();
        }else
        {
            return 0;
        }
    }

}
