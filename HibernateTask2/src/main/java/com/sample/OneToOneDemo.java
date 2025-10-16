package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		
//		//person object1
//		
//		Person p1 = new Person();
//		p1.setPid(1001);
//		p1.setPname("Rohith");
//		
//		BloodGorup b1 = new BloodGorup();
//		b1.setBgid(1);
//		b1.setBgName("A+");
//		
//		p1.setBg(b1);
//		
//		//person object2
//		Person p2 = new Person();
//		p2.setPid(1002);
//		p2.setPname("Mohith");
//		
//		BloodGorup b2 = new BloodGorup();
//		b2.setBgid(2);
//		b2.setBgName("A-");
//		
//		p2.setBg(b2);
//		
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(b1);
//		session.save(b2);
//		
//		transaction.commit();
		
		Person per1 =(Person)session.get(Person.class,1001);
		System.out.println(per1.getPid());
		System.out.println(per1.getPname());
		System.out.println(per1.getBg().getBgName());
		
		session.close();
		factory.close();
		
		

	}

}
