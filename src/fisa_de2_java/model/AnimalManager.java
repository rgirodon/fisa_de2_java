package fisa_de2_java.model;

import java.util.ArrayList;

public class AnimalManager {

	public static void entertain(ArrayList<Animal> animals) {
		
		for (Animal currentAnimal : animals) {
			
			currentAnimal.shout();
			currentAnimal.move();
		}
	}
	
	public static void rename(Animal animal, String newName) {
		
		animal.setName(newName);
	}
}
