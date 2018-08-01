package string;

public class StringStringBufferHashCode {

	public static void main(String[] args) 
	{
		String str1="Ravi";
		System.out.println("String HashCode before:"+str1.hashCode());
		str1+="Kiran";
		System.out.println("String HashCode after:"+str1.hashCode());
	
		StringBuffer sb1=new StringBuffer("Ravi");
		System.out.println("StringBuffer HashCode before:"+sb1.hashCode());
		sb1.append("Kiran");
		System.out.println("StringBuffer HashCode  after:"+sb1.hashCode());
	}

}
