import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class FindOutputOrErrorLine {

/*	public static void m1()// C.T Error
	{
		
	}
	public int m1()// C.T Error
	{
		return 1;
	}
*/	
	public static void main(String[] args) 
	{
		//1.
		StringBuilder data=new StringBuilder("buffering");
		data.replace(2, 7, "BUFFER");
		System.out.println("buffering-----replace(2, 7, \"BUFFER\")---- "+ data);//-----------------------?
		data.delete(2, 4);
		System.out.println("buBUFFERng----delete(2, 4)-----"+data);//-----------------------?
		String s=data.substring(1,5);
		System.out.println(s);//-----------------------?

		
		//2.
		List arrayList=new ArrayList();
		arrayList.add("Ravi");
		arrayList.add(1);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		System.out.println("ArrayList---------"+arrayList);
		
		List LinkedList=new LinkedList();
		LinkedList.add("Ravi");
		LinkedList.add(1);
		LinkedList.add(null);
		LinkedList.add(null);
		LinkedList.add(null);
		System.out.println("LinkedList---------"+LinkedList);
		System.out.println("List---Array and Linked list allows many nulls duplicates");
		
		//3.
		HashSet hashSet=new HashSet();
		hashSet.add("Ravi");
		hashSet.add("Ravi");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println("HashSet-------"+hashSet);
		System.out.println("HashSet----Allows one null, if many--overrides");
		
		TreeSet treeSet=new TreeSet();
		treeSet.add("Ravi");
		treeSet.add("Ravi");
		//treeSet.add(null);------------------------RunTime Error
		//treeSet.add(null);
		System.out.println("TreeSet------"+treeSet);
		System.out.println("TreeSet----does not allow  null---- Runtime Exception");		
		
		//4.
		
		Hashtable hashtable =new Hashtable();
		hashtable.put(1, "");
		hashtable.put(1, "");
//		hashtable.put(2, null);-------------------Runtime Exception
//		hashtable.put(null, null);----------------Runtime Exception
		System.out.println("Hashtable----------"+hashtable);
		System.out.println("Hashtable-----does not allow null for key-----or---- null for value");
		
		HashMap hashMap=new HashMap();
		hashMap.put(null, null);
		hashMap.put("1", null);
		hashMap.put(null, "ravi");
		System.out.println("HashMap----"+hashMap);
		System.out.println("HashMap---- hash map allows single null(key) and many null(values), if we give more null(keys) it overrides");
		

	}

}
