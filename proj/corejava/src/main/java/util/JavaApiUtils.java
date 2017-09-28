package util;

import java.util.Map;
import java.util.Properties;

public class JavaApiUtils {

	public static void showSystemProperties()
	{
		Properties pro=System.getProperties();
		System.out.println("System properties are:");
		System.out.println("----------------------");
        for(Object key :pro.keySet())
        {
        	System.out.println("key: "+key+"\nvalue: "+pro.getProperty((String)key));
        }
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
