package com.javapoint.packagedemo;


public class PackageClassdemo {

	public static void main(String[] args) {

		Package p=Package.getPackage("java.lang");
//		Package p=Package.getPackage("com.javapoint.packagedemo");
		System.out.println(p.getName());
		System.out.println(p.getImplementationTitle());
		System.out.println(p.getImplementationVendor());
		System.out.println(p.getImplementationVersion());
		System.out.println(p.getSpecificationTitle());
		System.out.println(p.getSpecificationVendor());
		System.out.println(p.getSpecificationVersion());
		System.out.println(p.isSealed());
	}

}
