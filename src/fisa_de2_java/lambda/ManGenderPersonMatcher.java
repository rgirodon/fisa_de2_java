package fisa_de2_java.lambda;

public class ManGenderPersonMatcher implements PersonMatcher {

	@Override
	public boolean match(Person person) {
		
		return person.gender == Gender.MAN;
	}

}
