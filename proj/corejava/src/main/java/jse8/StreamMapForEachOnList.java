package jse8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamMapForEachOnList {

	public static void main(String[] args) {
		ArrayList<String> listSrc=new ArrayList<String>();
		ArrayList<String> listDest=new ArrayList<String>();
		ArrayList<String> dummyList=new ArrayList<String>();
		
		listSrc.add("ravi");
		listSrc.add("devi");
		listSrc.add("chinna");
		listSrc.add("surya");
		listSrc.add("laskhmi");
		
		listSrc.stream().map((s)->s.toUpperCase()).collect(Collectors.toCollection(()->listDest));
		
		listDest.stream().map((s)->s.toLowerCase()).collect(Collectors.toCollection(()->dummyList));
		System.out.println(listDest);
		System.out.println(dummyList);
	}

}
