class One
{
	public One()
	{
		System.out.println("3");
	}
	{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
}

public class incedoTest {

	public static void main(String[] args) {
		One one=new One();
		Thread t=new Thread(){
			@Override
			public void run() {
				ping();
			};
		};
		t.start();
	}
	public static void ping()
	{
		System.out.println("ping");
	}
	

}
