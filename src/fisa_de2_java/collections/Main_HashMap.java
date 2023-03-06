package fisa_de2_java.collections;

import java.util.HashMap;
import java.util.Map;

public class Main_HashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map_of_strings = new HashMap<>();

		map_of_strings.put(11, "Romario");
		
		map_of_strings.put(7, "Cristiano");
		
		map_of_strings.put(9, "Ronaldo");
		
		map_of_strings.put(7, "Mahrez");
		
		map_of_strings.remove(9);
		
		map_of_strings.put(10, "Leo");
			
		
		for (Integer number : map_of_strings.keySet()) {
			
			System.out.println(number + " : " + map_of_strings.get(number));
		}	
		
		System.out.println("----------------------------------------------");
		
		for (Map.Entry<Integer, String> entry : map_of_strings.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
