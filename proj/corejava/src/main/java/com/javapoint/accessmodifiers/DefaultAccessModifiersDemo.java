package com.javapoint.accessmodifiers;

//import com.javapoint.subpack.DefaultClass; C.T Error
import com.javapoint.subpack.PublicClass;

public class DefaultAccessModifiersDemo {

	public static void main(String[] args) {
		System.out.println("Default Access modifier is know as Package level access modifier.");
		PublicClass pubC=new PublicClass();
		pubC.pubM();
		//pubC.defM(); C.T Error
		//DefaultClass defC=new DefaultClass(); C.T Error
	}

}
