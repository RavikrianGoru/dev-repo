package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Country {
	private String name;
	private int gmCount;
	private int smCount;
	private int bmCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGmCount() {
		return gmCount;
	}

	public void setGmCount(int gmCount) {
		this.gmCount = gmCount;
	}

	public int getSmCount() {
		return smCount;
	}

	public void setSmCount(int smCount) {
		this.smCount = smCount;
	}

	public int getBmCount() {
		return bmCount;
	}

	public void setBmCount(int bmCount) {
		this.bmCount = bmCount;
	}

	@Override
	public String toString() {
		return name + " " + gmCount + " " + smCount + " " + bmCount;
	}
}

public class Test1 {
	public static Country updatedCountry(Country obj, String name, int mPosition) {
		Country updatedObj;
		if (obj == null) {
			updatedObj = new Country();
			updatedObj.setName(name);
			obj = updatedObj;
		}
		if (mPosition == 0) {
			obj.setGmCount(obj.getGmCount() + 1);
		} else if (mPosition == 1) {
			obj.setSmCount(obj.getSmCount() + 1);
		} else {
			obj.setBmCount(obj.getBmCount() + 1);
		}

		return obj;
	}

	static HashMap<String, Country> hm = new HashMap<>();

	public static void main(String[] args) {

		eventsMedalBoard3();
	}

	public static void eventsMedalBoard3() {
		Scanner sc = new Scanner(System.in);
		int evntCount = sc.nextInt();
		sc.nextLine();// for flush new linle char
		String inputData;
		String[] spiltData;

		for (int i = 1; i <= evntCount; ++i) {
			inputData = sc.nextLine();
			spiltData = inputData.split(" ");
			for (int j = 0; j < 3; ++j) {
				hm.put(spiltData[j], updatedCountry(hm.get(spiltData[j]), spiltData[j], j));
			}
		}

		List<Map.Entry<String, Country>> list = new LinkedList<>(hm.entrySet());

//		Comparator<Map.Entry<String, Country>> compObj = new Comparator<Map.Entry<String, Country>>() {
//
//			@Override
//			public int compare(Entry<String, Country> o1, Entry<String, Country> o2) {
//				if (o2.getValue().getGmCount() != o1.getValue().getGmCount()) {
//					return o2.getValue().getGmCount() - o1.getValue().getGmCount();
//				} else {
//					if (o2.getValue().getSmCount() != o1.getValue().getSmCount()) {
//						return o2.getValue().getSmCount() - o1.getValue().getSmCount();
//					} else {
//						return o2.getValue().getBmCount() - o1.getValue().getBmCount();
//					}
//				}
//			}
//
//		};

		// Collections.sort(list, compObj);
		Collections.sort(list, (c1, c2) -> {
			if (c2.getValue().getGmCount() != c1.getValue().getGmCount()) {
				return c2.getValue().getGmCount() - c1.getValue().getGmCount();
			} else {
				if (c2.getValue().getSmCount() != c1.getValue().getSmCount()) {
					return c2.getValue().getSmCount() - c1.getValue().getSmCount();
				} else {
					return c2.getValue().getBmCount() - c1.getValue().getBmCount();
				}
			}

		});

		for(Map.Entry<String, Country> each: list)
		{
			System.out.println(each.getValue());
		}
//		System.out.println(list);

	}

	public static void eventsMedalsBoard2() {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, int[]> hashMap = new LinkedHashMap<>();
		int noOfEvents = sc.nextInt();
		sc.nextLine();// flush
		String inputData;
		String[] inputSplit;
		int[] temp;
		for (int i = 1; i <= noOfEvents; ++i) {
			inputData = sc.nextLine();
			inputSplit = inputData.split(" ");
			for (int j = 0; j <= 2; ++j) {
				if (!hashMap.containsKey(inputSplit[j])) {
					temp = new int[3];
					temp[j] = 1;
					hashMap.put(inputSplit[j], temp);
				} else {
					temp = hashMap.get(inputSplit[j]);
					temp[j] = ++temp[j];
					hashMap.put(inputSplit[j], temp);
				}
			}
		}
		System.out.println("==================");
		for (Map.Entry<String, int[]> each : hashMap.entrySet()) {
			System.out.println(
					each.getKey() + " " + each.getValue()[0] + " " + each.getValue()[1] + " " + each.getValue()[2]);
		}

		List<Map.Entry<String, int[]>> list = new LinkedList<Entry<String, int[]>>(hashMap.entrySet());
		Collections.sort(list, (e1, e2) -> {
			if (e1.getValue()[0] != e2.getValue()[0]) {
				return e1.getValue()[0] - e2.getValue()[0];
			} else {
				if (e1.getValue()[1] != e2.getValue()[1]) {
					return e1.getValue()[1] - e2.getValue()[1];
				} else {
					return e1.getValue()[2] - e2.getValue()[2];
				}
			}
		});
		System.out.println("==================");
		for (Map.Entry<String, int[]> each : hashMap.entrySet()) {
			System.out.println(
					each.getKey() + " " + each.getValue()[0] + " " + each.getValue()[1] + " " + each.getValue()[2]);
		}
	}

	public static void eventsMedalsBoard() {
		HashSet<String> country = new HashSet<>();
		HashMap<String, Integer> gHM = new HashMap<>();
		HashMap<String, Integer> sHM = new HashMap<>();
		HashMap<String, Integer> bHM = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int nOfEvent = sc.nextInt();
		sc.nextLine();// for flush
		String inputData;
		String inputSplit[];
		for (int i = 1; i <= nOfEvent; ++i) {
			inputData = sc.nextLine();
			if (inputData.contains(" ")) {
				inputSplit = inputData.split(" ");
				// Added all countries
				country.add(inputSplit[0]);
				country.add(inputSplit[1]);
				country.add(inputSplit[2]);
				gHM.put(inputSplit[0], gHM.get(inputSplit[0]) == null ? 1 : gHM.get(inputSplit[0]) + 1);
				bHM.put(inputSplit[1], bHM.get(inputSplit[1]) == null ? 1 : bHM.get(inputSplit[1]) + 1);
				sHM.put(inputSplit[2], sHM.get(inputSplit[2]) == null ? 1 : sHM.get(inputSplit[2]) + 1);
			}
		}

		for (String each : country) {
			System.out.println(each + " " + (gHM.get(each) == null ? 0 : gHM.get(each)) + " "
					+ (bHM.get(each) == null ? 0 : bHM.get(each)) + " " + (sHM.get(each) == null ? 0 : sHM.get(each)));
		}
	}

}
