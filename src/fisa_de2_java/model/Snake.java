package fisa_de2_java.model;

public class Snake extends Animal {

	public Snake(String name) {
		super(name);
	}

	@Override
	public void direBonjour() {
		
		System.out.println("Tsss, I am " + this.name);
	}
}
