package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployInsert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter the Unique Emp Number ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter the name ");
		employ.setName(sc.next());
		System.out.println("Enter the Gender ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter the Department here ");
		employ.setDept(sc.next());
		System.out.println("Enter the Designation ");
		employ.setDesig(sc.next());
		System.out.println("Enter the Basic");
		employ.setBasic(sc.nextDouble());
		
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employ);
		t.commit();
		System.out.println("EMploy Data Are added SuccessFully");
	}

}
