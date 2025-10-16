package com.sample;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MAnyToManyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Developer d1 = new Developer();
//		d1.setDid(101);
//		d1.setDname("Ram");
//		
//		Developer d2 = new Developer();
//		d2.setDid(102);
//		d2.setDname("sam");
//		
//		ArrayList<Developer> dList = new ArrayList<Developer>();
//		dList.add(d1);
//		dList.add(d2);
//		
//		Project p1 = new Project();
//		p1.setPid(201);
//		p1.setPname("E-commerce");
//		
//		Project p2 = new Project();
//		p2.setPid(202);
//		p2.setPname("Banking");
//		
//		Project p3 = new Project();
//		p3.setPid(203);
//		p3.setPname("Website");
//		
//		Project p4 = new Project();
//		p4.setPid(204);
//		p4.setPname("Mobile");
//		
//		ArrayList<Project> pList = new ArrayList<Project>();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(p3);
//		pList.add(p4);
//		
//		
//		d1.setProject(pList);
//		d2.setProject(pList);
//		
//		session.save(d1);
//		session.save(d2);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
//		
//		p1.setDeveloper(dList);
//		p2.setDeveloper(dList);
//		p3.setDeveloper(dList);
//		p4.setDeveloper(dList);
//
//		
//		
//		transaction.commit();
		
		
		//fetch project list for devloper
		
		Developer de1=(Developer)session.get(Developer.class, 102);
		System.out.println(de1.getDname());
		
		for(Project prj : de1.getProject()) {
			System.out.println(prj.getPname());
		}
		System.out.println("_________________------------");
		
		Project pr1 =(Project)session.get(Project.class, 204);
		System.out.println(pr1.getPname());
		
		for(Developer dev : pr1.getDeveloper()) {
			System.out.println(dev.getDname());
		}
		
		factory.close();
		session.close();
	}

}
