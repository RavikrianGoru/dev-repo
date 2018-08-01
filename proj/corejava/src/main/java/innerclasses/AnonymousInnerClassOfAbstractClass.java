package innerclasses;

abstract class AbsClass
{
	abstract void method();
	abstract void method1();
}
public class AnonymousInnerClassOfAbstractClass {

	
	public static void main(String[] args) {
		AbsClass obj=new AbsClass(){
			void method(){
				System.out.println("Implementation of abstract method().");
			}
			void method1(){
				System.out.println("Implementation of abstract method1().");
			}
			void method2(){
				System.out.println("Implementation of abstract method1().");
			}
		};
		System.out.println("AnonymousInnerClassOfAbstractClass name : "+obj.getClass().getName());
		obj.method();
		obj.method1();
	}

}
