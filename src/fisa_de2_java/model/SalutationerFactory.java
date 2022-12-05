package fisa_de2_java.model;

public class SalutationerFactory {

	public static ISalutationer provideSalutationer() {
		
		return new EnglishSalutationerImpl();
	}
}
