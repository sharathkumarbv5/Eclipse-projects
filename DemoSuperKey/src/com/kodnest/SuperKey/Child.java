package com.kodnest.SuperKey;

public class Child extends Parent {
int a =10;
void display() {
	int a= 30;
	System.out.println(this.a);
	System.out.println(super.a);
	System.out.println(a);
	super.display();

}
}
