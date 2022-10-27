package com.java.hib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployShowAll {
	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s =sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> employList = q.list();			
		for(Employ employee : employList) {
			System.out.println("Employ Number : "+ employee.getEmpno());
			System.out.println("Employ Name is : "+ employee.getName());
			System.out.println("Gender is : "+ employee.getGender());
			System.out.println("Department is :"+ employee.getDept());
			System.out.println("Designation is :"+ employee.getDesig());
			System.out.println("The Basic is :"+ employee.getBasic());
			System.out.println("------------------------------------");
		}
	}

}


























//Applying sorting here
//int length = employList.size();
////System.out.println(employList);
////System.out.println(employList.get(0));
//List<String> list1 = new ArrayList<String>();
////list1.add(0, employList.get(0).toString());
////System.out.println(list1);
//int counter = 0;
//for(int i=0;i<length;i++) {
//	list1.add(0,employList.get(i).toString());
//	counter++;
//}
//System.out.println(list1);
//System.out.println("the counter is : "+ counter);
//System.out.println("After sorting the data is ");
//Collections.sort(list1);
//System.out.println(list1);

//Collections.sort(list1, new IdComparator());
