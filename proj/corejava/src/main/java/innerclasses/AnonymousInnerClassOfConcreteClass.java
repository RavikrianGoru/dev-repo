package innerclasses;

class ConcreteClass
{
	void method1()
	{
		System.out.println("mthod1() from ConcreteClass.");
	}
}
public class AnonymousInnerClassOfConcreteClass {

	public static void main(String[] args) {
		ConcreteClass obj=new ConcreteClass(){
			void method1()
			{
				System.out.println("mthod1() from AnonymousInnerClass.");
			}
			void method2()
			{
				System.out.println("mthod1() from AnonymousInnerClass.");
			}
		};
		
		System.out.println("AnonymousInnerClassOfConcreteClass name : "+obj.getClass().getName());
		obj.method1();
//		obj.method2(); //C.T Error
		
		
	}

}
