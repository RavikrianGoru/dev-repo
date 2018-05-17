package javahungry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/*
Set/HashSet implementation or how set ensures uniqueness?

1) Set/HashSet does not allow duplicate elements. and one null element.
2) when we try to add duplicate element in HashSet/Set it returns false and doest not add duplicate element.
The reason is when we create Set/HashSet it internally creates HashMap. HashMap does not allow duplicate key element.
when we try to add duplicate element in HashSet/Set. it passes that element as key to HashMap.

   public boolean add(E e) 
   {
        return map.put(e, PRESENT)==null;// PRESENT is dummy object{new Object()]
   }

The main point to notice in above code is that put (key,value) will return
1.  null , if key is unique and added to the map
2.  Old Value of the key , if key is duplicate



*/
public class _4_HahSetDemo {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		System.out.println(hs.add(10));
		System.out.println(hs.add(20));
		System.out.println(hs.add(10));
		System.out.println(hs);
		
		
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println(hm);
		System.out.println(hm.size());

		System.out.println(hm.get(1));

		/*
		 * 
		 * ----getNode(hash(1), 1)------> Node<K,V>---- like Map.entry
		 * if(obj==null?null:obj.val)
		 * 
		 * 
		 * 
		 */

		HashSet hs1 = new HashSet();
		System.out.println(hs1);
		System.out.println(hs1.size());

		// How Set achieve Uniqueness
		/*
		 * 
		 * when we create HashSet---- internally it creates HashMap.
		 * 
		 * add(obj)----> (map.put(obj, DefaultObj)==null)---- return null/old
		 * value > putVal(hash(key), key, value, boolean, boolean)----- returns
		 * null/old value
		 */

		Collections.synchronizedMap(new HashMap());
		Collections.synchronizedList(new ArrayList<>());
		Collections.synchronizedSet(new HashSet<>());

		CopyOnWriteArrayList<String> cowaL = null;
		CopyOnWriteArraySet<String> cowaS = null;

	}

}
