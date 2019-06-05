package org.corejava.interview.sapient;

final class Immutable1 {
	private final String val;

	private Immutable1(String val) {
		this.val = val;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ImmutableWithFinal {

	public static void main(String[] args) {
		
	}
}
