package fisa_de2_java.model;

abstract public class Animal {
	
	private String name;
	
	public Animal() {
		
		this.name = null;
	}
	
	public Animal(String name) {
		
		this.name = name;
	}

	abstract public void shout();
	
	public void move() {
		System.out.println("I move !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
