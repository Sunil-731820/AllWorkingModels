package JavaIOInput;

import java.io.IOException;

public class ByteArrayInputStream {
	public static void main(String[] args) throws IOException {  
	    byte[] buf = { 65, 36, 37, 38 }; //array of the data of number  
	    // Create the new byte array input stream  
	    java.io.ByteArrayInputStream byt = new java.io.ByteArrayInputStream(buf);  
	    int k = 0;  
	    while ((k = byt.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = (char) k;  
	      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
	    }  
	  }  

}

// 65 is A 
//  66 is B 
