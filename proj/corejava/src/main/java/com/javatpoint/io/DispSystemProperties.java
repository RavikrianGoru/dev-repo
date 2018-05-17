package com.javatpoint.io;

import java.util.Properties;

public class DispSystemProperties {

	public static void main(String[] args) {

		Properties p=System.getProperties();
		p.list(System.out);
		System.setProperty("ravi", "raviVal");
		
		
		System.out.println("----------------------------------");
		p=System.getProperties();
		p.list(System.out);
		
	}

}
