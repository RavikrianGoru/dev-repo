package durgasoft.one;

public class ReferenceEqualAndEqual {

	public static void main(String[] args) {

		String s = "Hi";
		Object o = new Object();
		Thread t = new Thread();
		System.out.println(s == o);
		System.out.println(t == o);
		// System.out.println(s == t);// CE: System.out.println(a == o); there is no parent child relation between Thread and String
	}

}
