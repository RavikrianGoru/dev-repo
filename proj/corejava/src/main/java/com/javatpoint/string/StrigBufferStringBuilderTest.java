package com.javatpoint.string;

public class StrigBufferStringBuilderTest {

	public static void main(String[] args) {

		StringBuffer sbf=new StringBuffer("Hi");
		long startTime=System.currentTimeMillis();
		for(int i=0; i<10000;++i)
			sbf.append(",Ravi");
		System.out.println("StringBuffer appending time:"+(System.currentTimeMillis()-startTime)+"ms");
		
		
		StringBuilder sbl=new StringBuilder("Hi");
		startTime=System.currentTimeMillis();
		for(int i=0; i<10000;++i)
			sbl.append(",Ravi");
		System.out.println("StringBuilder appending time:"+(System.currentTimeMillis()-startTime)+"ms");
	}

}
