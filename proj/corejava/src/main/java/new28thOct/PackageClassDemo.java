package new28thOct;

public class PackageClassDemo {

	public static void main(String[] args) {

		Package p=Package.getPackage("java.lang");
		System.out.println(p);
		System.out.println(p.getImplementationVersion());
		System.out.println(p.getSpecificationVersion());
		System.out.println(p.getImplementationTitle());
		System.out.println(p.getImplementationVendor());
		System.out.println(p.getName());
		System.out.println(p.getSpecificationTitle());
		System.out.println(p.getSpecificationVendor());
		System.out.println(p);

		
	}

}
