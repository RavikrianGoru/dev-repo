package unix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnixCmdExecInJava {

	private static void executeCommand(String[] cmdArray )
    {
		System.out.println("Cmd :"+cmdArray);
        try
        {
            Process p = Runtime.getRuntime().exec(cmdArray);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = null;
            System.out.println("Output of the command:\n");
            while ((s = stdInput.readLine()) != null)
            {
            	System.out.println("Output: " + s);
            }

            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            System.out.println("Error of the command (if any):\n");
            while ((s = stdError.readLine()) != null)
            {
            	System.out.println("Output Error: " + s);
            }
        }
        catch (IOException e)
        {
        	System.out.println("Execution Error: " + e);
        }
    }
	public static void main(String[] args) 
	{
		System.out.println("This Program will work in Linux OS family");
		String[] cmdAry1 = new String[] { "/bin/sh", "-c", "sudo lsof|grep 12742|wc -l" };
		String[] cmdAry2 = new String[] { "/bin/bash", "-c", "sudo lsof|grep 12742|wc -l" };
		executeCommand(cmdAry2);
	}

}
