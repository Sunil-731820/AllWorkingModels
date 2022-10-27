package com.java.hib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmploySortByIdData {
	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s =sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> employList = q.list();
		System.out.println(employList);
		
//		Applying sorting here
		int length = employList.size();
//		System.out.println(employList);
//		System.out.println(employList.get(0));
//		List<String> list1 = new ArrayList<String>();
		
////		list1.add(0, employList.get(0).toString());
////		System.out.println(list1);
//		
//		System.out.println(list1);
//		System.out.println("the counter is : "+ counter);
//		System.out.println("After sorting the data is ");
//		Collections.sort(list1);
//		System.out.println(list1);
		
		int counter = 0;
//		for(int i=0;i<length;i++) {
//			String[] currentArray = employList.get(i);
//			EmploySort e1 = new EmploySort(currentArray[0], null, null, null, null, i)
//			counter++;
//		}
		
		
		
		
//		System.out.println(listOfEmploy);
//		for(int i=0;i<length;i++) {
//			listOfEmploy.addAll(employList.get(i));
//		}
		
		
	}

}
