package ds;

public class ReverseOfStringBySpace {

	/*
	 * Given input: "Position 1 no. @ HCL is This"; Expected
	 * output:---------------"This i HCL @ no. 1 Position"
	 */

	static private StringBuffer data = new StringBuffer("Position 1 no. @ HCL is This");
	
	public static void swap(int start, int last) {
		while (start < last) {
			data.setCharAt(start, (char) (data.charAt(start) + data.charAt(last)));
			data.setCharAt(last, (char) (data.charAt(start) - data.charAt(last)));
			data.setCharAt(start, (char) (data.charAt(start) - data.charAt(last)));
			start++;
			last--;
		}
	}

	public static void main(String[] args) {
		System.out.println(data.toString());
		swap(0, data.length()-1);
		System.out.println(data.toString());
		
		int start=0, last;
		while((last=data.indexOf(" ",start))!=-1)
		{
			swap(start, last-1);
			start=last;
		}
		System.out.println(data.toString());
		
	}

}
