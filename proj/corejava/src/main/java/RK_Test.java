class I {

}

class A extends I {

}

public class RK_Test {
	public static void main(String[] args) {
		A a = new A();
		I b = new A();
		// A c =(A) new I();
		// CT error if no type casting
		// RT can not convert to child class
		System.out.println(a instanceof A);
		System.out.println(b instanceof A);

	}

}
