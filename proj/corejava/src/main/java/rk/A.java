package rk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.concurrent.ConcurrentHashMap;

class A {

	public static void main(String[] args) {
		System.out.println("A");
		HashMap hm=new HashMap();
		System.out.println(hm.put(1, "ravi"));
		System.out.println(hm.put(1, "ravi"));
		System.out.println(hm);
		HashSet hs=new HashSet<>();
		System.out.println(hs.add("ravi"));
		System.out.println(hs.add("ravi"));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
				System.out.println(hs);
				ArrayList<String> l=new ArrayList<>();
				l.add("ravi");
				l.get(0);
		ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<>();
		chm.put("A1", "A1");
		chm.put("A2", "A2");
		chm.put("A3", "A3");
		System.out.println(chm);
		
		IdentityHashMap<Integer,String> ihm=new IdentityHashMap<>();
		System.out.println(ihm.put(1, "ravi"));
		System.out.println(ihm.put(1, "ravi"));
		System.out.println(ihm);
		
	}

}

class B {

	public static void main(String[] args) {
		System.out.println("B");
	}

}
