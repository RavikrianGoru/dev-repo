package durgasoft.one;

public class VariablesStaticInstace {

	int a = 10;
	static int b = 20;

	public void method1() {
		System.out.println(a);
		System.out.println(b); //static variabl can be acces in instance method direcltly
	}
	public static void main(String[] args) {
		// System.out.println(a);//Can not access instance variable directly in static
		// method
		System.out.println(b);
		VariablesStaticInstace obj = new VariablesStaticInstace();
		obj.method1();
	}

}
