package com.java.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;

public class JsonArrayFromJsonString {
	public static void main(String[] args) {
		System.out.println("this is the example of the creating jsonArray directly from json ");
		JSONArray array = new JSONArray();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Delhi");
		list1.add("Mumbai");
		list1.add("Bangalore");
		list1.add("Chennai");
		System.out.println("before converting the list is ");
		System.out.println(list1);
		array.add(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("UttarPradesh");
		list2.add("MadhyaPradesh");
		list2.add("Bihar");
		list2.add("Goa");
		
		System.out.println("the list2 is ");
		System.out.println(list2);
		System.out.println("after converting the list into json is ");
		System.out.println(array);
		System.out.println("after converting the list2 into json array is ");
		array.add(list2);
		System.out.println(array);
		
		
		List<String> list3 = new ArrayList<String>();
		Iterator itr = array.iterator();
		while(itr.hasNext()) {
			System.out.println("the first List one by one is ");
			System.out.println(itr.next());
			list3.addAll(array);
		}
		System.out.println("the list3 is ");
		System.out.println(list3);
		
	}

}
