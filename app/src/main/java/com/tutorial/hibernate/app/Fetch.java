package com.tutorial.hibernate.app;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		get or load data from db
		
		Configuration cfg  = new Configuration();
		cfg.configure("com/tutorial/hibernate/app/hibernate.conf.xml");
		SessionFactory factory  = cfg.buildSessionFactory();
		
		Session session  = factory.openSession();
		
//		get student 
		Student student  = session.get(Student.class, 102);
		System.out.println(student);
		
		
		
		Address ad = session.get(Address.class, 5);
		System.out.println(ad.getImage());
		 ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
		 ByteArrayInputStream inStreambj = new ByteArrayInputStream(ad.getImage());
		 BufferedImage newImage = ImageIO.read(inStreambj);
		 System.out.println(newImage);
		 ImageIO.write(newImage, "png", new File("outputImage.png"));
		
		session.close();
		factory.close();
		
	}

}
