package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CurrentFolderJsonDataReading {
	public static void main(String[] args) throws IOException, ParseException {
		System.out.println("this is the example of the current folder Json data Reading");
		
//		1 : Creating the object of the parser class in json
		JSONParser jsonParser = new JSONParser();
//		2 : Creating the reader object so that it can read the data of the json file 
		FileReader reader = new FileReader(".\\jsonDataFolder\\Employee.json");
		
//		3 : parsing the data of the json and displaying the object of the json okay 
		Object object = jsonParser.parse(reader);
		System.out.println(object);
		
		JSONObject empJson = (JSONObject) object;
		String firstName = (String) empJson.get("firstName");
		String lastName = (String) empJson.get("lastName");
		System.out.println("the first Name is :"+ firstName);
		System.out.println("the Last Name is :"+ lastName);
		
		JSONArray array = (JSONArray) empJson.get("address");
		for(int i=0;i<array.size();i++) {
			JSONObject address = (JSONObject) array.get(i);
			
			String streat = (String) address.get("streat");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			
//			displaying the address is 
			System.out.println("Address of the "+ i + " is ----------------");
			System.out.println("Streat is  : - "+ streat);
			System.out.println("City is : - "+ city);
			System.out.println("State is --"+ state);
		}
		
		
		
		
		
	}

}
