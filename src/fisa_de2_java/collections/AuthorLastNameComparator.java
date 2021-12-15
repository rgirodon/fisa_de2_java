package fisa_de2_java.collections;

import java.util.Comparator;

public class AuthorLastNameComparator implements Comparator<Author> {

	@Override
	public int compare(Author author1, Author author2) {
		
		return author1.getLastName().compareTo(author2.getLastName());
	}

}
