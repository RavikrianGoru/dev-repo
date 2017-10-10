package windows;

import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) 
	{
		showSystemProperties();
	}

	public static void showSystemProperties() 
	{
		Properties pro = System.getProperties();
		System.out.println("System properties are:");
		System.out.println("----------------------");
		for (Object key : pro.keySet()) 
		{
			System.out.println("key: " + key + "\nvalue: " + pro.getProperty((String) key));
		}
	}
}
