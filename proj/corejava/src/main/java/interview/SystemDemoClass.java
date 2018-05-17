package interview;

import java.util.Iterator;
import java.util.Set;

public class SystemDemoClass {

	public static void main(String[] args) {
		System.out.println("System.currentTypeMillis() :"+System.currentTimeMillis());	// getting current time in millisecs
		
		Set<String> allEnvKeySet=System.getenv().keySet();
		Iterator itr=allEnvKeySet.iterator();
		int count =0;
		while(itr.hasNext())
		{
			count++;
			Object key=itr.next();
			System.out.println("Key "+key+" Value:"+System.getenv().get(key));
		}
		System.out.println("Total number of environment variables: "+count);

	}

}
