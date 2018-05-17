package interview;


final class DummyString
{
	public final String panCard;
	public DummyString(String panCard)
	{
		this.panCard=panCard;
	}
	public String getPanCard()
	{
		return this.panCard;
	}
}


class ImmutableValue
{
	private int value=0;
	public ImmutableValue(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return this.value;
	}
	public ImmutableValue()
	{
	}
}

public class CreateUrOwnImmutableClass {

	public static void main(String[] args) {

		System.out.println("all Wrapper classes and String class are examples of immutable class\n");
		
		ImmutableValue obj=new ImmutableValue(10);
		System.out.println("We can create immutable class as follow");
		System.out.println("Normal class with private varibale,public constructors no setters and only getters");	
		System.out.println("here, private variable and nosetters, does not allow to change value of private variable out side the class.\n");
		
		DummyString obj1=new DummyString("ravi");
		System.out.println("Ww can create immutable class as follow");
		System.out.println("final class with public final varibale,public constructors no setters and only getters");
		System.out.println("here, final variable and nosetters, does not allow to change value of private variable out side the class.");
		
		
	}

}
