import java.io.File;
import javax.xml.bind.*;

public class EmployeeJAXB {
	public void marshall() {
		try {
			Employee emp = new Employee("A001", "rr", "Dhaka", 2000);
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp, System.out);
			ms.marshal(emp, new File("src//Employee.xml"));
		} catch (Exception e) {
			System.out.println(" " + e.getMessage());
		}
	}

	public void unmarshall() {
		try {
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Unmarshaller ums = jc.createUnmarshaller();
			Employee emp = (Employee) ums.unmarshal(new File("src//Employee.xml"));
			System.out.println("Emp id " + emp.getId());
			System.out.println("Emp name " + emp.getName());
			System.out.println("Emp address " + emp.getAddress());
			System.out.println("Emp salary " + emp.getSalary());
		} catch (Exception e) {
			System.out.println(" " + e.getMessage());
		}
	}
}