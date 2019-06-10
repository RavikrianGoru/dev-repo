package com.sapient.feecalculator.service;

import com.sapient.feecalculator.constants.FileType;

public class TransactionReaderFactory
{
    public static TransactionReader getReader(String fileType)
    {
        TransactionReader instance = null;
        if (fileType.equalsIgnoreCase(FileType.TEXT))
        {
            instance = new TextTransctionReader();
        }
        else if (fileType.equalsIgnoreCase(FileType.CSV))
        {
            instance = new ExcelTransctionReader();
        }
        else if (fileType.equalsIgnoreCase(FileType.XML))
        {
            instance = new XmlTransctionReader();
        }
        else
        {

        }
        return instance;
    }
}
