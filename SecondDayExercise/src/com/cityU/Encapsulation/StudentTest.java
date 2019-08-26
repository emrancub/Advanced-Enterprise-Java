package com.cityU.Encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student emran = new Student();
		
		emran.setStdId(152392002);
		emran.setStdname("Md. Emran Hasan");
		emran.setCgpa(3.84);
		
		System.out.println(emran);
		
		Student hasan = new Student();
		
		hasan.setStdId(152392003);
		hasan.setStdname("Md. Omar Faruq");
		hasan.setCgpa(3.57);
		
		System.out.println(hasan);
	}

}
