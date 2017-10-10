package idea;

public class NumberConvertions {

	public static void main(String[] args) {
		
		//method-1
		NumberConvertionsUtils.convert(-10, NumberConvertionsUtils.BINARY);
		
		//method-2
		System.out.println(Integer.toBinaryString(10));
		//System.out.println(Integer.toBinaryString(-10));//Doubt
		
		//method-3
		System.out.println(Integer.toString(10,2));
		//System.out.println(Integer.toString(-10,2));//logical error
	}

}
