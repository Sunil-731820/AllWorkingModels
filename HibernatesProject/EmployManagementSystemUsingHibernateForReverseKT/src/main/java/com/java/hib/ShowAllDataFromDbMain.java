package com.java.hib;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ShowAllDataFromDbMain {
	public static void main(String[] args) {
		
		SessionFactory sf = SessionHelper.getSession();
		Session s = sf.openSession();
		
		Query q = s.createQuery("from Employ");
		List<Employ> employList = q.list();
		for(Employ employ : employList) {
			System.out.println("Employ Number is "+ employ.getEmpno());
			System.out.println("Employ Name is "+ employ.getName());
			System.out.println("gender is "+ employ.getGender());
			System.out.println("Employ Dept is "+ employ.getDept());
			System.out.println("Employ Desig is "+ employ.getDesig());
			System.out.println("Employ Basic is "+ employ.getBasic());
			System.out.println("----------------------------------");
		}
		
		
		
	}

}
