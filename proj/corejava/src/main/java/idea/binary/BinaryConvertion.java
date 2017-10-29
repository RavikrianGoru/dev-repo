package idea.binary;

public class BinaryConvertion {

	public static void main(String[] args) {
		
		//method-1
	    System.out.println("Binary form of  6 :  "+Convertions.convert(6, Convertions.BINARY));
	    System.out.println("Binary form of -6 :  "+Convertions.convert(-6, Convertions.BINARY));
        
	    
	    //method-2
//		System.out.println(Integer.toBinaryString(6));
//		System.out.println(Integer.toBinaryString(-6));
		
		//method-3
//		System.out.println(Integer.toString(10,2));
		//System.out.println(Integer.toString(-10,2));//logical error
	}

}
