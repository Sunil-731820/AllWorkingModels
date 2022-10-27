package JavaIOStandardStream;
import java.io.*; 
public class HowToCreateFile {
	public static void main(String[] args) {  
		  
        try {  
            File file = new File("C:\\Users\\sunilg\\Desktop\\FileCreate.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  

}
