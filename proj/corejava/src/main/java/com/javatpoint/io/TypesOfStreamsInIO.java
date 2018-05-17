package com.javatpoint.io;


public class TypesOfStreamsInIO 
{
	public static void main(String[] args) throws Exception{

		System.out.println("Streams are byte streams(Inut/Output Streams) and charector streems(Readers/Writers) ");
		
		System.out.println("Enter charcheter:");
		int a=System.in.read();
		System.out.println("InPutStream: System.in: "+(char)a);
		System.out.println("OutPutStream: System.out");
		System.err.println("OutPutStream: System.err");
		
		
	}

}
