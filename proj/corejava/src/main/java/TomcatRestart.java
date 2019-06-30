import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomcatRestart
{
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

    public static void main(String[] args) throws IOException
    {
//        String scriptPath = "/opt/apache-tomcat/latest/bin/webserver_ctrl";
//        String comand = "stop";
//        String[] cmdAry2 = new String[]
//        { "/opt/apache-tomcat/latest/bin/webserver_ctrl", "-c", "sudo stop" };
//        executeCommand(cmdAry2);

//        test1();
        

    }

    public static void test1()
    {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("/opt/apache-tomcat/latest/bin/webserver_ctrl");
        try
        {
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
            {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0)
            {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            }
            else
            {
                // abnormal...
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
