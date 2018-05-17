package new28thOct;

import java.util.Stack;

public class RefersePolishNotation {

	
	public static void doRPN(String [] notation)
	{
		Stack<Integer> s=new Stack<Integer>();
		String Operators="+-*%/";
		for(int i=0; i<notation.length;++i)
		{
			if(!(Operators.contains(notation[i])))
			{
				s.push(new Integer(notation[i]));
			}
			else{
				int b=s.pop();
				int a=s.pop();
				switch (notation[i]) {
				case "+":
					s.push(a+b);
					break;
				case "-":
					s.push(a-b);
					break;
				case "*":
					s.push(a*b);
					break;
				case "/":
					s.push(a/b);
					break;
				case "%":
					s.push(a%b);
					break;

				default:
					break;
				}
			}
		}
		System.out.println("Evaluated value:"+s.peek());
		
	}
	
	public static void main(String[] args) {

		String[] notation={"2","5","+","6", "*", "20", "-"};
		doRPN(notation);
	}

}
