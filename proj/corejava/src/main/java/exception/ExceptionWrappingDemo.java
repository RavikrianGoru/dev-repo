package exception;
/*
Exception Wrapping: when we catch an exception, wrap it in another exception and throw that exception.
-----------------
Ex: In the below code snippet,if validateAge(-) method throws NumberFormateException, 
it caught and wrapped into InvalidException as passing nfExp as last param in InvalidException(-,-) constructor then thrown.
 

try
{
	validateAge(age);
}catch(NumberFormateException nfExp)
{
	throw new InvalidException("Invalid Age", nfExp);
}

Fail Safe Exception Handling:
----------------------------
If an exception is thrown from inside a catch or finally block, this exception may hide the exception caught by that block. 
This is misleading when trying to determine the cause of the error.

+) The correct way to handle this situation is course to check if references assigned inside the try block are null before invoking any methods on them.

Logging Exceptions: Where to Log Exceptions?:
--------------------------------------------

*/
public class ExceptionWrappingDemo {

	public static void main(String[] args) {
		
		System.out.println("Exception Wrapping: when we catch an exception, wrap it in another exception and throw that exception.");
		
		System.out.println("Fail Safe Exception Handling: If an exception is thrown from inside a catch or finally block, this exception may hide the exception caught by that block. ");
		System.out.println("This is misleading when trying to determine the cause of the error.");
		System.out.println("+) The correct way to handle this situation is course to check if references assigned inside the try block are null before invoking any methods on them.");
	}

}
