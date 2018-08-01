package innerclasses;

public class LocalInnerClass {

	public int pubInt=10;
	private int priInt=20;
	protected int protInt=30;
		int defInt=40;
	public void methodPub()
	{
		System.out.println("methodPub()..............");
		class LocalPubClass{
			int a=100;
			private int b=200;
			protected int c=300;
			public int d=400;

			void mDef()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			private void mPri()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			protected void mProt()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			public void mPub()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
		}
		LocalPubClass obj=new LocalPubClass();
		obj.mDef();
		obj.mPri();
		obj.mProt();
		obj.mPub();
	}
	private void methodPri()
	{
		System.out.println("methodPri().................");
		class LocalPubClass{

			int a=100;
			private int b=200;
			protected int c=300;
			public int d=400;
			
			void mDef()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			private void mPri()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			protected void mProt()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			public void mPub()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
		}
		LocalPubClass obj=new LocalPubClass();
		obj.mDef();
		obj.mPri();
		obj.mProt();
		obj.mPub();
	}
	protected void methodProt()
	{
		System.out.println("methodProt().............");
		class LocalPubClass{
			int a=100;
			private int b=200;
			protected int c=300;
			public int d=400;

			void mDef()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			private void mPri()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			protected void mProt()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			public void mPub()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
		}
		LocalPubClass obj=new LocalPubClass();
		obj.mDef();
		obj.mPri();
		obj.mProt();
		obj.mPub();
	}
	void methodDef()
	{
		System.out.println("methodDef()................");
		class LocalPubClass{
			int a=100;
			private int b=200;
			protected int c=300;
			public int d=400;
			
			void mDef()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			private void mPri()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			protected void mProt()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
			public void mPub()
			{
				System.out.println(pubInt+" "+priInt+" "+protInt+" "+defInt);
				System.out.println(a+" "+b+" "+c+" "+d);
			}
		}
		LocalPubClass obj=new LocalPubClass();
		obj.mDef();
		obj.mPri();
		obj.mProt();
		obj.mPub();
	}
	
	public static void main(String[] args) {
		
		System.out.println("any class defined inside a method is called local inner class");
		LocalInnerClass obj=new LocalInnerClass();
		obj.methodDef();
		obj.methodPri();
		obj.methodProt();
		obj.methodPub();
	}

}
