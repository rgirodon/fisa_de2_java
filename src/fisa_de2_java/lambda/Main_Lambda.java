package fisa_de2_java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main_Lambda {

	public static List<Person> DATA = new ArrayList<>();
	
	static {
		DATA.add(new Person("A1", 10, Gender.MAN));
		DATA.add(new Person("A2", 12, Gender.WOMAN));
		DATA.add(new Person("A3", 14, Gender.MAN));
		DATA.add(new Person("A4", 16, Gender.WOMAN));
		DATA.add(new Person("A5", 18, Gender.NOT_EXPRESSED));
		DATA.add(new Person("A6", 20, Gender.MAN));
		DATA.add(new Person("A7", 22, Gender.WOMAN));
		DATA.add(new Person("A8", 24, Gender.MAN));
		DATA.add(new Person("A9", 26, Gender.WOMAN));
		DATA.add(new Person("A10", 28, Gender.NOT_EXPRESSED));
		DATA.add(new Person("B1", 30, Gender.MAN));
		DATA.add(new Person("B2", 32, Gender.WOMAN));
		DATA.add(new Person("B3", 34, Gender.MAN));
		DATA.add(new Person("B4", 36, Gender.WOMAN));
		DATA.add(new Person("B5", 38, Gender.NOT_EXPRESSED));
		DATA.add(new Person("B6", 40, Gender.MAN));
		DATA.add(new Person("B7", 42, Gender.WOMAN));
		DATA.add(new Person("B8", 44, Gender.MAN));
		DATA.add(new Person("B9", 46, Gender.WOMAN));
		DATA.add(new Person("V10", 48, Gender.NOT_EXPRESSED));
	}
	
	public static List<Person> findPersonsWithAgeLower(List<Person> persons, Integer age) {
		
		List<Person> result = new ArrayList<>();
		
		for (Person person : persons) {
			
			if (person.age <= age) {
				
				result.add(person);
			}
		}
		
		return result;
	}
	
	public static List<Person> findPersons(List<Person> persons, PersonMatcher matcher) {
		
		List<Person> result = new ArrayList<>();
		
		for (Person person : persons) {
			
			if (matcher.match(person)) {
				
				result.add(person);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Person> minors = findPersonsWithAgeLower(DATA, 18);
		
		System.out.println(minors.size() + " persons found");
		
		List<Person> minorsWithConcreteClass = findPersons(DATA, new AgeLowerPersonMatcher());
		
		System.out.println(minorsWithConcreteClass.size() + " persons found with concrete class");
	}
}
