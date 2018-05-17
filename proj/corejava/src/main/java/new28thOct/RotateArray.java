package new28thOct;

public class RotateArray {

	
	public static void rotateArrayLeft(int [] ary, int pos)
	{
		if(ary!=null && ary.length!=0){
			
			if(ary.length<pos)
			{
				pos=pos%ary.length;
			}	
				
			
				int rAry[]=new int[ary.length];
				System.arraycopy(ary, pos, rAry, 0, ary.length-pos);
				System.arraycopy(ary, 0, rAry, ary.length-pos, pos);
				System.out.println("Left Rotate: by "+pos);
				for(int a: rAry)
					System.out.print(a+",");
		}
		
	}
	
	public static void rotateArrayRight(int [] ary, int pos)
	{
		if(ary!=null && ary.length!=0){
			for(int a: ary)
				System.out.print(a+",");
			System.out.println("\n--------------");
			if(ary.length<pos)
			{
				pos=pos%ary.length;
			}
		int rotatedarray[]=new int[ary.length];
		int j;
		for(int i=0; i<ary.length;++i)
		{
			j=(i+pos)%ary.length;
			rotatedarray[j]=ary[i];
		}
		System.out.println("Right Rotate: by "+pos);
		for(int a: rotatedarray)
			System.out.print(a+",");
		}
	}
	public static void main(String[] args) {

		int [] ary={1,2,3,4,5,6,7,8,9,10};
		rotateArrayRight(ary, 7);
		System.out.println();
		rotateArrayLeft(ary, 2);
	}

}
