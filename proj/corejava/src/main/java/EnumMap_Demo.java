import java.util.EnumMap;

public class EnumMap_Demo {

	public enum Days
	{
		Mon,Tue,Wed,Thu,Fri,Sut,Sun;
	}

	public static void main(String[] args) {
		EnumMap<Days,Integer> emap = new EnumMap<Days, Integer>(Days.class);
		System.out.println(emap);
		emap.put(Days.Mon,1);
		emap.put(Days.Tue,2);
		emap.put(Days.Wed,3);
		emap.put(Days.Thu,4);
		emap.put(Days.Fri,5);
		emap.put(Days.Sut,6);
		emap.put(Days.Sun,0);
		System.out.println(emap);
		
		
	}

}
