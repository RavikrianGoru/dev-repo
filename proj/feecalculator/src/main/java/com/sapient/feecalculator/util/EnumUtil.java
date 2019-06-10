package com.sapient.feecalculator.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sapient.feecalculator.constants.Priority;
import com.sapient.feecalculator.constants.TransactionType;

public class EnumUtil
{
    public static Double parseMarketValue(String marketValue)
    {
        try
        {
            return Double.parseDouble(marketValue.trim());
        }
        catch (Exception ex)
        {
            System.err.println(marketValue+" is Invalid market value.");
            return (double) 0;
        }
    }

    public static Date parseDate(String date)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date convertedCurrentDate = sdf.parse(date);
            return convertedCurrentDate;
        }
        catch (Exception ex)
        {
            System.err.println(date+" is Invalid Data or date format.");
            return null;
        }
    }
}
