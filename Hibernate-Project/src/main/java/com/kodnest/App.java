package com.kodnest;
import java.util.ArrayList;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import com.kodnest.entity.Bike;
import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;

//import com.kodnest.entity.Student10;
//import java.util.*;
public class App 
{
//	private static final Product Product = null;

	public static void main(String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		System.out.println(session+"success");
		try {
		Transaction t=session.beginTransaction();

//		Customer customer=new Customer(1,"sharathu",Product);
//		
	Product product=new Product();
	product.setPid(1);
	product.setPname("product-1");
	session.save(product);
	Product product1=new Product();
	product1.setPid(2);
	product1.setPname("product-2");
	session.save(product1);

	ArrayList<Product> al=new ArrayList<Product>();
	al.add(product);
	al.add(product1);
Customer customer=new Customer();
customer.setCid(1);
customer.setCname("sharu");
session.save(customer);
Customer customer1=new Customer();
customer.setCid(2);
customer.setCname("sharath");
session.save(customer1);
ArrayList<Product> al1=new ArrayList<Product>();
//al1.add(customer);
//al1.add(customer1);


	
//		product.setPid(2);
//		session.save(product);
//		session.save(customer);

//		List<Student10> list= session.createQuery("from Student10").list();
//		for(Student10 s:list) {
//			System.out.println(s);
//		}
		
//		Student10 s= session.get(Student10.class,2);
//
////		Student10 s= new Student10(2, "Sharu");
//		System.out.println(s);	
//		System.out.println("////////////////");
//		System.out.println(s.getId()+">>>"+s.getName());
		//		session.save(s);
		//		System.out.println("Added");
		//		Bike b=new Bike("KTM",300000);
		//		session.save(b);
			System.out.println(" added");
		t.commit();
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			session.close();
			factory.close();
		}


	}

}
