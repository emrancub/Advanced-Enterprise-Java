package cityU.PracticeOne;

public class ConditionalLogic {

	public static void main(String[] args) {
		int marks = 75;
		
		if(marks<40) {
			System.out.println("Fail");
		}
		else if(marks>=40 && marks<=44) {
			System.out.println("D Grade");
		}
		else if(marks>=45 && marks<=49) {
			System.out.println("C Grade");
		}
		else if(marks>=50 && marks<=54) {
			System.out.println("C+ Grade");
		}
		else if(marks>=55 && marks<=59) {
			System.out.println("B- Grade");
		}
		else if(marks>=60 && marks<=64) {
			System.out.println("B Grade");
		}
		else if(marks>=65 && marks<=69) {
			System.out.println("B+ Grade");
		}
		else if(marks>=70 && marks<=74) {
			System.out.println("A- Grade");
		}
		else if(marks>=75 && marks<=79) {
			System.out.println("A Grade");
		}
		else if(marks>=80 && marks<=100) {
			System.out.println("A+ Grade");
		}
		else {
			System.out.println("Invalid Number");
		}

	}

}
