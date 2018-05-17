package jenkov.generics;
/*
 Java Generic's wildcards is a mechanism in Java Generics aimed at 
 making it possible to cast a collection of a certain class(A) to a collection of a subclass or superclass of A.
 
 	A
  /   \
 B		C
 |
 D

 List<A> listA=new ArrayList<A>();
 List<B> listB=new ArrayList<B>();
 
		//listA=listB;
		//listB=listA; //compile time errors. while pointing / assigning one type Collection to another.
 
 Generics Wildcards are the solution for the above problem.
 Generic wildcards target two primary problems
 i)   Reading from a generic collection
 ii)  Inserting into a generic collection

Types of wild cards:
 1) The Unknown wildcards----------List<?> al=new ArrayList<?>();
 	The Unknown Wildcard
	List<?> means a list typed to an unknown type. This could be a List<A>, a List<B>, a List<String> etc. 
 
 2) The extends Wildcard Boundary
	List<? extends A> means a List of objects that are instances of the class A, or subclasses of A (e.g. B,C and D). 
 3) The super Wildcard Boundary
	List<? super A> means that the list is typed to either the A class, or a superclass of A. 






*/

import java.util.ArrayList;

class A
{
	@Override
	public String toString() {
		return "A []";
	}
}
class B extends A
{
	@Override
	public String toString() {
		return "B []";
	}
}
class C extends A
{
	@Override
	public String toString() {
		return "C []";
	}
}
class D extends B
{
	@Override
	public String toString() {
		return "D []";
	}
}

public class _3_GenericsWildCardsDemo {

	public static void main(String[] args) {
		System.out.println("specific type of data in list-------------------");
		ArrayList<A> listA=new ArrayList<A>();
		listA.add(new A());
		listA.add(new A());
		System.out.println(listA);
		ArrayList<B> listB=new ArrayList<B>();
		listB.add(new B());
		listB.add(new B());
		System.out.println(listB);
		ArrayList<C> listC=new ArrayList<C>();
		listC.add(new C());
		listC.add(new C());
		System.out.println(listC);
		ArrayList<D> listD=new ArrayList<D>();
		listD.add(new D());
		listD.add(new D());
		System.out.println(listD);
		ArrayList<String> listString=new ArrayList<String>();
		listString.add(new String("Ravi"));
		listString.add(new String("Kiran"));
		System.out.println(listString);

		//listA=listB;
		//listB=listA; //compile time errors. while pointing / assigning one type Collection to another.
		
		System.out.println("unknown type of data in list--------------ArrayList<?> anyTypeList=new ArrayList<>();----------");
		ArrayList<?> unknownTypeList=new ArrayList<>();
		unknownTypeList=listA;
		System.out.println(unknownTypeList);
		unknownTypeList=listB;
		System.out.println(unknownTypeList);
		unknownTypeList=listC;
		System.out.println(unknownTypeList);
		unknownTypeList=listD;
		System.out.println(unknownTypeList);
		unknownTypeList=listString;
		System.out.println(unknownTypeList);
		
		System.out.println("Extend type of data in list--------------ArrayList<? extends A> anyTypeList=new ArrayList<>();----------");
		ArrayList<? extends A> extendAList=new ArrayList<>();
		extendAList=listA;
		System.out.println(extendAList);
		extendAList=listB;
		System.out.println(extendAList);
		extendAList=listC;
		System.out.println(extendAList);
		extendAList=listD;
		System.out.println(extendAList);
//		extendAList=listString;
//		System.out.println(extendAList); Compile time error- String class doen not extends A or String class is not sub class of A.
		
		System.out.println("Super type of data in list--------------ArrayList<? super C> anyTypeList=new ArrayList<>();----------");
		ArrayList<? super D> superDList=new ArrayList<>();
		superDList=listA;
		System.out.println(superDList);
		superDList=listB;
		System.out.println(superDList);
//		superDList=listC;
//		System.out.println(superDList); Compile time Error- C is not super class of D
		superDList=listD;
		System.out.println(superDList);
//		superDList=listString;
//		System.out.println(superDList);  Compile time Error- String is not super class of D
		
		

	}

}
