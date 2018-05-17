package com.javapoint.lambdaexpression;

import java.util.Arrays;

/**
 * Created by ragoru on 5/29/2016.
 * Lambda expressions
 */
class Employee
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class FirstLambdaExpSortEmpClass {
    public static void main(String[] args) {
        System.out.println("Hello Java World");

        Employee[] empArray = new Employee[5];
        empArray[0]=new Employee(1,"ravi");
        empArray[1]=new Employee(45,"Raj");
        empArray[2]=new Employee(23,"Chan");
        empArray[3]=new Employee(56,"Devi");
        empArray[4]=new Employee(7,"Devil");

//Arrays.sort(empArray, new Comparator<Employee>() {
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//});

//        Arrays.sort(empArray,(Employee e1,Employee e2)->e1.getName().compareTo(e2.getName()));
        
        Arrays.sort(empArray,( e1, e2)->e1.getName().compareTo(e2.getName()));
        System.out.println(Arrays.toString(empArray));




    }
}
