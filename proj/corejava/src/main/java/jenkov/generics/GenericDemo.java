package jenkov.generics;

class MyGeneric<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}


public class GenericDemo {

	public static void main(String[] args) {

		MyGeneric genObj0=new MyGeneric();
		genObj0.add(new Integer(25));
		System.out.println(genObj0.get());
		
		MyGeneric<Integer> genObj1=new MyGeneric<Integer>();
		genObj1.add(new Integer(55));
		System.out.println(genObj1.get());
		
		
	}

}
