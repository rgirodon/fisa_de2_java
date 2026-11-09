package fisa_de2_java.model;

public class Caniche extends Dog {

	public Caniche(String name) {
		super(name);
	}

	@Override
	public void direBonjour() {
		
		System.out.println("Woof Woof, I am " + this.name);
	}
}
