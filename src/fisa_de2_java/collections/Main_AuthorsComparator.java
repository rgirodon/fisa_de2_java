package fisa_de2_java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main_AuthorsComparator {

	public static void main(String[] args) {
		
		ArrayList<Author> list_of_authors = new ArrayList<>();

		list_of_authors.add(new Author("Rémy", "Girodon", 1978));
		
		list_of_authors.add(new Author("Daniel", "Smith", 1990));
		
		list_of_authors.add(new Author("Wassim", "Chamga", 1857));

		Collections.sort(list_of_authors, new AuthorComparator());
		
		for (Author author : list_of_authors) {
			
			System.out.println(author);
		}
	}

}
