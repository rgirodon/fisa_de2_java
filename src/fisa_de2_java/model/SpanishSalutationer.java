package fisa_de2_java.model;

public interface SpanishSalutationer {

	default String saluteInSpanish(String firstname) {
		
		return "Hola " + firstname;
	}

}
