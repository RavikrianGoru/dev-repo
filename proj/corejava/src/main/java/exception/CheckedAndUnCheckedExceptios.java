package exception;

/*
--------------------------------------------------------------------------------------------------
  											  Object
 

											Throwable
					
				Exception 													Error
		
							RuntimeException
		
Checked						UnChecked
	
	
	
	
--------------------------------------------------------------------------------------------------					
Throwable is a super class for all Exceptions and Error.
Exception can be handled but Error can not be handled.

Checked Exceptions
	1) must be caught  by using try-catch/ propagate as declaring throws 
	2) Direct sub classes of java.lang.Exception class
	
Unchecked Exceptions
	1) They don't have to be caught or declared thrown.
	2) Direct sub classes of java.lang.RuntimeException class

Checked and unchecked exceptions are functionally equivalent. 
There is nothing you can do with checked exceptions that cannot also be done with unchecked exceptions, and vice versa. 

Please refer custom Checked and Unchecked Exceptions.

* we can throw new Error() or new Throwable() 


*/
class InvalidNameCheckedException extends Exception {
	public InvalidNameCheckedException(String msg) {
		super(msg);
	}
}

class InvalidNameUnCheckedException extends RuntimeException {
	public InvalidNameUnCheckedException(String msg) {
		super(msg);
	}
}

public class CheckedAndUnCheckedExceptios {

	
	public static void validateName1(String str) throws InvalidNameCheckedException {
		if (str == "" || str == null)
			throw new InvalidNameCheckedException("(Checked):invalid name Exception, Name should not be null or empty");
	}

	public static void validateName2(String str){
		if (str == "" || str == null)
			throw new InvalidNameUnCheckedException("(UnChecked):invalid name Exception, Name should not be null or empty");
	}
	
	
	public static void main(String[] args) throws Exception{

		String str = "1";
		try {
			System.out.println(
					"validateName1(-) throws InvalidNameCheckedException, It is cheched Exception, this method call should be handled or propage as declating throws.");
			validateName1(str);
		} catch (InvalidNameCheckedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("validateName2(-) is Uncheched Exception, this method call need not to be handled or propage as declating throws(At compile Time: No Error.)");
		validateName2(str);
	}

}
