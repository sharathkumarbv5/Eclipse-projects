package com.kn.constructors;

class Student{
	String name;
	int id;
	String place;
	char gender;
	double marks;
	long contact_number;
	
	public Student(String name,int id,String place,char gender,double marks,long contact_number)
	{
		name = name;
		id = id;
		place = place;
		gender = gender;
		marks = marks;
		contact_number = contact_number;
	}
}

public class DemoConstructorsApp {
	
	public static void main(String[] args) {
		Student s = new Student ("Lp Reddy",54,"Chintamani",'M',56,93536);
		
		Student s1 = new Student ("Reddy",45,"Mumbai",'M',54,9353621);
		
		System.out.println(s.name + " " +s.id + " " +s.place + " " +s.gender + " " +s.marks + " " + s.contact_number);
		System.out.println("******************************************");
		System.out.println(s1.name + " " +s1.id + " " +s1.place + " " +s1.gender + " " +s1.marks + " " + s1.contact_number);
		
	}

}
