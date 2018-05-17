package ds.tricky;

import java.lang.reflect.Field;

public class IntegerMutable {

	public static void main(String[] args) {
		Integer x = 100;
		System.out.println("Before mutate: " + x+" :"+x.hashCode());
		mutate(x);
		System.out.println("After mutate: " + x+" :"+x.hashCode());

	}

	private static void mutate(Integer x) {
		try {
			Field f=Integer.class.getDeclaredField("value");
			f.setAccessible(true);
			f.setInt(x, 500);
			
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
	}

}
