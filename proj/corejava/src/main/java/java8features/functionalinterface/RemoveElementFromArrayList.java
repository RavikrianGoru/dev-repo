package java8features.functionalinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class RemoveElementFromArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		//Exception:1 
		System.out.println("----------when we try to delete any element in for-each loop on original list-------->ConcurrentModificationException");
		System.out.println(al);
		for(Integer i:al)
		{
			if(i<20)
			{
				//al.remove(i);//RE: ConcurrentModificationException
			}
		}
		System.out.println(al);
		System.out.println("----------when we try to delete any element of original list while for-each loop on temp list---->No Exception");
		System.out.println(al);
		ArrayList<Integer> tempAlist=new ArrayList<>(al);
		for(Integer a:tempAlist)
		{
			if(a==10)
			{
				al.remove(a);
			}
		}
		System.out.println(al);
		
		System.out.println("----------when we try to delete any element by using iterator.remove() on iterator---->No Exception");
		al.add(10);
		System.out.println(al);		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()<20)
			{
				itr.remove();
			}
		}
		System.out.println(al);	
		
		System.out.println("----------when we try to delete any element of CopyOnWriteArrayList in for-each ---->No Exception");
		al.add(10);
		System.out.println(al);
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>(al);
		for(Integer i:cal)
		{
			if(i==10)
				cal.remove(i);
		}
		System.out.println(cal);
		
		System.out.println("----------when we try to delete any element al.forEach(s->{ if(s==10) al.remove(s);});-------->ConcurrentModificationException");
		System.out.println(al);	
		//al.forEach(s->{ if(s==10) al.remove(s);});
		System.out.println(al);	
		
		System.out.println("----------when we try to delete any element List <Integer>aal=al.stream().filter(s->s!=10).collect(Collectors.toList());-----------> No Exception");
		
		System.out.println(al);
		List <Integer>aal=al.stream().filter(s->s!=10).collect(Collectors.toList());
		System.out.println(aal);
		
		
		System.out.println("----------when we try to delete any element al.removeIf(s->{ return s==3;});-----------> No Exception");
		System.out.println(al);
		al.removeIf(s->{ return s==10;});
		System.out.println(al);
	}

}
