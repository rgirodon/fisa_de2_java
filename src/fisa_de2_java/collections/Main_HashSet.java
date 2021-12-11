package fisa_de2_java.collections;

import java.util.HashSet;

public class Main_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> set_of_strings = new HashSet<>();

		set_of_strings.add("Rémy");
		
		set_of_strings.add("Daniel");
		
		set_of_strings.add("Wassim");
		
		set_of_strings.add("Rémy");
		
		set_of_strings.remove("Daniel");
		
		set_of_strings.add("Arthur");
						
		for (String firstname : set_of_strings) {
			
			System.out.println(firstname);
		}
	}

}
