package com.java.jsonTaskAssign;

//this is the interface of the Age
interface GetInterface{
	int age = 22;
	void getAge();
}

//This is the implementation class of Myclass1
class Myclass1 implements GetInterface{

	public void getAge() {
		System.out.println("Hello this is the implementation class ");
		System.out.println("My Age is "+ age);
	}
	
}


//This is the normal class 
public class NormalToImplementationClassWithInterFace {
	public static void main(String[] args) {
		Myclass1 obj = new Myclass1();
		obj.getAge();
		
	}

}
