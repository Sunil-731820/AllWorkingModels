package com.java.jsonTaskAssign;

interface Sayable{  
    public String say();  
}  

public class ImplementationAndNormalAndLambda {
	public static void main(String[] args) {
		 Sayable s=new Sayable() {
			public String say() {  
			        return "Good Morning Sunil........";  
			    }
		};  
		    System.out.println(s.say());  
	}

}
