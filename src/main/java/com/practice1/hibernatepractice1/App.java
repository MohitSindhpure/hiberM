package com.practice1.hibernatepractice1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.SourceType;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project Started...." );
    Scanner scanner=new Scanner(System.in);
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        //worker data insert
        boolean flag=true;
        while(flag) {
        	
        	System.out.println("1.Insert Data");
        	System.out.println("2.Exit");
        System.out.println("Enter choice no:-");
        int ch=scanner.nextInt();
        switch (ch) {
		case 1:
			Worker worker=new Worker();
	        System.out.println("enter name :- ");
	        String n=scanner.next();
	        worker.setName(n);
	        System.out.println("enter salary :- ");
	        int s=scanner.nextInt();
	        worker.setSalary(s);
	        System.out.println(worker);
	        
	        Session session=factory.openSession();
	        
	        session.beginTransaction();
	        session.save(worker);
	        
	        session.getTransaction().commit();
	        
	        session.close();
			break;
		case 2:
			flag=false;
			System.out.println("program is eneded....");
			break;
		default:
			System.out.println("Enter valid number..");
			break;
		}
        
        }
    }
}
