package fisa_de2_java.generics;

public class Box<F, S> {

	private F first;

	private S second;

	public void add(F f, S s) {
		this.first = f;
		this.second = s;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}
}
