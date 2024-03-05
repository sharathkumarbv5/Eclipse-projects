package com.kodnest.hibernate.practice.PracticeHibernateProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Practice {
	@Id
	int id;
	String name;
	String address;
	
	public Practice() {
		super();
	}
	public Practice(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Practice [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
