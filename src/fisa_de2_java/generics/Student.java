package fisa_de2_java.generics;

import java.util.ArrayList;

public class Student extends Human {

	private Long numeroSecuriteSociale;

	public Student(Long numeroSecuriteSociale, String firstName, String lastName) {
		super(firstName, lastName);
		this.numeroSecuriteSociale = numeroSecuriteSociale;		
	}
		
	@Override
	public Double computeMean() {
		
		Double result = 0.0;
		
		Integer sumCoefficients = 0;
		
		for (Evaluation currentEvaluation : this.getEvaluations()) {
			
			result += currentEvaluation.getCoefficient() * currentEvaluation.getNote();
			
			sumCoefficients += currentEvaluation.getCoefficient();
		}
		
		return (result / sumCoefficients);
	}

	@Override
	public String toString() {
		return "Student [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + "]";
	}

	public Long getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	public void setNumeroSecuriteSociale(Long numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}
}
