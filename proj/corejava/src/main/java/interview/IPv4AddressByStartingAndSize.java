package interview;

public class IPv4AddressByStartingAndSize {
	public static void calculateIPRangeByFromAndSize(String fromAddress, String n)
    {

		String[] octents = fromAddress.split("\\.");

            int firstOct=Integer.parseInt(octents[0]);
            int secondOct=Integer.parseInt(octents[1]);
            int thirdOct=Integer.parseInt(octents[2]);
            int forthOct=Integer.parseInt(octents[3]);
            if(firstOct<0 || firstOct>255 || secondOct<0 || secondOct>255 || thirdOct<0 || thirdOct>255 || forthOct<0 || forthOct>255 )
            {
            	System.out.println("Invalid_Address");
            }

            System.out.println(firstOct+"."+secondOct+"."+thirdOct+"."+forthOct); 
            System.out.println(n);
            
            int size=Integer.parseInt(n);

            if (size > 1000)
            {
                System.out.println("Invalid_Size");
            }
            
            size=size-1;// included from address itself so '-1'
            
            int total=forthOct+size;
            forthOct=total;
            if(total>255)
            {
            	forthOct=total%255;
            	total=total/255;
            	total=thirdOct+total;
            	thirdOct=total;
            }	
            if(total>255)
            {
            	thirdOct=total%255;
            	total=total/255;
            	total=secondOct+total;
            	secondOct=total;
            }	
            if(total>255)
            {
            	secondOct=total%255;
            	total=total/255;
            	total=firstOct+total;
            	firstOct=total;
            }	
            if(total>255)
            {
            	System.out.println("invalid size for given form address.");
            }	
         System.out.println(firstOct+"."+secondOct+"."+thirdOct+"."+forthOct);   	
        
    }

	public static void main(String[] args) {
		String fromAddress="210.205.255.250";
		String size="50";
		calculateIPRangeByFromAndSize(fromAddress,size);

	}

}
