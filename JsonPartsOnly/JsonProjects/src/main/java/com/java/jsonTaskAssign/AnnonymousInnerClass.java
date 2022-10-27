package com.java.jsonTaskAssign;

//This is the example of the Anonymous Inner class
interface Name{
	String name = "BHAGAT SINGH";
	void getName();
}

//MyClass Implementation class of Name Interface
class MyClass implements Name {

	public void getName() {
		System.out.println("My Name is "+ name);
		
	}
	
}

//Main class 
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		
//		This is the MyClass Implementation class of Name
		MyClass obj = new MyClass();
//		Calling the getName() method of Name Interface
		obj.getName();
	}

}
