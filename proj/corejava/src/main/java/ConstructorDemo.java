
public class ConstructorDemo {

	int a;
	int b;
	String str1,str2;

	public ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorDemo(int a, String str1)
	{
		System.out.println("int,String");
		this.a=a;
		this.str1=str1;
	}
	public ConstructorDemo(Integer a, String str1)
	{
		System.out.println("Integer,String");
		this.a=a;
		this.str1=str1;
	}
	public ConstructorDemo(Number a, String str1)
	{
		System.out.println("Number,String");
		this.a=(Integer)a;
		this.str1=str1;
	}

	public ConstructorDemo(int a, int b, String str1, String str2)
	{
		this.a=a;
		this.str1=str1;
		this.b=b;
		this.str2=str2;
	}
	
	public ConstructorDemo(ConstructorDemo c)
	{
		a=c.a;
		b=c.b;
		str1=c.str1;
		str2=c.str2;
	}
	public void disp()
	{
		System.out.println(a+" "+b+" "+str1+" "+str2);
	}
	public static void main(String[] args) 
	{
		ConstructorDemo c1=new ConstructorDemo();
		c1.disp();
		ConstructorDemo c2=new ConstructorDemo(1,"aaa");
		c2.disp();
		ConstructorDemo cc2=new ConstructorDemo(new Integer(101),"aaa");
		cc2.disp();
		ConstructorDemo cc3=new ConstructorDemo((Number)new Integer(201),"aaa");
		cc3.disp();
		ConstructorDemo c3=new ConstructorDemo(1,2,"aaa","bbb");
		c3.disp();
		ConstructorDemo c4=new ConstructorDemo(c3);
		c4.disp();
	}

}
