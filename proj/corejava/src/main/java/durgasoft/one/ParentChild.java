package durgasoft.one;

class A {

}

class B extends A {

}
class ParentChild {

	public static void main(String[] args) {
		A obj1 = new A();
		  obj1 = new B();
		  
		//B obj2 = new A();//CE type conversion required
		//B obj2 =(B) new A(); //Exception in thread "main" java.lang.ClassCastException: durgasoft.A cannot be cast to durgasoft.B
		  
		  B  obj3=new B();
		  if (obj3 instanceof A)
		  {
			  obj3 = (B) obj1;
			  	//(B) new A(); Exception in thread "main" java.lang.ClassCastException: 
			  System.out.println("Hi");
		  }
	}

}
