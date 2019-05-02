package com.javatpoint.io;

import java.io.File;

public class ListAllFileDirs
{

    public static void main(String[] args)
    {
        File folder = new File("C:/group");
 
        if(folder.isDirectory())
        {
            System.out.println("register-------:"+folder.getAbsolutePath());
            registerDirs_subDirs(folder);
        }
        
    }

    public static void registerDirs_subDirs(File folder)
    {
        for (File temp : folder.listFiles())
        {
            if(temp.isDirectory())
            {
                System.out.println("register-------:"+temp.getAbsolutePath());
                registerDirs_subDirs(temp);
            }else
            {
                System.out.println("No need to register-------:"+temp.getAbsolutePath());
            }
        }
    }
}
