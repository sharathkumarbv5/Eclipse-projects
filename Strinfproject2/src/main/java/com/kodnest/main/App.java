package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext
				("Application-conxtt.xml");
		Laptop l=(Laptop) context.getBean("l1");
		System.out.println(l);
		Laptop ls=(Laptop) context.getBean("l2");
		System.out.println(ls);
		context.close();
	}

}
