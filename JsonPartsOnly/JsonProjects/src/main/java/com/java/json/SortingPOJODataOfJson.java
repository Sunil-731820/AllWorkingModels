package com.java.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Person{
	
	private String age;
	private String name;
	
	
	public Person(String age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
}

public class SortingPOJODataOfJson {
	public static void main(String[] args) {
		
//		JSONObject jo = new JSONObject();
//		jo.put(new Person("22", "Sunil"),null);
		JSONArray array = new JSONArray();
		array.add(new Person("22", "Sunil"));
		array.add(new Person("23", "Harish"));
		
		System.out.println("the json Array  is ");
//		System.out.println(jo);
		System.out.println(array);
		
		JSONObject jo = new JSONObject();
		jo.put("Details", array);
		
		System.out.println("the json Object is ");
		System.out.println(jo);
		
		
	}

}
