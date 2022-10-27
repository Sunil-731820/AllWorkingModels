package JavaIO;

public class FileReader {
	 public static void main(String[] args) throws Exception
	    {
	 
	        // Passing the path to the file as a parameter
	        java.io.FileReader fr = new java.io.FileReader("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\JavaIO\\test.txt");
	 
	        // Declaring loop variable
	        int i;
	        // Holds true till there is nothing to read
	        while ((i = fr.read()) != -1)
	 
	            // Print all the content of a file
	            System.out.print((char)i);
	    }

}
