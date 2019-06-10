package com.sapient.feecalculator.app;

import java.io.IOException;

import com.sapient.feecalculator.constants.FileType;
import com.sapient.feecalculator.service.TransactionReader;
import com.sapient.feecalculator.service.TransactionReaderFactory;

/**
 * @author zgorrav
 *
 */
public class FeeCal
{
    /**
     * Staring point of FeeCal application main method
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        // Case 1) Testing for text file with '|' delimiter shouold have 20 records
         String sourcefileLocation = "C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\feecalculator\\src\\main\\resources\\input_transactions.txt";
         TransactionReader reader = TransactionReaderFactory.getReader(FileType.TEXT);

        // Case 2) Testing for text file with '|' delimiter one invalid record Report shouold have 19 records
        // String sourcefileLocation ="C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\feecalculator\\src\\main\\resources\\input_transactions_failed.txt";
        // TransactionReader reader = TransactionReaderFactory.getReader(FileType.TEXT);

        // Case 3) Testing for .csv file with ',' delimiter shouold have 20 records
        // String sourcefileLocation = "C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\feecalculator\\src\\main\\resources\\input_transactions.csv";
        // TransactionReader reader = TransactionReaderFactory.getReader(FileType.CSV);

        // Case 4) Testing for .csv file with ',' delimiter one invalid record Report shouold have 19 records
        // String sourcefileLocation = "C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\feecalculator\\src\\main\\resources\\input_transactions_failed.csv";
        // TransactionReader reader = TransactionReaderFactory.getReader(FileType.CSV);
        
        reader.loadTransactionsData(sourcefileLocation);
        reader.displayTransactionReport();
    }
}
