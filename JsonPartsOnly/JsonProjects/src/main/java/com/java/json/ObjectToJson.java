package com.java.json;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Java Object is converted into json format parts

// 1: creating POJO of the class for the Attributes

class Organisation{
	
//	class Data Members
	private String organisation_name;
	private String description;
	private int Employees;
	
	
//	Creating getter and Setter
	
	public String getOrganisation_name() {
		return organisation_name;
	}
	public void setOrganisation_name(String organisation_name) {
		this.organisation_name = organisation_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEmployees() {
		return Employees;
	}
	public void setEmployees(int employees) {
		Employees = employees;
	}
	
//	To string for printing 
	@Override
	public String toString() {
		return "Organisation [organisation_name=" + organisation_name + ", description=" + description + ", Employees="
				+ Employees + "]";
	}

	
}

public class ObjectToJson {
	
	public static Organisation getObjectData(Organisation org) {
		
//		Inserting the Custom Data to the Objects 
		org.setOrganisation_name("Infinite Computer Solutions");
		org.setDescription("A Big MNC Company");
		org.setEmployees(10000);
	
//		Return this to the organizations
		return org;
	}
	
	public static void display(Organisation org1) {
		String name = org1.getOrganisation_name();
		String name1 = org1.getDescription();
		int number = org1.getEmployees();
		System.out.println(name);
		System.out.println(name1);
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
//		2 : Creating the Object of the Organization
		
		Organisation org = new Organisation();
		
//		3 : Insert the Data into the Object 
		org = getObjectData(org);
		
//		4 : Creating the Object of the ObjectMapper defines in Jackson 
		ObjectMapper obj = new ObjectMapper();
		try {
			String jsonstr = obj.writeValueAsString(org);
			System.out.println(jsonstr);
			
			JSONArray array = new JSONArray();
			array.add(jsonstr);
			
			List<String> list1 = new ArrayList<String>();
			list1.addAll(array);
			System.out.println("the list1 is ");
			System.out.println(list1);
			
			
			System.out.println("the array of the json is ");
			System.out.println(array);
//			5 : Displaying functions is 
//			display(org);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
