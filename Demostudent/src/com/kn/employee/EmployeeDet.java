package com.kn.employee;

public class EmployeeDet {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "LpReddy";
		System.out.println(e.name);
		e.id = 54;
		System.out.println(e.id);
		e.contactnumber = 935362170;
		System.out.println(e.contactnumber);
		e.placeofbirth = "Chintamani";
		System.out.println(e.placeofbirth);
		e.working();
		e.sleeping();
	}

}
