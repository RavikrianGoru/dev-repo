package com.jenkov.annatations;

/*
 * Annataion is metadata. this tells to compiler, build tools(maven or Ant) or JVM. 
 * 
 * 
 * 
 */

@interface Employee
{
	int empNo();
	String name() default "RK Groups";
	String address() default "Chennai";
	String[] qualification() ;
}


@Employee(
		empNo=123,
		qualification={"MCA","Degree"}
)


public class CustomAnnatationsDemo {

	public static void main(String[] args) {
		System.out.println("HI");
	}

}
