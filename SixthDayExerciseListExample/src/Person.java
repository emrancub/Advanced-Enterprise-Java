import java.util.List;

import shown.Phone;

public class Person {
	private List<Phone> phone;
	private String name;
	private int id;
	public Person(List<Phone> phone, String name, int id) {
		super();
		this.phone = phone;
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [phone=" + phone + ", name=" + name + ", id=" + id + "]";
	}

	

}
