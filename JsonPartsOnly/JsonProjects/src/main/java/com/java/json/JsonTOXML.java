package com.java.json;

import org.json.JSONObject;
import org.json.XML;

public class JsonTOXML {
	public static void main(String[] args) {
		String JsonData = "{\r\n"
				+ "	\"firstName\" : \"John\",\r\n"
				+ "	\"lastName\" : \"Kennedy\",}";
		System.out.println("the Json Data is ");
		System.out.println(JsonData);
		
		JSONObject object = new JSONObject(JsonData);
		System.out.println("the Xml Data is ");
		System.out.println(XML.toString(object));
	}

}


//	<firstName>John</firstName>
//  <lastName>Kennedy</lastName>