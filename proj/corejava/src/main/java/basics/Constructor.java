package basics;
public class Constructor {

	int a;
	int b;
	String str1,str2;

	public Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Constructor(int a, String str1)
	{
		System.out.println("int,String");
		this.a=a;
		this.str1=str1;
	}
	public Constructor(Integer a, String str1)
	{
		System.out.println("Integer,String");
		this.a=a;
		this.str1=str1;
	}
	public Constructor(Number a, String str1)
	{
		System.out.println("Number,String");
		this.a=(Integer)a;
		this.str1=str1;
	}

	public Constructor(int a, int b, String str1, String str2)
	{
		this.a=a;
		this.str1=str1;
		this.b=b;
		this.str2=str2;
	}
	
	public Constructor(Constructor c)
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
		Constructor c1=new Constructor();
		c1.disp();
		Constructor c2=new Constructor(1,"aaa");
		c2.disp();
		Constructor cc2=new Constructor(new Integer(101),"aaa");
		cc2.disp();
		Constructor cc3=new Constructor((Number)new Integer(201),"aaa");
		cc3.disp();
		Constructor c3=new Constructor(1,2,"aaa","bbb");
		c3.disp();
		Constructor c4=new Constructor(c3);
		c4.disp();
	}

}
