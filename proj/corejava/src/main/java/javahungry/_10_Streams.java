package javahungry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import javax.swing.GroupLayout.ParallelGroup;
/*
	http://www.journaldev.com/2774/java-8-stream
*/
public class _10_Streams {

	public static void main(String[] args) {

		Stream s1=Stream.of(1,2,3,4,5);
		s1=Stream.of(new int[]{1,2,3,4,5});
		s1=Stream.of(new Integer[]{1,2,3,4,5});
		
		ArrayList al=(ArrayList) s1.filter((a)->{return true;}).collect(Collectors.toList());
        System.out.println("RK@ "+al);
        
        
		LongStream ls=Arrays.stream(new long[]{1,2,3,4,5});
		ls.forEach((p)->System.out.println(p));
		
		IntStream is="ravikirangoru".chars();
		System.out.println(is.min());
		
		ArrayList alP=new ArrayList();
        alP.add(1);
        alP.add(2);
        alP.add(3);
        alP.add(4);
        alP.add(5);
        alP.add(6);
        alP.add(7);
        alP.add(8);
        alP.add(9);
        alP.add(10);
		System.out.println(alP);
		alP.parallelStream().forEach(System.out::println);
	}

}
