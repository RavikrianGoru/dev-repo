package jenkov.generics;

import java.util.ArrayList;
import java.util.List;

/*

Generics are added in java 5.
All the classes are sub classes of Object class.
we can insert ant type of data in Collection such as Object type, String, Integer...... etc.

+) We can restrict specified type ofa data in Collection by using generics.
Ex: List<String>

+) No need to type casting while retrieving data from collections.




*/
class GenericFactory<T>
{
	Class theClass=null;
	public GenericFactory(Class newClass)
	{
		this.theClass=newClass;
	}
	public  T createInstance() throws InstantiationException, IllegalAccessException
	{
		return (T) this.theClass.newInstance();
	}
}



class MyClassInt
{
	public static int value=10;

	@Override
	public String toString() {
		return "MyClassInt ["+value+"]";
	}
	
}
class MyClassString
{
	public static String value="Ravi";
	@Override
	public String toString() {
		return "MyClassInt ["+value+"]";
	}
}

class MyGenericIntString<T>{
	public static <T> void addIntString(T one, T two)
	{
		if(one instanceof String && two instanceof String)
		System.out.println((String)one + (String)two);
		else if(one instanceof Integer && two instanceof Integer)
		System.out.println((Integer)one + (Integer)two);
		else
		System.out.println("Invalied Operation on given type data");
	}
	
	public static <T> List<T> queryAll(String query)
	{
		//objectStore.queryAll(T,query);
		return new ArrayList<T>();
	}
	
}


public class _1_GenericsDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println("inserting different types of data into Collections:");
		ArrayList al = new ArrayList();
		al.add("HI");
		al.add(123);
		System.out.println(al);

		System.out.println("Generics:inserting specified type of data into Collections:");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("HI");
		// al1.add(123);// Compile time Error
		System.out.println(al);
		
		
		System.out.println("Generic custom class created ------------------");
		
		GenericFactory<MyClassInt> genFacObj1=new GenericFactory(MyClassInt.class);
		MyClassInt obj1=genFacObj1.createInstance();
		GenericFactory<MyClassString> genFacObj2=new GenericFactory(MyClassString.class);
		MyClassString obj2=genFacObj2.createInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println("Generic custom method created ------------------");
		System.out.println("adding two Integers");
		MyGenericIntString.addIntString(123, 123);
		System.out.println("adding two Strings");
		MyGenericIntString.addIntString("123", "123");
		System.out.println("adding Integer and Strings");
		MyGenericIntString.addIntString(123, "123");
		
		System.out.println("JDO smaple generic method sample code: please refer method code------------------");
		MyGenericIntString.queryAll("accountName ='"+"UCSM'");
		
		

	}

}
