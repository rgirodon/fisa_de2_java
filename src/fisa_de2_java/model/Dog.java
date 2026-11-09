package fisa_de2_java.model;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void direBonjour() {
		
		System.out.println("Woof, I am " + this.name);
	}
}
