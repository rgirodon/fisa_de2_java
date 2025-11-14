package fisa_de2_java.model;

public class Factory {

	public static Salutationer provideSalutationer() {
		
		Salutationer result = null;
		
		String language = System.getenv("LANG");
		
		if ("FR".equals(language)) {
			
			result = new FrenchSalutationer();
		}
		else if ("SP".equals(language)) {
			
			result = new SpanishSalutationer();
		}
		else {
			result = new EnglishSalutationer();
		}
		
		return result;
	}
}
