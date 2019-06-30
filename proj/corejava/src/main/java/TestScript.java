import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestScript
{

    public static void main(String[] args) throws IOException
    {
        if (args.length !=1 && !(args[0].equals("status")||args[0].equals("stop")||args[0].equals("restart")))
        {
            System.err.println("Invalid cmd libe argument");
            System.exit(1);
        }
        System.out.println("cmd: "+args[0]);
        String[] cmdstatus = {"/opt/apache-tomcat/latest/bin/webserver_ctrl", args[0] };
        executeCommand(cmdstatus);
        
    }

    private static void executeCommand(String[] cmdArray)
    {
        System.out.println("Cmd :" + cmdArray);
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
}
