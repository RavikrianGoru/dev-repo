package org.corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       BufferedReader reader=new BufferedReader(new FileReader(new File("C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\corejava\\src\\main\\resources\\txt\\customerList.txt")));
       BufferedWriter writer=new BufferedWriter(new FileWriter(new File("C:\\Users\\zgorrav\\codebase\\dev-repo\\proj\\corejava\\src\\main\\resources\\txt\\newcustomerList.txt")));
       int i=1;
       String line;
       while((line=reader.readLine())!=null)
       {
           writer.write(String.format("%04d", i)+line.substring(4,line.length())+"\n");
           i++;
       }
    }
}
