package java8features.functionalinterface;

@FunctionalInterface
interface CustomConvertInterface<F, T>
{
	default Integer convertStringToInteger(String StringData)
	{
		return new Integer(StringData);
	}

	T convert(F from);
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
 
    
}


public class LambdaExpForCustomInterface {

	public static void main(String[] args) {
		

		CustomConvertInterface<String, Integer> converterObj1= (data) -> Integer.valueOf(data);
		System.out.println(converterObj1.convert("1234"));
		
		CustomConvertInterface<String, Integer> converterObj2=Integer::valueOf;
		System.out.println(converterObj2.convert("5555"));
		
		Something something=new Something();
		CustomConvertInterface<String, String> converterObj3=something::startsWith;
		System.out.println(converterObj3.convert("1234"));
	}

}
