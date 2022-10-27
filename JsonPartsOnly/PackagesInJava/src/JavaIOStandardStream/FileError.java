package JavaIOStandardStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileError {
	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream("savdh");
			System.out.println("File found at that locations ");
		} catch (FileNotFoundException e) {
			System.err.println("file not found at that locations");;
		}
		
	}

}
