package javatpoint.arithmetic;

/**
 * @author zgorrav
 *
 */
public class ArithmeticUtils {
	public static void negationTildOperations() {
		int g = 10;
		int h = -10;
		System.out.println(~g);// -11 (minus of total positive value which starts from 0)
		System.out.println(~h);// 9 (positive of total minus, positive starts from 0)

		boolean flag = true;
		System.out.println(!flag);
	}

	public static void doUnaryOperations() {
		int e = 10;
		int f = 10;
		System.out.println(e++ + ++f);// 10 + 11
		System.out.println(e-- + --f);// 11 + 10
		System.out.println(--e + f--);// 9 + 10
	}

	public static void preIncDecOperations() {
		int c = 10;
		System.out.println(++c);// 11
		int d = 10;
		System.out.println(--d);// 9
	}

	public static void postIncDecOperations() {
		int a = 10;
		System.out.println(a++);// 10
		int b = 10;
		System.out.println(b--);// 10
	}

	public static void doArithmeticOptns() {
		int a = 24;
		int b = 7;
		System.out.println(a + b);// 31
		System.out.println(a - b);// 17
		System.out.println(a * b);// 168
		System.out.println(a / b);// 3
		System.out.println(a % b);// 3

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // BODMAS
	}

	public static void doLeftShift() {
		int a = 20;
		System.out.println(a << 2);// 20*2^2)=20*4=80
		int b = 3;
		System.out.println(b << 4);// 3*2^4=3*16=48

		int c = -20;
		System.out.println(c << 2);
	}

	public static void doRightShift() {
		int a = 10;
		int b = 20;
		int c = 20;
		System.out.println(a >> 2);// 10/(2^2)=10/4=2
		System.out.println(b >> 2);// 20/(2^2)=20/4=5
		System.out.println(c >> 3);// 20/(2^3)=20/8=2
	}

	public static void doUnsignedRightShift() {
		int b = 20;
		// For positive number, >> and >>> works same
		System.out.println(b >>> 2); // 20/(2^2)=20/4=5

		// For nagative number, >>> changes parity bit (MSB) to 0
		int d = -20;
		System.out.println(d >> 2);
		System.out.println(d >>> 2);
	}

	public static void doLogical_BitwiseAND() {
		System.out.println("Logical AND-&&      Bitwise AND-&");
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked
	}

	public static void doLogical_BitwiseOR() {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		// || vs |
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked
	}
	
	public static void findMinTernaryOperation(int a, int b)
	{
		int min=(a>b)?b:a;
		if(a==b)
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("min ="+min);
		}
	}
	public static void doAssignmentOptns()
	{
		int a=10;
		a+=2;
		System.out.println(a);
		a-=2;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		a%=2;
		System.out.println(a);
		
		short b=5;
		b+=2;
		System.out.println(b);
		b-=2;
		System.out.println(b);
		b*=2;
		System.out.println(b);
		b/=2;
		System.out.println(b);
		b%=2;
		System.out.println(b);
		
		short c=10,d=5;
		c+=d;
		System.out.println(c);
		
//		c=c+d;//CT Error:Type mismatch: cannot convert from int to short
		c=(short)(c+d);
		System.out.println(c);
	}
}
