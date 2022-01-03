package fisa_de2_java.lambda;

@FunctionalInterface
public interface PersonMatcher {

	boolean match(Person person);
}
