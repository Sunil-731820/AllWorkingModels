package com.java.jsonTaskAssign;
//this is the Interface of the getMessage()
interface Messageable{  
    Message getMessage(String msg);  
}  

//This is the implementattion class 
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  

// This is the normal class 
public class OtherWay {
	public static void main(String[] args) {
		 Messageable hello = Message::new;  
	        hello.getMessage("Hello Sumanth your Task IS Completed ");  		
		
	}

}
