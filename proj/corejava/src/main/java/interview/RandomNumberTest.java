package interview;

import java.util.Iterator;
import java.util.Random;

public class RandomNumberTest {
	public static void main(String[] args) 
	{
		
		Random ranObj=new Random();
		for(int i=1;i<=10;++i)
		{
		System.out.println("---------it will print duplicate------------");
		
		System.out.println("int(100):"+ranObj.nextInt(100));
		
		System.out.println("boolean:"+ranObj.nextBoolean());
		System.out.println("double:"+ranObj.nextDouble());
		System.out.println("float:"+ranObj.nextFloat());
		System.out.println("gaussian:"+ranObj.nextGaussian());
		System.out.println("int:"+ranObj.nextInt());
		System.out.println("long:"+ranObj.nextLong());
		
		}
	}

}
