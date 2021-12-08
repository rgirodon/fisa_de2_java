package fisa_de2_java.model;

public interface FrenchSalutationer {

	default String saluteInFrench(String firstname) {
		
		return "Bonjour " + firstname;
	}

}
