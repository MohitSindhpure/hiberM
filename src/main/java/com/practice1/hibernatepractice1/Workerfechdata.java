package com.practice1.hibernatepractice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Workerfechdata {
public static void main(String[] args) {
	System.out.println("feching data start...");
	
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	
	Worker worker=(Worker) session.get(Worker.class,1);
	System.out.println(worker);
	factory.close();
	
}
}
