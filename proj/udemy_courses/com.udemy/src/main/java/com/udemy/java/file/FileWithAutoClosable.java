package com.udemy.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class MyClosableClass implements AutoCloseable
{

    @Override
    public void close()
    {
        System.out.println("Close method is claled");
    }
    
}


public class FileWithAutoClosable
{
    public static void main(String[] args)
    {
        readFileByBufferedReader();
        readFileByBufferedReaderTryWithResources();
    }

    public static void readFileByBufferedReaderTryWithResources()
    {
        File file = new File("test.txt");
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                MyClosableClass obj =new MyClosableClass();
                )
        {
            String line = br.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void readFileByBufferedReader()
    {
        File file = new File("test.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                    if (fr != null)
                    {
                        fr.close();
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
