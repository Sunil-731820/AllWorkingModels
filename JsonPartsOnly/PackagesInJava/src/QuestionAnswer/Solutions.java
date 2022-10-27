package QuestionAnswer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Solutions {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin1= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a1.txt");    
		FileInputStream fin2= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a2.txt");    
		FileInputStream fin3= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a3.txt");    
		FileInputStream fin4= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a4.txt");
		FileInputStream fin5= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a5.txt");
		FileInputStream fin6= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a6.txt");
		FileInputStream fin7= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a7.txt");
		FileInputStream fin8= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a8.txt");
		FileInputStream fin9= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a9.txt");
		FileInputStream fin10= new FileInputStream("C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a10.txt");
		
		//creating Vector object to all the stream    
		Vector v =  new Vector();    
		v.add(fin1);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);
		v.add(fin5);
		v.add(fin6);
		v.add(fin7);
		v.add(fin8);
		v.add(fin9);
		v.add(fin10);
	
		//creating enumeration object by calling the elements method    
		Enumeration e=v.elements();

		//passing the enumeration object in the constructor    
		SequenceInputStream bin=new SequenceInputStream(e); 
	
		int i=0;      
		while((i=bin.read())!=-1){    
		System.out.print((char)i); 
		}     
		bin.close(); 
		fin1.close();    
		fin2.close();
		fin3.close();
		fin4.close();
		fin5.close();
		fin6.close();
		fin7.close();
		fin8.close();
		fin9.close();
		fin10.close();
		 
	}

}
