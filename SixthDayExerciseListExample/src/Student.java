
public class Student {
	private String name;
	private int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}
