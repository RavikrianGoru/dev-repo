package journaldev.designpatterns.creational;

import java.util.Calendar;
import java.util.ResourceBundle;

/*

Factory Pattern is one of the Creational design pattern and it is widely used in JDK as well as frameworks like Spring, Structs ..... etc.
When we have a Super class with multiple sub classes and we need to return one of sub class object based on input.
   Super class in factory pattern can be an interface / abstract class or normal java class.
   Sub classes
   Factory class.
   
   Ex: 	1) Computer is Super class/interface/abstract class
   		2) PC and Server is sub classes for Computer.
   		3) Factory class for creating object based on given inputs.
   		4) Client class which passes inputs to factory class for getting instance.
+) It provide code for interface rather than implementation.
+) It removes instantiation of actual implemented classes from client code.
+) It provides abstraction between implemented class and client classes through interface.

Example(jdk):
java.util.Calendar
java.util.ResourceBundle
java.util.NumberFormat.... etc and valueOf(-) in Wrapper classes such as Boolean, Integer etc

*/

abstract class Computer//we can use abstarct classs/ interface / implemented class as super class.
{
	public static final String TYPE_PC="PC";
	public static final String TYPE_SERVER="SERVER";
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + "]";
	}
}

class PC extends Computer
{
	private String ram;
	private String hdd;
	private String cpu;
	public PC(){}
	public PC(String ram, String hdd, String cpu)
	{
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
}

class Server extends Computer
{
	private String ram;
	private String hdd;
	private String cpu;
	public Server(){}
	public Server(String ram, String hdd, String cpu)
	{
		this.ram=ram;
		this.cpu=cpu;
		this.hdd=hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
}


class ComputerFactory
{
	public static Computer getComputer(String type,String ram, String hdd, String cpu)
	{
		if(Computer.TYPE_PC.equals(type))
			return new PC(ram, hdd, cpu);
		else if(Computer.TYPE_SERVER.equals(type))
			return new Server(ram, hdd, cpu);
		else
		return null;
	}
}
public class _2_FactoryPattenDemo {

	public static void main(String[] args) 
	{
		Computer objPc=ComputerFactory.getComputer(Computer.TYPE_PC, "3 GB", "500 GB", "2.4 GHz");
		Computer objServer=ComputerFactory.getComputer(Computer.TYPE_SERVER, "24 GB", "4 TB", "3.3 GHz");
		System.out.println(objPc+" : hashCode():"+objPc.hashCode());
		System.out.println(objServer+" : hashCode():"+objServer.hashCode());
		
	}

}
