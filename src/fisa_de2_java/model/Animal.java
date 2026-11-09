package fisa_de2_java.model;

abstract public class Animal {

	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	abstract public void direBonjour();
}
