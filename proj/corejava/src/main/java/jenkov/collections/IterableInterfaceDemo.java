package jenkov.collections;

public class IterableInterfaceDemo {
/*

	Iterable is an interface which is parent/root  interface for Collection interface.
	But it is not under collection Framework because it is available under java.lang package.
	All collection classes indirectly implementing Iterable interface.

	1) Iterator<T> iterator();-------public abstract method
	
	
	2)
	   default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
	
*/	public static void main(String[] args) {
		Iterable itr = null;
		
		System.out.println("Please look over commented text.");

	}

}
