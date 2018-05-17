package interview;

public class PrintAlphabet {

	public static void main(String[] args) {
		System.out.println("character and integer value for that character(a to z)----->(97 to 122)");
	for(char c='a';c<='z';++c)
		System.out.println(c+" -----> "+(int)c);
	
	System.out.println("character and integer value for that character(A to Z)----->(65 to 90)");
	for(char c='A';c<='Z';++c)
		System.out.println(c+" -----> "+(int)c);
	
	
	System.out.println("character and integer value for that character(a to z)----->(97 to 122)");
	System.out.println("character and integer value for that character(A to Z)----->(65 to 90)");
}

}
