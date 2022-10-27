package com.java.json;

import org.json.simple.JSONObject;

public class JsonObjectExample {
	public static void main(String[] args) {
		System.out.println("this is the example of the json Object format");
		JSONObject json = new JSONObject();
		json.put("name", "Harish");
		json.put("age", 22);
		json.put("address", "Bangalore");
		System.out.println("the Json is ");
		System.out.println(json);
		
	}

}
