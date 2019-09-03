
public class App {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.setAccountNumber("01");
		b1.setAccountHolderName("Mr. Emran");
		b1.setBalance(10000);
		
		System.out.println("Iniatl banlance "+b1);
		
		b1.deposit(2000);
		
		System.out.println("After deposit 2000 "+b1);
		
		b1.withdraw(5000);
		System.out.println("After withdraw 5000 "+b1);
		
		BankAccount b2 = new BankAccount();
		b2.setAccountNumber("02");
		b2.setAccountHolderName("Mr. Hasan");
		b2.setBalance(5000);
		System.out.println(b2);
		
		b1.transfer(2000,b2);
		System.out.println("===============");
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
