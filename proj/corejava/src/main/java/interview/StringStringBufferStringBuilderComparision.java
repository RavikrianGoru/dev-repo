package interview;

public class StringStringBufferStringBuilderComparision {

		public static void main(String[] args) {

			
			long startTime;
			long startFreeSpace;
			long endTime;
			long endFreeSpace;
			
			System.gc();
			startTime=System.currentTimeMillis();
			startFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("String creation as assigning value:");
			String s01="ravi";
			for(int i=0; i<1000;++i)
			{
				s01=s01+i;
			}
			
			endTime=System.currentTimeMillis();
			endFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("Total time: "+(endTime-startTime));
			System.out.println("Total space: "+(startFreeSpace-endFreeSpace));
			
			

			
			System.gc();
			startTime=System.currentTimeMillis();
			startFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("String creation new Operator:");
			String s1=new String("ravi");
			for(int i=0; i<1000;++i)
			{
				s1=s1+i;
			}
			
			endTime=System.currentTimeMillis();
			endFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("Total time: "+(endTime-startTime));
			System.out.println("Total space: "+(startFreeSpace-endFreeSpace));
			
			

			System.gc();
			startTime=System.currentTimeMillis();
			startFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("StringBuffer creation new Operator:");
			StringBuffer s2=new StringBuffer("ravi");
			for(int i=0; i<1000;++i)
			{
				s2.append(i);
			}
			
			endTime=System.currentTimeMillis();
			endFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("Total time: "+(endTime-startTime));
			System.out.println("Total space: "+(startFreeSpace-endFreeSpace));
			

			System.gc();
			startTime=System.currentTimeMillis();
			startFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("StringBuilder creation new Operator:");
			StringBuilder s3=new StringBuilder("ravi");
			for(int i=0; i<1000;++i)
			{
				s3.append(i);
			}
			
			endTime=System.currentTimeMillis();
			endFreeSpace=Runtime.getRuntime().freeMemory();
			
			System.out.println("Total time: "+(endTime-startTime));
			System.out.println("Total space: "+(startFreeSpace-endFreeSpace));
			
			
		}


}
