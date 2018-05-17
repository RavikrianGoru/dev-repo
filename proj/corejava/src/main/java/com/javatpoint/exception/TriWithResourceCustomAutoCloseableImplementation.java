package com.javatpoint.exception;


class CutstomAutoClosableImplementedClass implements AutoCloseable
{
	public void doIt()
	{
		System.out.println("doIt() method is called.");
	}
	

	@Override
	public void close() throws Exception {
		System.out.println(this.getClass().getName()+" is closed");
	}
	
}

class CustomNotAutoClosableClass
{
	public void doIt()
	{
		System.out.println("doIt() method is called.");
	}
}

public class TriWithResourceCustomAutoCloseableImplementation {

	public static void main(String[] args) throws Exception {

		System.out.println("we can use custom class in try-with-resource block but that custome class has to implement AutoCloseable Interface and has to override close() method.");
		try(CutstomAutoClosableImplementedClass obj=new CutstomAutoClosableImplementedClass();)
//				CustomNotAutoClosableClass obj1=new CustomNotAutoClosableClass();)-----------// Compile time Exception says CustomNotAutoClosableClass is not implements AutoClosable interface
		{
			obj.doIt();
		}
	}

}
