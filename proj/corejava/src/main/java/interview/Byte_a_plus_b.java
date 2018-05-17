package interview;

public class Byte_a_plus_b {

	public static void main(String[] args) {
		byte a=10;
		byte b=20;
//		byte c=a+b;//compile time error.
		//because, when a+b type is max(int, type of a, type of b).
		
		byte c=(byte)(a+b);
//		a= a + 1;// max(int, byte, int)---->int type casting requires.
		
		
		
		
	}

}
