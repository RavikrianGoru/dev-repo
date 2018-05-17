package journaldev.designpatterns.creational;

import javax.xml.xpath.XPathFactory;

/*

Abstract Factory Pattern:
------------------------
One of Creational Design Pattern and  almost similar to Factory Pattern. It is like "Factory Of Factories".

In Factory Pattern, we have single Factory Class that returns different sub classes based on given inputs. Factory class uses some conditional statements(if-else or switch).
In Abstract Factory Pattern, we get rid of conditions by having factory classes for each sub class.
   Super class in factory pattern can be an interface / abstract class or normal java class.
   Sub classes
   Factory classes for all sub-classes.
   Factory class for all sub factories.
   
  Ex: 	1) ComputerAF is Super class/interface/abstract class
   		2) PCAF and ServerAF is sub classes for ComputerAF.
   		3) Abstract Factory class/interface for all sub-factories:(ComputerAFFactory):it contains createComputerAF() which returns super class ComputerAF obj.
   		4) Factory classes/interfaces for all sub classes(PCAFFactory,ServerAFFactory).
   		5) Consumer class that will provide the entry point for the client classes to create sub-classes.
   		6) Client class which passes inputs to factory class for getting instance.
+) provides approach to code for interface rather than implementation
+) is "Factory of Factories" so, it can be easily extended to accommodate more products. ex: we can add another sub class (laptop and LaptopFactory"
+) It avoids conditional logic.

Ex: In jdk:
javax.xml.xpath.XPathFactory.newInstance()
*/

abstract class ComputerAF//can be interface/abstarct class or normal class(implemented)
{
	public abstract String getRAM();
	public abstract String getCPU();
	public abstract String getHDD();
	@Override
	public String toString() {
		return "ComputerAF [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getHDD()=" + getHDD() + "]";
	}
	
}

class PCAF extends ComputerAF
{
	private String ram;
	private String cpu;
	private String hdd;
	public PCAF(){}
	
	public PCAF(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	
}

class ServerAF extends ComputerAF
{
	private String ram;
	private String cpu;
	private String hdd;
	public ServerAF(){}
	
	public ServerAF(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
}

interface ComputerAFAbstarctFactory
{
	public ComputerAF createComputerAF();
}

class PCAFFactory implements ComputerAFAbstarctFactory
{
	private String ram;
	private String cpu;
	private String hdd;
	PCAFFactory(){}
	PCAFFactory(String ram, String cpu, String hdd)
	{
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	@Override
	public ComputerAF createComputerAF() {
		return new PCAF(ram,cpu,hdd);
	}
	
}

class ServerAFFactory implements ComputerAFAbstarctFactory
{
	private String ram;
	private String cpu;
	private String hdd;
	ServerAFFactory(){}
	ServerAFFactory(String ram, String cpu, String hdd)
	{
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	@Override
	public ComputerAF createComputerAF() {
		return new ServerAF(ram, cpu, hdd);
	}
	
}

class ComputerAFFactory{
	public static ComputerAF getComputerAF(ComputerAFAbstarctFactory factory)
	{
		return factory.createComputerAF();
	}
	
}


public class _3_AbstarctFactoryDemo {

	public static void main(String[] args) 
	{
		XPathFactory xpath=null;
		
		ComputerAF pc=ComputerAFFactory.getComputerAF(new PCAFFactory("2 GB", "2.3 GHz", "500 GB"));
		ComputerAF server=ComputerAFFactory.getComputerAF(new ServerAFFactory("20 GB", "3.4 GHz", "5 TB"));
		
		System.out.println(pc);
		System.out.println(server);
	}

}
