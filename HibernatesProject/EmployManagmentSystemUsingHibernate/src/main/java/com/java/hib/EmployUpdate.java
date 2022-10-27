package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployUpdate {
	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EMploy Number");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter the Employ Name ");
		employ.setName(sc.next());
		System.out.println("Enter the Gender ");
		String gen = sc.next();
		if(gen.toUpperCase().equals("MALE")) {
			employ.setGender(Gender.MALE);
		}
		if(gen.toUpperCase().equals("FEMALE")) {
			employ.setGender(Gender.FEMALE);
		}
		
		System.out.println("Enter the Department here");
		employ.setDept(sc.next());
		System.out.println("Enter the designation");
		employ.setDesig(sc.next());
		System.out.println("Enter the Basic");
		employ.setBasic(sc.nextDouble());
		
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(employ);
		t.commit();
		System.out.println("Employ Data Are Updated SuccessFully");
	}

}
