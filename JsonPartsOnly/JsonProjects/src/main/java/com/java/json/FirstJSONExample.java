package com.java.json;

import org.json.simple.JSONObject;

public class FirstJSONExample {
	public static void main(String[] args) {
		
		JSONObject jo = new JSONObject();
		jo.put("firstName", "Harish");
		jo.put("lastName", "Gupta");
		jo.put("middleName", "Kumar");
		System.out.println(jo);
		
	}

}
