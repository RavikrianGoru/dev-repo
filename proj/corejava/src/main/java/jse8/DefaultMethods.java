package jse8;

import java.util.IdentityHashMap;

interface DefaultDemoInterface
{
	public void getName();
	default void interfaceName()
	{
		System.out.println("interfaceName() is default method of DefaultDemoInterface");
	}

	static void staticMethod()
	{
		System.out.println("This is static method in interface");
	}
}

class DefaultDemoInterfaceImplClassOne implements DefaultDemoInterface
{

	@Override
	public void getName() {
		System.out.println("getName() is implemented method of DefaultDemoInterface");
		
	}
	
	@Override
	public void interfaceName()
	{
		System.out.println("interfaceName() is default method of DefaultDemoInterfaceImplClassOne");
	}
	
}
class DefaultDemoInterfaceImplClassTwo implements DefaultDemoInterface
{

	@Override
	public void getName() {
		System.out.println("getName() is implemented method of DefaultDemoInterface"+this.getClass().getName());
		
	}
}



public class DefaultMethods {

	public static void main(String[] args) {
		
		DefaultDemoInterface.staticMethod();
		DefaultDemoInterfaceImplClassOne obj1=new DefaultDemoInterfaceImplClassOne();
		obj1.getName();
		obj1.interfaceName();
		
		DefaultDemoInterfaceImplClassTwo obj2=new DefaultDemoInterfaceImplClassTwo();
		obj2.getName();
		obj2.interfaceName();
		
		IdentityHashMap<Integer, String> ihm=new IdentityHashMap<>();
		ihm.put(1, "ravi");
		ihm.put(2, "kiran");
		ihm.put(2, "kiran1");
		
		ihm.forEach((k,v)->{System.out.println(k+"---"+v);});
		
	}

}
