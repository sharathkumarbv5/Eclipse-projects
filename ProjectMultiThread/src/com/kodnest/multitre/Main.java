package com.kodnest.multitre;

public class Main {
public static void main(String[] args) {
	System.out.println(Thread.currentThread());
Task1 t1=new Task1();
Task2 t2=new Task2();
t1.setName("frist-thread");
t2.setName("second-thread");
t1.setPriority(3);
t2.setPriority(7);
t1.start();
t2.start();
}
}
