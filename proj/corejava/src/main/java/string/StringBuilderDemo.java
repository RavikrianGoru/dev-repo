package string;

public class StringBuilderDemo {

	public static void main(String[] args) {

		/*
		StringBuilder is mutable(changeable). as well as Not Thread-safe(multiple threads can access at a time).
		 */
		StringBuilder sbl1=new StringBuilder();
		StringBuilder sbl2=new StringBuilder("RaviKiranGoru");
		System.out.println(sbl1);
		sbl1.append("Ravi");
		System.out.println(sbl1);
		sbl1.replace(3, 4, "iKiran");
		System.out.println(sbl1);
		sbl1.reverse();
		System.out.println(sbl1);
		sbl1.insert(0, "uroG");
		System.out.println(sbl1);
		sbl1.delete(4, 9);
		System.out.println(sbl1);
	}

}
