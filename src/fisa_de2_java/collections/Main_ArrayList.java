package fisa_de2_java.collections;

import java.util.ArrayList;

public class Main_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list_of_strings = new ArrayList<>();

		list_of_strings.add("Rémy");
		
		list_of_strings.add("Daniel");
		
		list_of_strings.add("Wassim");
		
		list_of_strings.add(1, "Rebecca");
		
		list_of_strings.set(2, "Sam");
		
		list_of_strings.remove(3);
		
		for (String firstname : list_of_strings) {
			
			System.out.println(firstname);
		}
	}

}
