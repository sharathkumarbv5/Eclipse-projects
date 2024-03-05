package com.kodnest.bean;

public class Student7 {
int id;
String name;
public Student7() {
	super();
}
public Student7(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student7 [id=" + id + ", name=" + name + "]";
}

}
