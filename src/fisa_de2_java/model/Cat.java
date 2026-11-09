package fisa_de2_java.model;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void direBonjour() {
		
		System.out.println("Miaou, I am " + this.name);
	}
}
