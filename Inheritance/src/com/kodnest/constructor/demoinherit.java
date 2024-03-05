package com.kodnest.constructor;
class demoinherit {
	void eat() {
		System.out.println("eating");
	}
}
class DOG extends demoinherit{
	void eat1() {
		System.out.println("eating-1");}
	public static void main(String[] args) {
		DOG d=new DOG();
		d.eat();
		d.eat1();
	}
	}
