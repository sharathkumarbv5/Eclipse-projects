package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext
				("Application-context.xml");
		Employee l=(Employee) context.getBean("t1");
		System.out.println(l);
		//		Employee ls=(Employee) context.getBean("t2");
		//		System.out.println(ls);
		//		Employee lr=(Employee) context.getBean("t3");
		//		System.out.println(lr);
		context.close();

	}

}
