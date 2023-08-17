package com.embedding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("com/embedding/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Java");
		certificate1.setDuration("2 months");
		
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Java");
		certificate2.setDuration("2 months");
		
		Student student1 = new Student();
		student1.setSid(1);
		student1.setName("Ankit");
		student1.setCerti(certificate1);
		
		Student student2 = new Student();
		student2.setSid(2);
		student2.setName("SUbhradeep");
		student2.setCerti(certificate2);
				
		session.save(student1);
		session.save(student2);
		session.getTransaction().commit();
		
		
		session.close();
		factory.close();
		
		
		
	}

}
