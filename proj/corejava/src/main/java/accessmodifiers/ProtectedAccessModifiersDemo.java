package accessmodifiers;

import com.javapoint.subpack.PublicClassHavingProtectedInfo;

public class ProtectedAccessModifiersDemo extends PublicClassHavingProtectedInfo {

	private void method() {
		System.out.println(protInt);
		System.out.println(pubInt);
	}

	public static void main(String[] args) {
		System.out.println(
				"The protected access modifier is accessible within package and outside the package but through inheritance only.\nThe protected access modifier can be applied on the data member, method and constructor.\nIt can't be applied on the class.");

		PublicClassHavingProtectedInfo obj = new PublicClassHavingProtectedInfo();
		System.out.println(obj.pubInt);
		// System.out.println(obj.defInt);
		// System.out.println(obj.priInt);
		// System.out.println(obj.proInt);
		new ProtectedAccessModifiersDemo().method();
	}

}
