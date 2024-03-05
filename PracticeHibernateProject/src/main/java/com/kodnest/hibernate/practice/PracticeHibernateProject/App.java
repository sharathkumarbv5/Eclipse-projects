package com.kodnest.hibernate.practice.PracticeHibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.hibernate.practice.PracticeHibernateProject.entity.Practice;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		System.out.println("success");
		Transaction t=session.beginTransaction();
		Practice pt=new Practice();
		session.save(pt);
//		System.out.println(p.getId()+"~=~"+p.getAddress()+"~=~"+p.getName());
		List<Practice> list=session.createQuery("from Practice").getResultList();
		for(Practice p:list) {
			System.out.println(p);
			
		}
		
		
		t.commit();
		session.close();
		factory.close();
	
	}
}
