package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedebleDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		
//		Student st1= new Student(1001, "Raju" , 983900310L);
//		Course c1 = new Course(2001, "Hibernate","10days");
//		st1.setCourse(c1);
//		
//        Student st2= new Student(1002, "manju" , 98882031L);
//		Course c2 = new Course(2002, "SpringBoot","14days");
//		st2.setCourse(c2);
//		
//		session.save(st1);
//		session.save(st2);
//		
//		Transaction transaction = session.beginTransaction();
//		transaction.commit();
//		
		Student s1 =(Student)session.get(Student.class, 1002);
		System.out.println(s1.getStid());
		System.out.println(s1.getStname());
		System.out.println(s1.getStcontsct());
		System.out.println(s1.getCourse());
		
		session.close();
		factory.close();
	}

}
