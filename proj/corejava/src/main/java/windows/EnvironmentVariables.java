package windows;

import java.util.Map;
import java.util.Properties;

public class EnvironmentVariables {

	public static void main(String[] args) 
	{
		showEnvVariables();
	}
	public static void showEnvVariables()
	{
		Map<String, String> envMap=System.getenv();
		System.out.println("Environment variables are:");
        for(String key :envMap.keySet())
        {
        	System.out.println("key: "+key+"\nvalue: "+envMap.get(key));
        }
	}
}
