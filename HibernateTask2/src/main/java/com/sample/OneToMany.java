package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//1st question
//		
//		Question q1 = new Question();
//		q1.setQid(301);
//		q1.setQuestion("what is java?");
//		
//		//2nd Question 
//		
//		Question q2 = new Question();
//		q2.setQid(302);
//		q2.setQuestion("what is Hibernate?");
//		
//		Answer a1 = new Answer();
//		a1.setAid(401);
//		a1.setAnswer("Html is front end language");
//		
//		Answer a2 = new Answer();
//		a2.setAid(402);
//		a2.setAnswer("Java is OOps language");
//		
//		Answer a3 = new Answer();
//		a3.setAid(403);
//		a3.setAnswer("Hibernate is orm tool");
//		
//		Answer a4 = new Answer();
//		a4.setAid(404);
//		a4.setAnswer("Java is platform independent");
//		
//		Answer a5 = new Answer();
//		a5.setAid(405);
//		a5.setAnswer("Hibernate is a open source");
//		
//		List<Answer> al1 =  new ArrayList<Answer>();
//		al1.add(a2);
//		al1.add(a4);
//		
//		List<Answer> al2 =  new ArrayList<Answer>();
//		al2.add(a3);
//		al2.add(a5);
//		
//		q1.setAnswer(al1);
//		q2.setAnswer(al2);
//		
//		a2.setQ(q1);
//		a3.setQ(q2);
//		a4.setQ(q1);
//		a5.setQ(q2);
//		
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(a4);
//		session.save(a4);
//		session.save(q1);
//		session.save(q2);
//		
//		transaction.commit();
		
		Question qu1 = (Question)session.get(Question.class, 302);
		System.out.println(qu1.getQuestion());
		
		for(Answer an: qu1.getAnswer()) {
			System.out.println(an.getAnswer());
		}
		
		session.close();
		factory.close();
	}

}
