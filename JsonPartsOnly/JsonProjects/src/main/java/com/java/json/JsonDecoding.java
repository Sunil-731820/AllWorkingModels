package com.java.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecoding {
	public static void main(String[] args) {
		
//		Converting the json data into the String format
		String k = "{\"Full Name\":\"Ritu Sharma\",\"Tution Fees\":\"121212\", \"Roll No.\":\"1180432120\"}";		
		Object file = JSONValue.parse(k);
		
//		jsonObject is used to create the jsonObject into the Json Object
		JSONObject jsonObjectDecode = (JSONObject) file;
		
//		Converting into the java Data type format from json
		String name = (String) jsonObjectDecode.get("Full Name");
		String fees = (String) jsonObjectDecode.get("Tution Fees");
		String rollno = (String) jsonObjectDecode.get("Roll No.");
		
		System.out.println(name + " " + fees + " " + rollno);
		
		List<String> list1 = new ArrayList<String>();
		list1.add(name);
		list1.add(fees);
		list1.add(rollno);
		
		System.out.println("the list 1 is ");
		System.out.println(list1);
		
		
		
	}
}
