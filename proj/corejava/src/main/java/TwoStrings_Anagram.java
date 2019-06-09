
public class TwoStrings_Anagram {

	public static void main(String[] args) {
		String name1 = "Ravi";
		String name2 = "Vira";
		if (name1.length() == name2.length()) {
			name1 = name1.toLowerCase();
			name2 = name2.toLowerCase();
			char[] n1 = name1.toCharArray();
			char[] n2 = name2.toCharArray();

			n1 = sort(n1);
			n2 = sort(n2);
			for (int i = 0; i < n1.length; i++) {
				if(n1[i]!=n2[i])
				{
					System.out.println(name1 + " & " + name2 + " are not anagram");
					return;
				}
			}
			System.out.println(name1 + " & " + name2 + " are anagram");
		} else {
			System.out.println(name1 + " & " + name2 + " are not anagram");
		}
	}

	public static void printArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static char[] sort(char[] n) {
		printArray(n);
		char temp;
		for (int i = 0; i < n.length; i++) {
			for (int j = 1; j < (n.length - i); j++) {
				if (n[j - 1] > n[j]) {
					temp = n[j - 1];
					n[j - 1] = n[j];
					n[j] = temp;
				}
			}
		}
		printArray(n);
		return n;
	}

}
