
public class App {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerId("152392002");
		c.setCustomerName("Emran Hasan");
		
		CustomerView cv = new CustomerView();
		cv.displayCustomer(c);
	}

}
