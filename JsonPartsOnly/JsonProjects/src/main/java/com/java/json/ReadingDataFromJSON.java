package com.java.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
//
//class Node{
//	public String type;
//	public String id;
//	public Geometry geometry;
//	public Properties properties;
//	
//	public Node(String type, String id, Geometry geometry, Properties properties) {
//		super();
//		this.type = type;
//		this.id = id;
//		this.geometry = geometry;
//		this.properties = properties;
//	}
//	
//	
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public Geometry getGeometry() {
//		return geometry;
//	}
//	public void setGeometry(Geometry geometry) {
//		this.geometry = geometry;
//	}
//	public Properties getProperties() {
//		return properties;
//	}
//	public void setProperties(Properties properties) {
//		this.properties = properties;
//	}
//	
//	@Override
//	public String toString() {
//		return "Node [type=" + type + ", id=" + id + ", geometry=" + geometry + ", properties=" + properties + "]";
//	}
//	
//}
//
//class Geometry{
//	public String type;
//	public List<Double> coordinates;
//	
//}
//
//class Properties{
//	public String name;
//	
//}
//try {
//	Reader reader = new FileReader("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\NODES.txt");
//	Gson gson  = new Gson();
//	Node[] features = gson.fromJson(reader, Node[].class);
//	System.out.println(features[0]);
//	System.out.println(features[1]);
//	System.out.println(features[2]);
//	System.out.println(features[3]);
////	System.out.println(features.get);
//	
//	Map m1 = new HashMap<>();
////	System.out.println(features);
//	for(int i=0;i<features.length;i++) {
//		System.out.println(features[i]);
//	}
//} catch (FileNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
import com.google.gson.JsonObject;



public class ReadingDataFromJSON {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
//		1 : Parsing the file of json data 
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\NODES.txt"));
//		2 : Typecasting the object into the json Objects formed
		JSONObject jo = (JSONObject) obj;
		
//		Getting the type  and id of the data
		String feature = (String) jo.get("type");
		Long id = (Long) jo.get("id");
		
		System.out.println("The Type is "+ feature);
		System.out.println("The Id is "+ id);
		
		Map geometry = ((Map) jo.get("geometry"));
		Iterator<Map.Entry> itr1 = (Iterator<Entry>) geometry.entrySet();
		while(itr1.hasNext()) {
			Map.Entry pair = itr1.next();
			System.out.println(pair.getKey() + " :" + pair.getValue());
		}
		
//		JSONArray array = (JSONArray) jo.get("properties");
		Map properties = (Map) jo.get("properties");
		Iterator itr2 = (Iterator) properties.entrySet();
		
		while(itr2.hasNext()) {
			Map.Entry pair1 = (Entry) itr2.next();
			System.out.println(pair1.getKey() + " : "+ pair1.getValue());
		}
		
		
		
		
	}

}
