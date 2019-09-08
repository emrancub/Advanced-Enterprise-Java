public class App {
	public static void main(String[] args) {
		EmployeeJAXB jaxb = new EmployeeJAXB();
		System.out.println("marshall started.....");
		jaxb.marshall();
		System.out.println("marshall done.....");
		System.out.println("..............");
		System.out.println("unmarshall started.....");
		jaxb.unmarshall();
		System.out.println("unmarshall done.....");
	}
}