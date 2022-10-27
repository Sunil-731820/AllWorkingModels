package com.java.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;

public class JsonFromMap {
	public static void main(String[] args) {
		System.out.println("this is the example of the jsom map example");
		
		Map<String, String> jsonmap = new HashMap<String, String>();
		jsonmap.put("firstName", "Harish");
		jsonmap.put("lastName", "Kumar");
		jsonmap.put("age", "23");
		jsonmap.put("address", "Bangalore");
		System.out.println("the  Map is ");
		System.out.println(jsonmap);
		
		System.out.println("the json is after creation of the map is ");
		JSONObject json1 = new JSONObject(jsonmap);
		System.out.println(json1);
		
	
		
	}

}
