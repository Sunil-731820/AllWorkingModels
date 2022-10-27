package com.java.json;

import com.google.gson.Gson;

class GfG{
	
	  int gfgId;
	  String username;
	  char gender;
	  
	    public GfG()
	    {
	        this.gfgId = 0;
	        this.username = "";
	        this.gender = ' ';
	    }
	
	
}

public class JsonToObject {
	public static void main(String[] args) {
		
		GfG gfg = null;
		String jsonString;
        jsonString = "{";
        jsonString += "gfgId : 10001,";
        jsonString += "username : 'Jack jon',";
        jsonString += "gender : 'M'";
        jsonString += "}";
		
//		Creating object of the json 
		Gson gson = new Gson();
		gfg = gson.fromJson(jsonString, GfG.class);
		System.out.println("the gfg id is : "+ gfg.gfgId);
		System.out.println("the User Name is  : "+ gfg.username);
		System.out.println("the Gender is : "+gfg.gender);
		
	}

}
