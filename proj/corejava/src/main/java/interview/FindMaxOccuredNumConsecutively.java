package interview;

public class FindMaxOccuredNumConsecutively {

	public static void findMaxTimesConseOccuredNum(int[] ary) {
		int number, times = 0, temNumber, tempTimes = 0;
		if (ary != null && ary.length != 0) {
			number = ary[0];
			for (int i = 0; i < ary.length; ++i) {
				if (i == 0) {
					number = temNumber = ary[i];
					times = tempTimes = 1;
				} else if (i > 0) {
					temNumber = ary[i];
					if (ary[i] == ary[i - 1]) {
						tempTimes = tempTimes + 1;
						if (tempTimes >= times) {
							times = tempTimes;
							number = temNumber;
						}
					} else {
						tempTimes = 1;
					}
				}
			}
			System.out.println(number + "------>" + times);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 2, 2, 2, 4 };
		findMaxTimesConseOccuredNum(a);
	}

}
