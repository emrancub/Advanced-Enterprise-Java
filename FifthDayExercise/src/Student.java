
public class Student {
	private int id;
	private String name;
	private static String University="C University";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", University=" + University + "]";
	}

}
