package journaldev.designpatterns.creational;
/*	Builder Design Pattern is a creational design pattern like Factory and Abstract factory.
it solves some of the problems with Factory/Abstract factory patterns when an object contains a lot of attributes.
Problems with Factory/Abstract Factory:
-) Passing too many attributes to Factory class that can be error prone because Type or order of attributes may be mismatched.
-) Some of attributes may be optional those are forced to give as NULL.
-) get confused.

 We can solve the issue with constructors and setter methods but problem with this approach is that the object state will be inconsistent until all the attributes are set explicitly.

Steps 
	1) Create static nested class and then copy  all the arguments from the outer class to the Builder class. 
	   We should follow naming convention and if the class name is Computer then builder class should be ComputerBuilder. 
	
	2) The builder class should have a public constructor  with all the required attributes as parameters.
	 
	3) Builder class should have methods to set the optional parameters and it should return same Builder  object after setting the optional parameters.
	
	4) The final step  is to provide a build() method in the builder class that will return the Object needed by the client program.
	   For this we need to have a private constructor  in the class with builder class as argument.

java.lang.StringBuilder.appened()
java.lang.StringBuffer.append()


*/

class ComputerBP
{
	
	//1 Required params and optional param
	//2 All getters no setters
	//3 one private constructor which takes Builder Obj as argument
	
	//4 static Builder class with all param(required and Optional)
	//5 constructor for all required param.
	//6 setters for all optional param and returns builder class obj.
	//7 build method which returns Super class obj
	
	
	//Required parameters.
	private String hdd;
	private String ram;
	private String cpu;
	
	//Optional parameters.
	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	//All getters no setters.......
	public String getHDD(String hdd)
	{
		return hdd;
	}
	public String getRAM(String ram)
	{
		return ram;
	}
	public String getCPU(String cpu)
	{
		return cpu;
	}
	public boolean isGraphicCardEnabled()
	{
		return isGraphicCardEnabled;
	}
	public boolean isBluetoothEnabled()
	{
		return isBluetoothEnabled;
	}
	
	
	//private constructor which restricts  
	private ComputerBP(ComputerBPBuilder builder)
	{
		this.hdd=builder.hdd;
		this.ram=builder.ram;
		this.cpu=builder.cpu;
		this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	
	@Override
	public String toString() {
		return "ComputerBP [hdd=" + hdd + ", ram=" + ram + ", cpu=" + cpu + ", isGraphicCardEnabled="
				+ isGraphicCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}


	public static class ComputerBPBuilder
	{
		//copy all parameters form outer class

		//Required parameters.
		private String hdd;
		private String ram;
		private String cpu;
		
		//Optional parameters.
		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;
		
		//constructor for all required param.
		public ComputerBPBuilder(String hdd, String ram, String cpu)
		{
			this.hdd=hdd;
			this.ram=ram;
			this.cpu=cpu;
		}
		
		//methods for optional parameters
		public ComputerBPBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled)
		{
			this.isGraphicCardEnabled=isGraphicCardEnabled;
			return this;
		}
		public ComputerBPBuilder setBluetoothEnabled(boolean isBluetoothEnabled)
		{
			this.isBluetoothEnabled=isBluetoothEnabled;
			return this;
		}
		
		//build method which returns Super class obj
		public ComputerBP build()
		{
			return new ComputerBP(this);
		}

	}
}



public class _4_BuilderPatternDemo {
	
	
	public static void main(String[] args) {
		
		//Using builder to get the object in a single line of code and without any inconsistent state or argumenets management issues
		ComputerBP builderObj=new ComputerBP.ComputerBPBuilder("2 TB", "20 GB", "4.5 GHz").setBluetoothEnabled(true).setGraphicCardEnabled(true).build();
		System.out.println(builderObj);
		StringBuilder sd=null;
		StringBuffer sdf=null;
		

	}

}
