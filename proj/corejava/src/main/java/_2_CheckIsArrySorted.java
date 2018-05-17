

public class _2_CheckIsArrySorted {

	public static int isSorted(int[] inputArray, int lastIndex)
	{
		if(lastIndex==1)
		return 1;
		else
		{
			return inputArray[lastIndex-1]<inputArray[lastIndex-2]?0:isSorted(inputArray, lastIndex-1);
		}
				
	}
	public static void main(String[] args) {

		int data[]={1,2,3,4,5,6,7,8};
		if(isSorted(data,data.length)==1)
		{
			System.out.println("Given array is in sorted order");
		}else
		{
			System.out.println("Given array is not in sorted order");
		}
	}

}
