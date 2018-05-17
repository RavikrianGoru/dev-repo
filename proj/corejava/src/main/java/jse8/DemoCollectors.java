package jse8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DemoCollectors {

	public static void main(String[] args) {

		List<Integer> intList=Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,20,25,30,35,40,45,50);
		System.out.println(intList);	
		System.out.println(intList.stream().collect(Collectors.counting()));
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "ravi");
		hm.put(2, "kiran");
		hm.put(3, "goru");
		
		hm.forEach((k,v)->{System.out.println(k+"-------"+v);});
		
	}

}
