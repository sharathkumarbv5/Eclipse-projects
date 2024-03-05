package com.kodnest.beans;

public class Practice {
	int id;
	String name;
	public Practice() {
		super();
	}
	public Practice(int id, String name) {
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
		return "Practice [id=" + id + ", name=" + name + "]";
	}
	
}
