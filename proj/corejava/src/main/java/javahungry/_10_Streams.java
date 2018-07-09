package javahungry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
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
	}

}
