
public class _4_ElementOccuredOddNoOfTimes {

	static int getOddTimesElement(int ar[]) {
		int i;
		int result = 0;
		for (i = 0; i < ar.length; i++) {
			result = result ^ ar[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int array[] = new int[] {10,20,20,10,30,10,30,31,32};
		System.out.println(getOddTimesElement(array));
	}

}
