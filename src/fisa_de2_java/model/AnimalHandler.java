package fisa_de2_java.model;

public class AnimalHandler {

	public static void makeAnimalsSayHello(Animal[] animals) {
		
		for (Animal currentAnimal : animals) {
			
			currentAnimal.direBonjour();
		}
	}
}
