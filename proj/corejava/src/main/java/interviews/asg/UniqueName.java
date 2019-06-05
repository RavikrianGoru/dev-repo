package interviews.asg;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueName {
	public static String firstUniqueName(String[] names) {
		LinkedHashMap<String, Integer> maps= new LinkedHashMap<>();
		for(String each :names)
		{
			maps.put(each, maps.containsKey(each)?(maps.get(each)+1):(1));
		}
		for (String each :maps.keySet())
		{
			if(maps.get(each)==1)
			{
				return each;
			}
		}
		return null;
	}

	public static String firstUniqueName1(String[] names) {
		Map<String, Long> stringCountMap = Arrays.stream(names).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		for (String s : names) {
			if (stringCountMap.get(s) == 1) {
				return s;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(firstUniqueName1(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
	}
}