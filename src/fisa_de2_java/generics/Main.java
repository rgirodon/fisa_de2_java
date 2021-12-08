package fisa_de2_java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// definition of a generic method
	public static <T> List<T> fromArrayToList(T[] array) {

		List<T> result = new ArrayList<>();

		for (T item : array) {

			result.add(item);
		}

		return result;
	}

	public static void main(String[] args) {

		// Without generics

		List list_without_generics = new ArrayList();

		Integer added_without_generics = Integer.valueOf(1);

		list_without_generics.add(added_without_generics);

		Integer retrieved_without_generics = (Integer) list_without_generics.get(0);

		System.out.println("Retrieved without generics : " + retrieved_without_generics);

		// With generics

		List<Integer> list_with_generics = new ArrayList<>();

		Integer added_with_generics = Integer.valueOf(1);

		list_with_generics.add(added_with_generics);

		Integer retrieved_with_generics = list_with_generics.get(0);

		System.out.println("Retrieved with generics : " + retrieved_with_generics);

		// calls to generic method
		Integer[] integer_array = { 1, 2, 3 };

		List<Integer> integer_list = fromArrayToList(integer_array);

		for (Integer item : integer_list) {

			System.out.println(item);
		}

		String[] string_array = { "A", "B", "C" };

		List<String> string_list = fromArrayToList(string_array);

		for (String item : string_list) {

			System.out.println(item);
		}

		Box<Integer, String> box1 = new Box<Integer, String>();
		box1.add(Integer.valueOf(10), "Hello World");
		System.out.println("Integer Value : " + box1.getFirst());
		System.out.println("String Value : " + box1.getSecond());

		Box<String, String> box2 = new Box<String, String>();
		box2.add("Message", "Hello World");
		System.out.println("String Value : " + box2.getFirst());
		System.out.println("String Value : " + box2.getSecond());
	}

}
