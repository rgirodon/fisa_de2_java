package fisa_de2_java.model;

public class SalutationerFactory {

	public final static int FRENCH = 0;
	
	public final static int ENGLISH = 1;
	
	public final static int SPANISH = 2;
	
	public static ISalutationer provideSalutationer(int mode) {
		
		if (mode == SalutationerFactory.ENGLISH) {
			
			return new EnglishSalutationerImpl();
		}
		else if (mode == SalutationerFactory.SPANISH) {
			
			return new SpanishSalutationerImpl();
		}
		else {
			return new FrenchSalutationerImpl();
		}
	}
}
