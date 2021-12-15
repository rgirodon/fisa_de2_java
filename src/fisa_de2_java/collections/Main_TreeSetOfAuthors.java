package fisa_de2_java.collections;

import java.util.TreeSet;

public class Main_TreeSetOfAuthors {

	public static void main(String[] args) {
		
		TreeSet<Author> set_of_authors = new TreeSet<>();

		set_of_authors.add(new Author("Rémy", "Girodon", 1978));
		
		set_of_authors.add(new Author("Arthur", "Michels", 1416));
		
		set_of_authors.add(new Author("Daniel", "Smith", 1990));
		
		set_of_authors.add(new Author("Wassim", "Chamga", 1857));

		for (Author author : set_of_authors) {
			
			System.out.println(author);
		}
	}

}
