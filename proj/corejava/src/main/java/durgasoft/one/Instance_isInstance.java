package durgasoft.one;

public class Instance_isInstance {

	public static void main(String[] args) throws ClassNotFoundException {

		Thread t = new Thread();
		Object o = new Object();
		String s = new String("Ravi");

		if( t instanceof Object)
		{
			System.out.println("t instanceof Object");
		}
		
		if (Class.forName("java.lang.String").isInstance(Object.class))
		{
			System.out.println("(Class.forName(String).isInstance(Object.class)");
		}
	}

}
