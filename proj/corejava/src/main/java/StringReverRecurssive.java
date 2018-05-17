import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class Animal implements Serializable{
	public void eat() {
		System.out.println("Eat----A");
	}
}

class Dog extends Animal implements Externalizable{
	public void eat() {
		System.out.println("Eat----B");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	}
}

public class StringReverRecurssive extends Dog {
		public void eat() {
			System.out.println("Eat----C");
		}

	public static void main(String[] args) {
		Animal a = new StringReverRecurssive();
		a.eat();
	}

}
