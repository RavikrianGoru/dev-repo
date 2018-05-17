package ds.tricky;

public class WrapperEquals {
/*


	Q. Why does the first group of statements print true, but the second false? 
	A. The second prints false because b1 and b2 are references to different Integer objects.
	   The first and third code fragments rely on autoboxing. 
	   Surprisingly the first prints true because values between -128 and 127 appear to refer to the same immutable Integer objects 
	   (Java's implementation of valueOf() retrieves a cached values if the integer is between -128 and 127), 
	   while Java constructs new objects for each integer outside this range. 



*/	
	public static void main(String[] args) {
		
		Integer a1=100;
		Integer a2=100;
		System.out.println("Literal ==");
		if(a1==a2)
			System.out.println(a1+"=="+a2);
		else
			System.out.println(a1+"!="+a2);
		
		System.out.println("Literal ==");
		Integer b1=150;
		Integer b2=150;
		if(b1==b2)
			System.out.println(b1+"=="+b2);
		else
			System.out.println(b1+"!="+b2);

		
		Integer c1=new Integer(100);
		Integer c2=new Integer(100);
		System.out.println("Object ==");
		if(c1==c2)
			System.out.println(c1+"=="+c2);
		else
			System.out.println(c1+"!="+c2);
		
		
	}

}
