package com.kodnest.kkk;

 class Student{
	
int age;
String name;
public Student( int age,String name) {
	this.age=age;
	this.name=name;
	
}
@Override
	public String toString() {
		return "Student{name : "+name+", age : "+age+"}";
	}
	}
	public class Main1{
		public static void main(String[] args) {
			Student student=new Student(25,"Sharu");
			System.out.println(student);
			Student student1=new Student(24,"Sharath");
			System.out.println(student1);
			
		}
}
