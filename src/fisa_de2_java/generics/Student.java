package fisa_de2_java.generics;

public class Student {

	private Long numeroSecuriteSociale;
	
	private String name;

	public Student(Long numeroSecuriteSociale, String name) {
		super();
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.name = name;
	}
	
	public Long getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	public void setNumeroSecuriteSociale(Long numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
