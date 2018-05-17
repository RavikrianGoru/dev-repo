import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Tom {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<>();
		s.add("A");
		System.out.println(String.join(",", s));
		
		Stack<Integer> stk=new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		System.out.println(stk);
		stk.forEach((s1)->{System.out.println(s1);});
		System.out.println("-------------");
		for(int i=0;i<=stk.size();++i)
		System.out.println(stk.pop());
		
		
	}

}
