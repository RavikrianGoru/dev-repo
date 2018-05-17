package javahungry;

/*

NoClassDefFoundError	 					
1) Error									
2) Derived from LinkageError				
3) Irrecoverable:can not be handled by try/catch/finally		
4) situation:A ClassLoader instance tries to load in the definition of a class through string name

Ex:
ClassLoader classLoaderObj=ClassLoader.getSystemClassLoader();
classLoaderObj.loadClass("javahungry.B");

ClassNotFoundException:
1) Exception
2) Derived from ReflectiveOperationException
3) Recoverable:can be handled by try/catch/finally
4) situation: when an application try to load a class through string name
	
Ex:
Class classObj = Class.forName("javahungry.B");



*/

class A extends B {
	

}

class B {
}

public class _1_DiffCNFEandNCDFError {

	public static void main(String[] args) {

		A obj = new A();
		System.out.println(obj);
		// after saving this file beforeing executing it.
		// go to C:\Users\ragoru\workspace\corejava\bin\javahungry and delete
		// B.class file.
		// then it throws ClassNotFoundException
		
			try {
				System.out.println("ClassLoader.getSystemClassLoader().getClass().getName() : "+ClassLoader.getSystemClassLoader().getClass().getName());
				ClassLoader classLoaderObj=ClassLoader.getSystemClassLoader();
				classLoaderObj.loadClass("javahungry.B");

				Class classObj = Class.forName("javahungry.B");
				System.out.println(classObj.getName());
				Object objTypeObj = classObj.newInstance();
				B bTypeObj = (B) objTypeObj;
			} catch (InstantiationException | IllegalAccessException |ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

}
