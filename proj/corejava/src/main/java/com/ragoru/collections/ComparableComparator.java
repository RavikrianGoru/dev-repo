package com.ragoru.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
	String name;
	int rollNumber;
	int age;
	String company;

	public Student() {
	}

	public Student(String name, int rollNumber, int age, String company) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", company=" + company + "]";
	}

	@Override
	public int compareTo(Student o) {
		// By Name
		//return this.getName().compareTo(o.getName());
		
		// By Company
		return this.getCompany().compareTo(o.getCompany());

		// By Age
		// return this.getAge()-o.getAge();

		// By Rollnumber
		// return this.getRollNumber()-o.getRollNumber();

	}

}


class StudentAgeComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.getAge()-arg1.getAge();
	}
	
}

class StudentNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
	
}

class StudentRollNumberComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.getRollNumber()-arg0.getRollNumber();//did some modifications here:arg0.getRollNumber()-arg1.getRollNumber();
	}
	
}
public class ComparableComparator {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Ravi", 1001, 28, "HCL"));
		studentList.add(new Student("Devi", 1002, 24, "TCS"));
		studentList.add(new Student("Chinna", 1003, 29, "Infosys"));
		studentList.add(new Student("Lakshmi", 1004, 48, "IBM"));
		studentList.add(new Student("Surya", 1005, 58, "TCS"));
		studentList.add(new Student("Ravali", 1006, 18, "HCL"));
		studentList.add(new Student("Manju", 1007, 20, "MGM"));
		studentList.add(new Student("Anitha", 1008, 30, "HCL"));
		studentList.add(new Student("Jhansi", 1009, 29, "VGP"));
		studentList.add(new Student("Durga", 1010, 13, "PayTM"));
		studentList.add(new Student("Meena", 1011, 28, "PayPal"));
		studentList.add(new Student("Shabana", 1012, 18, "Amazan"));
		studentList.add(new Student("ShabanaBegam", 1013, 29, "Flipkart"));

		System.out.println("----------------Before Sort------------------");
		for (Student s : studentList)
			System.out.println(s);

		Collections.sort(studentList);
		System.out.println("----------------After Sort Comparable------------------");
		for (Student s : studentList)
			System.out.println(s);
		
		
		
		System.out.println("----------------After Sort Comparator (age)------------------");
		StudentAgeComparator studenAgeComparator=new StudentAgeComparator();
		Collections.sort(studentList,studenAgeComparator);
		for (Student s : studentList)
			System.out.println(s);
		
		System.out.println("----------------After Sort Comparator (name)------------------");
		StudentNameComparator studenNameComparator=new StudentNameComparator();
		Collections.sort(studentList,studenNameComparator);
		for (Student s : studentList)
			System.out.println(s);
		System.out.println("----------------After Sort Comparator (rollnumber)------------------");
		StudentRollNumberComparator studenRollNumberComparator=new StudentRollNumberComparator();
		Collections.sort(studentList,studenRollNumberComparator);
		for (Student s : studentList)
			System.out.println(s);
		

	}

}
