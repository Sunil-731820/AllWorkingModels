package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SearchEmployByIdMain {
	public static void main(String[] args) {
		
		SessionFactory sf = new SessionHelper().getSession();
		Session s = sf.openSession();
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter the Employ Number ");
		empno = sc.nextInt();
		Query q = s.createQuery("from Employ where empno=" + empno);
		List<Employ> employList = q.list();
		if(employList.size()==1) {
			Employ employ = employList.get(0);
			System.out.println("The Employ Number is "+ employ.getEmpno());
			System.out.println("The EMploy Name is "+ employ.getName());
			System.out.println("Gender is "+ employ.getGender());
			System.out.println("The Dept is "+ employ.getDept());
			System.out.println("the Employe Desig is "+ employ.getDesig());
			System.out.println("the basic of employe is "+ employ.getBasic());
		}else {
			System.out.println("This Employe does not found with this id ");
		}
	}

}
