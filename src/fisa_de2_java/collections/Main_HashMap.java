package fisa_de2_java.collections;

import java.util.HashMap;

public class Main_HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map_of_strings = new HashMap<>();

		map_of_strings.put(11, "Romario");
		
		map_of_strings.put(7, "Cristiano");
		
		map_of_strings.put(9, "Ronaldo");
		
		map_of_strings.put(7, "Figo");
		
		map_of_strings.remove(9);
								
		for (Integer number : map_of_strings.keySet()) {
			
			System.out.println(number + " : " + map_of_strings.get(number));
		}
	}

}
