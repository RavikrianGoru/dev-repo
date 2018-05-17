package d_and_b;

import java.util.HashMap;
import java.util.Map;

public class _4_Map_methods {

	public void m1()
	{
		Map<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "Apple");
		hm.put(2, "Ant");
		hm.put(3, "Orange");
		hm.put(4, "Ball");
		System.out.println(hm);
		update(hm);
		System.out.println(hm);
	}
	public void update(Map<Integer,String> newHm)
	{
		Map<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1, "Apple1");
		hm.put(2, "Ant");
		hm.put(3, "Orange1");
		hm.put(4, "Ball");
		newHm=hm;
	}
	
	
	public static void main(String[] args) {
		_4_Map_methods obj=new _4_Map_methods();
		obj.m1();
		

	}

}
