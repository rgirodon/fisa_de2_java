package fisa_de2_java.generics;

import java.util.ArrayList;

public abstract class Human implements Evaluable {

	private String firstName;
	
	private String lastName;
	
	private ArrayList<Evaluation> evaluations;
	
	public Human(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.evaluations = new ArrayList<Evaluation>();
	}
	
	abstract public Double computeMean();
	
	public void addEvaluation(Evaluation evaluation) {
		
		this.evaluations.add(evaluation);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Evaluation> getEvaluations() {
		return evaluations;
	}
}
