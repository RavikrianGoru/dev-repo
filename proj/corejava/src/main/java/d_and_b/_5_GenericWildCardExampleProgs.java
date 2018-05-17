package d_and_b;

import java.util.ArrayList;
import java.util.List;

class A
{
	String name="A";

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
}
class B extends A
{
	String name="B";
	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
}
class C extends A
{
	String name="C";
	@Override
	public String toString() {
		return "C [name=" + name + "]";
	}
}
class D extends C
{
	String name="D";
	@Override
	public String toString() {
		return "D [name=" + name + "]";
	}
}

public class _5_GenericWildCardExampleProgs {
	public static <T extends A> T getFirstElement1(List<T> list)
	{  	
		T objT=null;
		if(!list.isEmpty())
		{
			objT= list.get(1);
		}
		return objT;
	}
	public static <T extends A> int getCount1(List<T> list)
	{  	
		int count=0;
		if(!list.isEmpty())
		{
			count= list.size();
		}
		return count;
	}
	public static  int getCount2(List<? extends A> list)
	{  	
		int count=0;
		if(!list.isEmpty())
		{
			count= list.size();
		}
		return count;
	}
	public static void main(String args[])
	{
		
		List<A> listA=new ArrayList<>();
		listA.add(new A());
		listA.add(new B());
		listA.add(new C());
		listA.add(new D());
		System.out.println("listA is super class for all B,C,D---> so it can hold all A,B,C,D instances.");
		System.out.println(listA);


		List<B> listB=new ArrayList<>();
		listB.add(new B());
		System.out.println("\nlistB is not  super class for any other classes---> so it can hold only B's instances.");
		System.out.println(listB);
		
		List<C> listC=new ArrayList<C>();
		listC.add(new C());
		listC.add(new D());
		System.out.println("\nlistC is  super class for D classes---> so it can hold only B's and D's instances.");
		System.out.println(listC);

		
		List<D> listD=new ArrayList<D>();
		listD.add(new D());
		System.out.println("\nlistD is not  super class for any other classes---> so it can hold only D's instances.");
		System.out.println(listD);
		
		
		//listA=listB; Compile Time Error
		//listB=listA; Compile Time Error
		System.out.println("\nlistA=listB is not possible because-------------\n1. listA holds A,B,C,D instances but listB holds only B's instsnaces\n2. if we could make this, listB can hold all instances of A,B,C,D via reference of listA");
		System.out.println("\nlistB=listA is not possible because-------------\n1. listB holds only instances of B but listA holds instances A,B,C,D\n2. if we could make this, listB can hold all instances of A,B,C,D ");
		System.out.println("\n\n\n");		
		
		
		ArrayList listObjects=new ArrayList();
		listObjects.add(new Integer(20));
		listObjects.add(new String("Ravi"));
		
		ArrayList<String> listStrings=new ArrayList<>();
		listStrings.add("Hi");
		listStrings.add("Hellow");

		
		List<?> unknownList;
		System.out.println("List<?> unknownList= any type of list:-----------------");
		unknownList=listObjects;
		System.out.println("List<?> unknownList=List<Object> listObjects----------"+unknownList);
		unknownList=listStrings;
		System.out.println("List<?> unknownList=List<String> listStrings----------"+unknownList);
		unknownList=listA;
		System.out.println("List<?> unknownList=List<A> listA----------------"+unknownList);
		unknownList=listB;
		System.out.println("List<?> unknownList=List<B> listB----------------"+unknownList);
		unknownList=listC;
		System.out.println("List<?> unknownList=List<C> listC----------------"+unknownList);
		unknownList=listD;
		System.out.println("List<?> unknownList=List<D> listD----------------"+unknownList);		
		System.out.println("\n\n\n");	
		
		List<? extends A> unknownExtendsListA;
		System.out.println("List<? extends A> unknownExtendsListA= type of A and sub type of A and Type of Object:-----------------");
		unknownExtendsListA=listObjects;
		System.out.println("List<? extends A> unknownExtendsListA=List<Object> listObjects----------"+unknownExtendsListA);
//		unknownExtendsListA=listStrings;
//		System.out.println("List<? extends A> unknownExtendsListA=List<String> listStrings----------"+unknownExtendsListA);
		unknownExtendsListA=listA;
		System.out.println("List<? extends A> unknownExtendsListA=List<A> listA----------------"+unknownExtendsListA);
		unknownExtendsListA=listB;
		System.out.println("List<? extends A> unknownExtendsListA=List<B> listB----------------"+unknownExtendsListA);
		unknownExtendsListA=listC;
		System.out.println("List<? extends A> unknownExtendsListA=List<C> listC----------------"+unknownExtendsListA);
		unknownExtendsListA=listD;
		System.out.println("List<? extends A> unknownExtendsListA=List<D> listD----------------"+unknownExtendsListA);		
		System.out.println("\n\n\n");	

		
		List<? extends B> unknownExtendsListB;
		System.out.println("List<? extends B> unknownExtendsListB= type of B and sub type of B and Type of Object:-----------------");
		unknownExtendsListB=listObjects;
		System.out.println("List<? extends B> unknownExtendsListB=List<Object> listObjects----------"+unknownExtendsListB);
		unknownExtendsListB=listB;
		System.out.println("List<? extends B> unknownExtendsListB=List<B> listB----------------"+unknownExtendsListB);
		System.out.println("\n\n\n");	
		
		

		List<? super D> unknownSuperD;
		unknownSuperD=listD;
		System.out.println("List<? super D> unknownSuperD=List<D> listD----------"+unknownSuperD);
		unknownSuperD=listC;
		System.out.println("List<? super D> unknownSuperD=List<C> listC----------"+unknownSuperD);
		unknownSuperD=listA;
		System.out.println("List<? super D> unknownSuperD=List<A> listA----------"+unknownSuperD);
		unknownSuperD=listObjects;
		System.out.println("List<? super D> unknownSuperD=List<Object> listObject----------"+unknownSuperD);
		System.out.println("\n\n\n");	
		
		
		List<? super C> unknownSuperC;
		unknownSuperC=listC;
		System.out.println("List<? super C> unknownSuperC=List<C> listC----------"+unknownSuperC);
		unknownSuperC=listA;
		System.out.println("List<? super C> unknownSuperC=List<A> listA----------"+unknownSuperC);
		unknownSuperC=listObjects;
		System.out.println("List<? super C> unknownSuperC=List<Object> listObject----------"+unknownSuperC);
		

		List<Integer> iList=new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(new Integer(3));
		iList.add(new Integer('a'));
		System.out.println("iList:"+iList);
//		printList(iList) //Compile time error
		printList1(iList);
	}
	public static void printList(List<Object> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}
	public static void printList1(List<?> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}

}
