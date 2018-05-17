import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String data=null;
		System.out.println("String data----"+data+" if do any operation on null we will get NullPointerException.");
		
		Optional<String> opData=Optional.empty();
		System.out.println(opData.orElse("Dummy"));
		
		if(opData.isPresent())
		System.out.println(opData.get());//R.T Exception: NoSuchElementException
		
		opData=Optional.of("Ravi");
		if(opData.isPresent())
		System.out.println(opData.get());
		
		opData=Optional.ofNullable("...");
		if(opData.isPresent())
		System.out.println(opData.get());
	}

}
