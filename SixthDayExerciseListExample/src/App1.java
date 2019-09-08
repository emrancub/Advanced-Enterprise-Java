import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("One","Two");
		//System.out.println(list);
		// immutable
		//list.add("Three");
		
		List<String> Alist = new ArrayList<>(list);
		System.out.println(Alist);
		Alist.add(0,"Three");
		System.out.println(Alist);
		System.out.println(Alist.size());
		System.out.println(Alist.contains("Two"));
		
		
	}

}
