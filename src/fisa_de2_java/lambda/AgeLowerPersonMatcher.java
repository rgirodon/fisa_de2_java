package fisa_de2_java.lambda;

public class AgeLowerPersonMatcher implements PersonMatcher {

	@Override
	public boolean match(Person person) {
		
		return person.age <= 18;
	}

}
