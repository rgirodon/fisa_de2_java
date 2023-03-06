package fisa_de2_java.collections;

import java.util.HashSet;
import java.util.Set;

public class Main_HashSet {

	public static void main(String[] args) {
		
		
		Set<String> set_of_strings = new HashSet<>();

		set_of_strings.add("Rémy");
		
		set_of_strings.add("Daniel");
		
		set_of_strings.add("Wassim");
		
		set_of_strings.add("Rémy");
		
		set_of_strings.remove("Daniel");
		
		set_of_strings.add("Arthur");
						
		for (String firstname : set_of_strings) {
			
			System.out.println(firstname);
		}
		
		
		/*
		HashSet<Student> set_of_students = new HashSet<>();
		
		set_of_students.add(new Student("Barack", "Obama"));
		
		set_of_students.add(new Student("Georges W", "Bush"));
		
		set_of_students.add(new Student("Donald", "Trump"));
		
		set_of_students.add(new Student("Barack", "Obama"));
		
		for (Student student : set_of_students) {
			
			System.out.println(student);
		}
		*/
	}

}
