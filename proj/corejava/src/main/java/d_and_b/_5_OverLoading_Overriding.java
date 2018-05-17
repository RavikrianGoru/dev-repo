package d_and_b;

class PClass
{
	
	static public void m1()
	{
		System.out.println("static method m1() in PClass");
	}
	public void m2()
	{
		System.out.println("m2 is available  in PClass");
	}
}
class CClass extends PClass
{
	static public void m1()
	{
		System.out.println("static method m1() in CClass");
	}
	
	@Override
	public void m2()
	{
		System.out.println("m2 is overridden in CClass");
	}
	
}


public class _5_OverLoading_Overriding {

	public static void main(String[] args) {
		
		System.out.println("static methods are not overridden, if we put @Override in child class method Compile time error. else it consider two methods as normal static methods.");
		System.out.println("We can overload all methods static and instance methods main() method too");
	}

}
