package com.sapient.feecalculator.model;

import java.util.Comparator;
import java.util.Date;

public class Transaction implements Comparator<Transaction>
{

    private String externalTransactionId;
    private String clientId;
    private String securityId;
    private String transactionType;
    private Date transactionDate;
    private double marketValue;
    private String priorityFlag;
    private double transactionFee;

    public String getExternalTransactionId()
    {
        return externalTransactionId;
    }

    public void setExternalTransactionId(String externalTransactionId)
    {
        this.externalTransactionId = externalTransactionId;
    }

    public String getClientId()
    {
        return clientId;
    }

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getSecurityId()
    {
        return securityId;
    }

    public void setSecurityId(String securityId)
    {
        this.securityId = securityId;
    }

    public Date getTransactionDate()
    {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate)
    {
        this.transactionDate = transactionDate;
    }

    public double getMarketValue()
    {
        return marketValue;
    }

    public void setMarketValue(double marketValue)
    {
        this.marketValue = marketValue;
    }

    public String getTransactionType()
    {
        return transactionType;
    }

    public void setTransactionType(String transactionType)
    {
        this.transactionType = transactionType;
    }

    public String getPriorityFlag()
    {
        return priorityFlag;
    }

    public void setPriorityFlag(String priorityFlag)
    {
        this.priorityFlag = priorityFlag;
    }

    public double getTransactionFee()
    {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee)
    {
        this.transactionFee = transactionFee;
    }

    @Override
    public String toString()
    {
        return "Transaction [externalTransactionId=" + externalTransactionId + ", clientId=" + clientId
                + ", securityId=" + securityId + ", transactionType=" + transactionType + ", transactionDate="
                + transactionDate + ", marketValue=" + marketValue + ", priorityFlag=" + priorityFlag
                + ", transactionFee=" + transactionFee + "]";
    }

    @Override
    public int compare(Transaction o1, Transaction o2)
    {
        int clientIdComp = o1.getClientId().compareTo(o2.getClientId());
        if (clientIdComp == 0)
        {
            int transTypeComp = o1.getTransactionType().compareTo(o2.getTransactionType());
            if (transTypeComp == 0)
            {
                int transDatComp = o1.getTransactionDate().compareTo(o2.getTransactionDate());
                if (transDatComp == 0)
                {
                    return o1.getPriorityFlag().compareTo(o1.getPriorityFlag());
                }
                else
                {
                    return transDatComp;
                }
            }
            else
            {
                return transTypeComp;
            }
        }
        return clientIdComp;
    }

}
