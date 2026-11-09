package fisa_de2_java.main;

import fisa_de2_java.model.Animal;
import fisa_de2_java.model.AnimalHandler;
import fisa_de2_java.model.Caniche;
import fisa_de2_java.model.Cat;
import fisa_de2_java.model.Dog;
import fisa_de2_java.model.Snake;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal a1 = new Cat("Tom");		
		Caniche d1 = new Caniche("Milou");		
		Dog d2 = new Dog("Rantanplan");
		Cat c1 = new Cat("Garfield");
		Snake s1 = new Snake("Viper");
		
		Animal[] animals = { a1, d1, d2, c1, s1 };
		
		AnimalHandler.makeAnimalsSayHello(animals);		
	}

}
