package interview;

public class Replace2orMoreSpacesWith1space {

	public static void main(String[] args) {

		String s="ravi      kiran vv	   b goru    ";
		s=s.replaceAll("[\\s]+", " ");
		System.out.println(s);
	}

}
