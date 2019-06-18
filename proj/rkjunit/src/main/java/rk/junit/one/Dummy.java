package rk.junit.one;

public class Dummy {
	public void nothing() throws Exception {
		throw new Exception("Nothing");
	}

	public String sayHi() {
		return "Hi";
	}

	public long sum(long a, long b) {
		return a + b;
	}
}
