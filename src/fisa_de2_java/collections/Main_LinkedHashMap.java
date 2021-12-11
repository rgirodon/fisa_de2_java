package fisa_de2_java.collections;

import java.util.LinkedHashMap;

public class Main_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map_of_strings = new LinkedHashMap<>();

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
