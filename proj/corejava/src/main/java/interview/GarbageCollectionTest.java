package interview;

import java.util.Set;

public class GarbageCollectionTest {

	public static void main(String[] args) 
	{
		Runtime rt=Runtime.getRuntime();
		
		
		System.out.println("Before calling gc():------------------------------------------");
		System.out.println("Free memory from Runtime by calling freeMemory():"+rt.freeMemory());
		System.out.println("Max memory from Runtime by calling maxMemory():"+rt.maxMemory());
		System.out.println("Total memory from Runtime by calling totalMemory():"+rt.totalMemory());
		System.out.println(rt.availableProcessors());
		
		
		rt.gc();
		//or
		System.gc();
		
		System.out.println("After calling gc():------------------------------------------");
		System.out.println("Free memory from Runtime by calling freeMemory():"+rt.freeMemory());
		System.out.println("Max memory from Runtime by calling maxMemory():"+rt.maxMemory());
		System.out.println("Total memory from Runtime by calling totalMemory():"+rt.totalMemory());
		System.out.println(rt.availableProcessors());
		
		
	}

}
