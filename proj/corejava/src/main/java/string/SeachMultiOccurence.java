package string;

public class SeachMultiOccurence {

	public static void main(String[] args) {

		String data="this is ravi kiran. is there any issue with \"is\"";
		String searchWord="is";
		int index=data.indexOf(searchWord);
		int count=0;
		while(index!=-1)
		{
			count++;
			index=data.indexOf(searchWord, index+1);
		}
		System.out.println("Data :"+data);
		System.out.println("search word :"+searchWord);
		System.out.println("Number of occurences :"+count);
	}

}
