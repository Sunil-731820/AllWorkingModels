package JavaIO;


import java.io.File;
import java.io.FileReader;

public class BufferedReader {
	 // main driver method
    public static void main(String[] args) throws Exception
    {
 
        // File path is passed as parameter
        File file = new File(
            "C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\JavaIO\\test.txt");
 

 
        // Creating an object of BufferedReader class
       java.io.BufferedReader br = new java.io.BufferedReader(new FileReader(file));
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }

}
