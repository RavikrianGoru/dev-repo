package string;

public class CompareTwoStrings {

	public static void main(String[] args) {

		//pool
		String one="ravi";
		String two="ravi";
		
		System.out.println("one=\"ravi\" :"+one+" :"+one.hashCode());
		System.out.println("two=\"ravi\" :"+two+" :"+two.hashCode());
		
		System.out.println("one.compareTo(two):"+one.compareTo(two));
		
		if(one==two)
			System.out.println("one==two");
		else
			System.out.println("one!=two");
		
		
		if(one.equals(two))
			System.out.println("one.equals(two)");
		
		System.out.println("------------------------");
		String One=new String("ravi");
		String Two=new String("ravi");

		System.out.println("One=new String(\"ravi\") :"+One+"  :"+One.hashCode());
		System.out.println("Two=new String(\"ravi\") :"+Two+"  :"+Two.hashCode());
		
		System.out.println("One.compareTo(Two):"+One.compareTo(Two));
		
		if(One==Two)
			System.out.println("One==Two");
		else
			System.out.println("One!=Two");
		
		if(One.equals(Two))
			System.out.println("One.equals(Two)");
		
		
		System.out.println("-----------------------------------");
		if(one==One)
			System.out.println("one==One");
		else
			System.out.println("one!=One");
		
		
		//intern() method.
		String str1=new String("Goru");
		String str2="Goru";
		
		System.out.println("str1: with new Operator:"+str1);
		System.out.println("str2: with literal:"+str2);
		if(str1==str2)
		{
			System.out.println("st1==str2");
		}else
		{
			System.out.println("str1!=str2");
		}
		
		
		System.out.println("After intern() on str1=str1.intern(): ");
		str1=str1.intern();// we must assign the output of intern()

		if(str1==str2)
		{
			System.out.println("st1==str2");
		}else
		{
			System.out.println("str1!=str2");
		}
		
	
	}

}
