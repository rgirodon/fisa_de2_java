package fisa_de2_java.collections;

import java.util.TreeMap;

public class Main_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map_of_strings = new TreeMap<>();

		map_of_strings.put(11, "Romario");
		
		map_of_strings.put(7, "Cristiano");
		
		map_of_strings.put(9, "Ronaldo");
		
		map_of_strings.put(7, "Figo");
		
		map_of_strings.remove(9);
		
		map_of_strings.put(10, "Leo");
								
		for (Integer number : map_of_strings.keySet()) {
			
			System.out.println(number + " : " + map_of_strings.get(number));
		}
	}

}
