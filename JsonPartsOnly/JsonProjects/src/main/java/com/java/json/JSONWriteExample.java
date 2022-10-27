package com.java.json;

import java.util.LinkedHashMap;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriteExample {
	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jo = new JSONObject();
		
//		Putting data to jsonObject
		jo.put("firstName", "John");
		jo.put("lastName", "Smith");
		jo.put("age", 23);
		
//		for address data first i have to create linkedHashMap()
		
		Map m = new LinkedHashMap(4);
		m.put("StreatAddress", "21 2nd Streat");
		m.put("city","New York");
		m.put("state", "NY");
		m.put("postal Code", 226020);
		
//		Puttiing Map address to json Objects
		
		jo.put("address", m);
		
//		for phone Number first Create JsonArray
		
		JSONArray ja = new JSONArray();
		m.put("type", "home");
		m.put("number", "212 555-1234");
		
//		Adding to the jsonArray list
		ja.add(m);
		
		m = new LinkedHashMap(2);
		m.put("type", "fax");
		m.put("number", "212 555-1234");
		
		ja.add(m);
//		Adding phone Number to json Objects
		jo.put("phoneNumber", ja);
		
//		PrinterWriter pw = type name = new type();
		System.out.println(jo);
		
		PrintWriter pw = new PrintWriter("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\JSON11.json");
		pw.write(jo.toJSONString());
        
        pw.flush();
        pw.close();
		
		
	}

}
