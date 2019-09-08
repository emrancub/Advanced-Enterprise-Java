package Hasan;

public class Person {
	private String name;
	private int id;
	private Person spouse;
	
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Person(String name, int id, Person spouse) {
		super();
		this.name = name;
		this.id = id;
		this.spouse = spouse;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", spouse=" + spouse + "]";
	}
	
}
