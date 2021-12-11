package fisa_de2_java.collections;

import java.util.LinkedList;

public class Main_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list_of_strings = new LinkedList<>();

		list_of_strings.add("Rémy");
		
		list_of_strings.add("Daniel");
		
		list_of_strings.add("Wassim");
		
		list_of_strings.add(1, "Rebecca");
		
		list_of_strings.set(2, "Sam");
		
		list_of_strings.remove(3);
		
		list_of_strings.addLast("Rick");
		
		for (String firstname : list_of_strings) {
			
			System.out.println(firstname);
		}
	}

}
