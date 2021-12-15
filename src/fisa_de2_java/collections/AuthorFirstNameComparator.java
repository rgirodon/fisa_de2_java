package fisa_de2_java.collections;

import java.util.Comparator;

public class AuthorFirstNameComparator implements Comparator<Author> {

	@Override
	public int compare(Author author1, Author author2) {
		
		return author1.getFirstName().compareTo(author2.getFirstName());
	}

}
