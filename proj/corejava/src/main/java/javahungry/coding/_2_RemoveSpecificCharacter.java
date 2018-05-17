package javahungry.coding;

public class _2_RemoveSpecificCharacter {

	
	public static String removeCharsFromString(String orgString, String removalString)
	{
		char [] orgData=orgString.toCharArray();
		char[] remData=removalString.toCharArray();
		boolean[] boolData=new boolean[128];
		
		for(int i=0;i<remData.length;i++)
		{
			boolData[remData[i]]=true;
		}
		
		int newStart=0;
		for(int i=0;i<orgData.length;++i)
		{
			if(!boolData[orgData[i]])
			{
				orgData[newStart++]=orgData[i];
			}
		}
		return new String(orgData,0,newStart);
		
	}
	public static void main(String[] args) {
		String orgData=" This is Ravikiran Goru, Please call me R.K Goru";
		String removalData=" ";//"hi r.k"
		
		
		System.out.println("Input Data: "+orgData);
		System.out.println("Input removal Data: "+removalData);
		
		System.out.println(removeCharsFromString(orgData,removalData));
	}

}
