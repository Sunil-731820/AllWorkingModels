package com.java.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmploySearch {
	
	public static void main(String[] args) {
		
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employ Number ");
		empno = sc.nextInt();
		Query q = s.createQuery("from Employ where empno="+empno);
		List<Employ> employList = q.list();
		if(employList.size()==1) {
			Employ employ = employList.get(0);
			System.out.println("Employ number is : "+ employ.getEmpno());
			System.out.println("Employ Name is : "+ employ.getName());
			System.out.println("Employ gender is : "+ employ.getGender());
			System.out.println("Employ Department is : "+ employ.getDept());
			System.out.println("Employ designation is : "+ employ.getDesig());
			System.out.println("Employ Basic is :"+ employ.getBasic());
		}else {
			System.out.println("Employ id Does not Exist ");
		}
		
	}

}
