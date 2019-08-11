package com.java.rk.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.base.Functions;

class Student
{
    private int  id;
    private String name;
    private Double sal;
    
    public Student(int id, String name, Double sal)
    {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Double getSal()
    {
        return sal;
    }
    public void setSal(Double sal)
    {
        this.sal = sal;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sal == null) ? 0 : sal.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (id != other.id) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (sal == null)
        {
            if (other.sal != null) return false;
        }
        else if (!sal.equals(other.sal)) return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
    
    
}
public class CollectGroupBy
{

    public static void main(String[] args)
    {
        //Group By
        List<String> list = Arrays.asList("Ravi", "Kiran", "Goru", "Ravi", "Ravi", "Kiran", "papaya");
        HashMap<String, Long> hm = (HashMap<String, Long>) list.stream().collect(Collectors.groupingBy(Functions.identity(), Collectors.counting()));
        // HashMap<String,Long> hm= (HashMap<String, Long>) list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(hm);

        
        //Sort
        LinkedHashMap<String, Long> lhm=new LinkedHashMap<>();
        hm.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()).forEachOrdered(x->lhm.put(x.getKey(), x.getValue()));
        System.out.println(lhm);
        lhm.clear();
        hm.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(x->lhm.put(x.getKey(),x.getValue()));
        System.out.println(lhm);
        
     
        
        List<Student> stuList=Arrays.asList(
                new Student(1, "Ravi", 50000d),
                new Student(2, "Kiran", 55000d),
                new Student(3, "Ram", 50030d),
                new Student(4, "Ravi", 60000d),
                new Student(5, "Kiran", 50000d)
                );
        
        //Group by Name and count
        Map<String,Long> studentCount = stuList.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(studentCount);
        
        //Group by Name and Sum
        Map<String,Double> studentSum=stuList.stream().collect(Collectors.groupingBy(Student::getName, Collectors.summingDouble(Student::getSal)));
        System.out.println(studentSum);
        
        
        
        //Group by id Name and map to List
        Map<String,List<Student>> studentMap=stuList.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(studentMap);
        
        
                
    }

}
