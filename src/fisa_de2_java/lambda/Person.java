package fisa_de2_java.lambda;

public class Person {

	String name;
	
	Integer age;
	
	Gender gender;

	public Person(String name, Integer age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
