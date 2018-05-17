package interview;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListNullCheck {

	 public static void main(String[] args) {
	        List al=new ArrayList();
	        System.out.println(al);
	        
	        if(al!=null)
	            System.out.println("not null");
	        else if(al==null)
	            System.out.println("null");
	        else
	            System.out.println("dont know");

	    }
}
