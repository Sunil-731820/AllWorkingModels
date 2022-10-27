package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class MyJsonComparator implements Comparator<JSONObject>{

	public int compare(JSONObject o1, JSONObject o2) {
	    String v1 = (String) ((JSONObject) o1.get("attributes")).get("COMMERCIALNAME_E");
	    String v3 = (String) ((JSONObject) o2.get("attributes")).get("COMMERCIALNAME_E");
	    return v1.compareTo(v3);
	}
	
}

public class JsonFileSortExample {
	public static void main(String[] args) {
		System.out.println("this is the example of the sorting data of the json");
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject o = (JSONObject) parser.parse(new FileReader("C:\\Users\\sunilg\\Desktop\\sortJsonData.txt"));
			JSONArray array = (JSONArray) o.get("results");
			ArrayList<JSONObject> list1 = new ArrayList<JSONObject>();
			
			for(int i=0;i<array.size();i++) {
				list1.add((JSONObject) array.get(i));
			}
			
			Collections.sort(list1,new MyJsonComparator());
			for (JSONObject jsonObject : list1) {
				System.out.println(((JSONObject)jsonObject.get("attributes")).get("OBJECTID"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
