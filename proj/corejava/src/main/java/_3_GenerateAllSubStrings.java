public class _3_GenerateAllSubStrings{

	public static void main(String[] args) {
		String data="RavikiranGoru";
		for(int i=0;i<data.length()-1;++i)
		{
			for(int j=i+1;j<=data.length();++j)
			{
				System.out.println(data.substring(i, j));
			}
		}
	}
}
