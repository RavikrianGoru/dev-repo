package new28thOct;

public class ObjectCreation4Ways implements Cloneable{

	int a=10;
	
	public ObjectCreation4Ways()
	{
		System.out.println("Default Constructor:0-arg");
	}
	
	public static ObjectCreation4Ways getInstance()
	{
		return new ObjectCreation4Ways();
	}
	
	public static void main(String[] args) throws Exception{

		System.out.println("Way-1: using \'new\' keyword................................");
		ObjectCreation4Ways obj1=new ObjectCreation4Ways();
		System.out.println("ObjectCreation4Ways Object1:"+obj1);
		
		System.out.println("Way-2: using \'factory Method\' ............................");
		System.out.println("ObjectCreation4Ways Object2:"+ObjectCreation4Ways.getInstance());//getInstance();
		
		System.out.println("Way-3: using \'clone()\' class should implements Clonable interface' ...................................");
		System.out.println("ObjectCreation4Ways Object3:"+obj1.clone());
		

//work from cmd prompt.
//		Object obj4=Class.forName("ObjectCreation4Ways").newInstance();
//		System.out.println((ObjectCreation4Ways)obj4);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("java.lang.Double has constant values to represent infinity(Infinity,-Infinity) and undefined values(NaN).");
		//System.out.println(10/0);
		System.out.println("10/0.0="+(10/-0.0));
		System.out.println("10/0.0="+(10/0.0));
		System.out.println("0.0/0.0="+(0.0/0.0));
		System.out.println("-0.0/0.0="+(-0.0/0.0));

		System.out.println("java.lang.Double.NaN==java.lang.Double.NaN:"+(java.lang.Double.NaN==java.lang.Double.NaN));
		System.out.println("java.lang.Double.NaN!=java.lang.Double.NaN:"+(java.lang.Double.NaN!=java.lang.Double.NaN));
		
		
	}

}
