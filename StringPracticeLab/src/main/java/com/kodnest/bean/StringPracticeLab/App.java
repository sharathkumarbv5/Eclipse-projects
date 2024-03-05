package com.kodnest.bean.StringPracticeLab;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.beans.Practice;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new
				ClassPathXmlApplicationContext("application-context.xml");
Practice bean=(Practice) context.getBean("s1");
System.out.println(bean);
    }
}
