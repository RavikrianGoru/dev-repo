package javahungry.coding;

public class _3_IntersectionOFTwoIntArrays {

	public static void intersect1(int[] ary1,int[] ary2)
	{
		System.out.println("Intersection elemets TM: O(m*n)");
		if(ary1==null || ary2==null || ary1.length==0 || ary2.length==0 )
		{
			System.out.println("No common Elements");
		}
		else
		{
			for(int i=0;i<ary1.length;++i)
			{
				for(int j=0;j<ary2.length;j++)
				{
					if(ary1[i]==ary2[j])
						System.out.print(ary1[i]+",");
				}
			}
		}
	}
	public static void intersect2(char[] ary1,char[] ary2)
	{
		System.out.println("\nIntersection of char elemets by using hashig  TM: O(n)");
		int[] intAry=new int[128];
		if(ary1==null || ary2==null || ary1.length==0 || ary2.length==0 )
		{
			System.out.println("No common Elements");
		}
		else
		{
			for(int i=0;i<ary1.length;++i)
			{
				intAry[ary1[i]]=1;
			}
			for(int j=0;j<ary2.length;++j)
			{
				intAry[ary2[j]]=intAry[ary2[j]]+1;
			}
			for(int i=0;i<intAry.length;++i)
			{
				if(intAry[i]>=2)
					System.out.print((char)i+",");
			}
		}
	}

	public static void main(String[] args) {
		
		int ary1[]={1,2,3,4,5,6};
		int ary2[]={5,6,7,8,9};
		intersect1(ary1,ary2);
		
		char cAry1[] ={'a','b','d','f','g','z'};
		char cAry2[]={'A','d','g','x'};
		intersect2(cAry1,cAry2);
		}

}
