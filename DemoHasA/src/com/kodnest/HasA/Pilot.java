package com.kodnest.HasA;

public class Pilot {
	String name;
	public Pilot(String name) {
		this.name=name;
		
	}
	void fly() {
		System.out.println(name+"is flying the plane");
	}

}
