package com.java.pck.MyClass;

import com.java.pck.thirdPackage.HelloTest;

public class Myclass {
	
	public  void hello() {
		System.out.println("I am callinh hello()");
	}
	public static void main(String[] args) {
		System.out.println("this is new created packages ");
		
		
		HelloTest test = new HelloTest();
		test.hi();
	}

}
