package durgasoft.one;

public class Infinity {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		float c = 0.0f;
		
		//System.out.println(a/b);	//Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(a/c); //Infinity
		System.out.println(-a/c); //-Infinity
		//Float & Double has POSITIVE_INFINITY and NEGATIVE_INFINITY constants
		
		float d = 0.0f;
		float e = -0.0f;
		float f = 0.0f;
		
		System.out.println(d/f); //NaN
		System.out.println(e/f); //NaN
	}

}
