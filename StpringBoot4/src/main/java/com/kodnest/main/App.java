package com.kodnest.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext
				("Application-context.xml");
		Trainer l=(Trainer) context.getBean("b1");
		System.out.println(l);
		University lr=(University) context.getBean("b2");
		System.out.println(lr);
		context.close();
	}
}
