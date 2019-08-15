package bnp;

public class ConstructorException
{

    public ConstructorException() throws Exception
    {
        // throw new RuntimeException("RT:UnChecked");// No issues
        throw new Exception("E:Checked");
        // 1) Need to habdle here by try and catch
        // 2) or declare throws in method signature and caller of this method must handle Checked Exception/throws should be declared in caller method
        // signature..
    }

    public ConstructorException(String name)
    {
        throw new RuntimeException("RT:UnChecked");// No issues
        // throw new Exception("E:Checked");
    }

    public void getDetails()
    {
        throw new RuntimeException("RT:UnChecked");// No issues
        // throw new Exception("E:Checked");
    }

    public static void main(String[] args) throws Exception
    {
        ConstructorException obj = new ConstructorException();
        ConstructorException obj1 = new ConstructorException("abc");

        System.out.println(obj);
        System.out.println(obj1);
        obj.getDetails();
        obj1.getDetails();

    }
}
