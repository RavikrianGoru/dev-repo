package se7.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class ConcurrentDemo {

	public static void main(String[] args) {

		List<String> synAList=Collections.synchronizedList(new ArrayList<String>());
		synAList.add("ravi");
		synAList.add("kiran");
		synAList.add("goru");
		System.out.println(synAList);
		
		List<String> synLList=Collections.synchronizedList(new LinkedList<String>());
		synLList.add("ravi");
		synLList.add("kiran");
		synLList.add("goru");
		System.out.println(synLList);
		
		Map<Integer,String> map=Collections.synchronizedMap(new HashMap<Integer,String>());
		map.put(1, "ravi");
		map.put(2,"kiran");
		map.put(3,"goru");
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.put(1, "ravi"));
		
	LinkedBlockingDeque<String> lbq=new LinkedBlockingDeque<String>();
	lbq.add("ravi");
	lbq.add("kiran");
	lbq.add("goru");
	System.out.println(lbq);

	CopyOnWriteArrayList<String> cAL=new CopyOnWriteArrayList<String>();
	cAL.add("ravi");
	cAL.add("kiran");
	System.out.println(cAL);
	}

}
