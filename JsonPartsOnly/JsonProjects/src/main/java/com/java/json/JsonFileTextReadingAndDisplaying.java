package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileTextReadingAndDisplaying {
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\jsonFile.txt"));
			JSONArray array = (JSONArray) obj;
			int length = array.size();
			LinkedList author = new LinkedList();
			for(int i=0;i<length;i++) {
				JSONObject jsonObject = (JSONObject) array.get(i);
				Set s = jsonObject.entrySet();
				Iterator iter = s.iterator();
				
				HashMap hm = new HashMap();
				while(iter.hasNext()) {
					Map.Entry me = (Entry) iter.next();
					hm.put(me.getKey(), me.getValue());
				}
				
				author.add(hm);
			}
			
			for(int i=0;i<author.size();i++) {
				HashMap hm = (HashMap) author.get(i);
				Set s = hm.entrySet();
				Iterator iter = s.iterator();
				while(iter.hasNext()) {
					Map.Entry me = (Entry) iter.next();
					System.out.println(me.getKey() + " "+me.getValue());
				}
				System.out.println("-------------------------");
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
