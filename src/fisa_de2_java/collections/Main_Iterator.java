package fisa_de2_java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main_Iterator {

	public static void main(String[] args) {
		
		ArrayList<String> list_of_strings = new ArrayList<>();

		list_of_strings.add("Rémy");
		
		list_of_strings.add("Daniel");
		
		list_of_strings.add("Wassim");
		
		list_of_strings.add(1, "Rebecca");
		
		list_of_strings.set(2, "Sam");
		
		list_of_strings.remove(3);
		
		Iterator<String> iterator = list_of_strings.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		ListIterator<String> listIterator = list_of_strings.listIterator();
		
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
		}
		
		while (listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
	}

}
