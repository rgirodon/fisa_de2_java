package fisa_de2_java.collections;

public class Author implements Comparable<Author> {

	private String firstName;
	
	private String lastName;
	
	private Integer yearOfBirth;
	
	public Author(String firstName, String lastName, Integer yearOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}
	
	@Override
	public int compareTo(Author other) {

		return this.yearOfBirth.compareTo(other.getYearOfBirth());
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", yearOfBirth=" + yearOfBirth + "]";
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

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}
