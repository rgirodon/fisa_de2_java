package fisa_de2_java.generics;

public class Evaluation {

	private Double note;
	
	private Integer coefficient;

	public Evaluation(Double note, Integer coefficient) {
		super();
		this.note = note;
		this.coefficient = coefficient;
	}
	
	@Override
	public String toString() {
		return "Evaluation [note=" + note + ", coefficient=" + coefficient + "]";
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Integer getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
}
