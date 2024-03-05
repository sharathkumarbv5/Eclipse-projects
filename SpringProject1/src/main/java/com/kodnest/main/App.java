package com.kodnest.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Student7;

public class App {

	public static  void main(String[] args) {
		ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("Application-context.xml");
Student7 bean=(Student7) context.getBean("s1");
System.out.println(bean);
}

}
