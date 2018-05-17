class Vehicle
{
	String name="Vechicle";
}

class Car extends Vehicle
{
	String name="Car";
}
class Nano extends Car
{
	String name="Nano";
}
class Bike extends Vehicle
{
	String name="Byke";
}

public class OperatorinstanceOf {

	public static void main(String[] args) {
		Vehicle v=new Nano();//new Vehicle();
		if(v instanceof Car)
		{
			System.out.println("v instanceof Car");
		}
		if(v instanceof Bike)
		{
			System.out.println("v instanceof Bike");
		}
		if(v instanceof Vehicle)
		{
			System.out.println("v instanceof Vehicle");
		}
		if(v instanceof Nano)
		{
			System.out.println("v instanceof Nano");
		}

	}

}
