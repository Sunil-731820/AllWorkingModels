package JavaIOOutputStream;
import java.io.*;
public class ByteArrayExample {
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\outputTest3.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\outputTest4.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }  

}
