package interview;

class Student
{
	
}
class Customer
{
	
}
public class CreateAnObjByGivingClassNameAsCmdArg {

	public static void main(String[] args) throws Exception{

		Object obj=Class.forName(args[0]).newInstance();
		System.out.println(obj.getClass().getName());
	}

}
