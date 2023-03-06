package fisa_de2_java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main_Iterator {

	public static void main(String[] args) {
		
		List<String> list_of_strings = new ArrayList<>();

		list_of_strings.add("Rémy");
		
		list_of_strings.add("Daniel");
		
		list_of_strings.add("Wassim");
		
		list_of_strings.add("Rebecca");
		
		list_of_strings.add("Sam");
						
		Iterator<String> iterator = list_of_strings.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------------");
		
		ListIterator<String> listIterator = list_of_strings.listIterator();
		
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
		}
		
		System.out.println("-----------------------");
		
		while (listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
		
	}

}
