package JavaIOOutputStream;

import java.io.*;  
public class OutputStreamExample {
	  public static void main(String[] args) throws IOException {  
	        FileOutputStream file = new FileOutputStream("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\kt1.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);//65 as number here   
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	    }

}
