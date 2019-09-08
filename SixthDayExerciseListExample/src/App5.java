import java.util.ArrayList;
import java.util.List;

import shown.Phone;

public class App5 {
	public static void main(String[] args) {
		List<Phone> phone = new ArrayList<>();
		phone.add(new Phone("222", "123456"));
		phone.add(new Phone("333", "445556"));
		
		Person person = new Person(phone, "Shown", 30);
		System.out.println(person);
	}

}
