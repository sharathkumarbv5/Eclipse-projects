package com.kn.demostudent;

public class DemoStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Lp Reddy";
		System.out.println(s.name);
		s.id = 25;
		System.out.println(s.id);
		s.age = 23;
		System.out.println(s.age);
		s.eat = "Biriyani";
		System.out.println(s.eat);
		s.salary = 25000.50;
		System.out.println(s.salary);
		s.sleep();
		s.study();
		s.id();
		s.eat();
		s.salary();
	}

}
