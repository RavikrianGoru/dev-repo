package durgasoft.one;

public class ByteArthmeticOperation {

	public static void main(String[] args) {
		byte a =10;
		byte b =20;
		byte c = b++; //default type converted
		//c = b + 1;	//CE: Type conversion required
		c =(byte) (b + 1);
		//c = a + b;	//CE: Type conversion required
		c = (byte) (a + b);
		System.out.println(c);
	}

}
