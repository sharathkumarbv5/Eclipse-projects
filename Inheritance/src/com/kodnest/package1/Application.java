package com.kodnest.package1;

public class Application {
	public static void main(String[] args) {
		Child child =new Child();
		Parent parent =new Parent();
		System.out.println(child.childmoney);
		child.DisplayChild();
		System.out.println(child.parentmoney);
		parent.DisplayParent();
	}
}
