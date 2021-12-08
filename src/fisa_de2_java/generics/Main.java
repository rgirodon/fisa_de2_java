package fisa_de2_java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Without generics
		
		List list_without_generics = new ArrayList();
		
		Integer added_without_generics = Integer.valueOf(1);
		
		list_without_generics.add(added_without_generics);
		
		Integer retrieved_without_generics = (Integer)list_without_generics.get(0);
		
		System.out.println("Retrieved without generics : " + retrieved_without_generics);
		
		
		
		// With generics
		
		List<Integer> list_with_generics = new ArrayList<>();
		
		Integer added_with_generics = Integer.valueOf(1);
		
		list_with_generics.add(added_with_generics);
		
		Integer retrieved_with_generics = list_with_generics.get(0);
		
		System.out.println("Retrieved with generics : " + retrieved_with_generics);

	}

}
