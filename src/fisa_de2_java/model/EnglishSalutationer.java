package fisa_de2_java.model;

public interface EnglishSalutationer {

	default String saluteInEnglish(String firstname) {
		
		return "Hello " + firstname;
	}

}
