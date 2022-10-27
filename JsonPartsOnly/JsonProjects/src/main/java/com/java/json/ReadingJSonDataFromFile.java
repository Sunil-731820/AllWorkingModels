package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJSonDataFromFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		System.out.println("This is the example of the reading the data of json from the file ");
//		1 : Parsing the file of the json Data
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\JSON11.json"));
//		2 : TypeCasting object into the jsonObjects formed
		
		JSONObject jo = (JSONObject) obj;
		
//		3 : Getting first And lastName here
		String firstName = (String) jo.get("firstName");
		String lastName = (String) jo.get("lastName");
		
		System.out.println("the first Name is : "+firstName);
		System.out.println("the lastName is : "+lastName);
		
		long age = (Long) jo.get("age");
		System.out.println("the age of the person is "+age);
		
//		4 : for Getting address 
		Map address = (Map) jo.get("address");
		
//		5 : Iterating the address of the map
		Iterator<Map.Entry> itr = address.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry pair = itr.next();
			System.out.println(pair.getKey() + " : "+ pair.getValue());
		}
		
//		6 : Getting Phone number 
		JSONArray ja = (JSONArray) jo.get("phoneNumber");
		
//		7 : Iterating the Phone Numbers 
		Iterator itr1 = ja.iterator();
		while(itr1.hasNext()) {
            itr = ((Map) itr1.next()).entrySet().iterator();
            while(itr.hasNext()) {
            	Map.Entry pair = itr.next();
            	System.out.println(pair.getKey() + " : "+ pair.getValue());
            }
		}
		
	}

}
