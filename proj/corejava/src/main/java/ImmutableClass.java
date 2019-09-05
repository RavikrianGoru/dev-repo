//
//// Employee
// EId Ename ESal MID
// 1 A 100 3
// 2 B 200 3

// 3 C 300 5
// 4 D 400 5
// 5 E 500 -
// OUTPUT:
//
// 3 B 200
// 5 D 400

// (SELECT e1.mid, e1.eNAME, e1.eSAL Employee e1 left join Employee e2 on e2.mid = e1.eid)

// Employee
// String empName;
// Long empId;
// Date dob;
// List<String> languageSpoken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

final class Employee
{
    private final String empName;
    private final Long empId;
    private final Date dob;
    private final List<String> languageSpoken;
    private final HashMap<String, String> copmanies;

    @SuppressWarnings ("unchecked")
    public Employee(String empName, Long empId, Date dob, List<String> languageSpoken, HashMap<String, String> copmanies)
    {
        super();
        this.empName = empName;
        this.empId = empId;
        // Note
        this.dob = (Date) dob.clone();
        this.languageSpoken = new ArrayList<>(languageSpoken);
        this.copmanies = (HashMap<String, String>) copmanies.clone();
    }

    public String getEmpName()
    {
        return empName;
    }

    public Long getEmpId()
    {
        return empId;
    }

    public Date getDob()
    {
        // Note
        return (Date) dob.clone();
    }

    public List<String> getLanguageSpoken()
    {
        // Note
        List<String> tempList = new ArrayList<>(languageSpoken);
        return tempList;
    }

    @SuppressWarnings ("unchecked")
    public HashMap<String, String> getCopmanies()
    {
        // Note
        return (HashMap<String, String>) copmanies.clone();
    }

    @Override
    public String toString()
    {
        return "Employee [empName=" + empName + ", empId=" + empId + ", dob=" + dob + ", languageSpoken=" + languageSpoken + ", copmanies=" + copmanies + "]";
    }

}

public class ImmutableClass
{

    public static void main(String[] args) throws InterruptedException
    {
        // List intList = Arrays.asList(1, 2, 3, 4, 3, 3, 3, 3, 0, 1, 8);
        // HashMap hm = (HashMap) intList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        // System.out.println(hm);

        Date d1 = new Date();
        List<String> l1 = new ArrayList<>(Arrays.asList("A", "B"));
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("One", "A");
        hm1.put("Two", "B");
        Employee e1 = new Employee("ravi", 100L, d1, l1, hm1);
        System.out.println(e1);
        System.out.println(e1.hashCode());

        
        d1.setYear(0);
        l1.add("C");
        hm1.put("Three", "C");
        System.out.println(e1);
        System.out.println(e1.hashCode());
        
        e1.getDob().setTime(20);
        e1.getLanguageSpoken().add("D");
        e1.getCopmanies().put("Four", "D");
        System.out.println(e1);
        System.out.println(e1.hashCode());

    }

}
