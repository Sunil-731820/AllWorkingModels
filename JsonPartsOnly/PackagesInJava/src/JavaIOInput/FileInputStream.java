package JavaIOInput;

public class FileInputStream {
	public static void main(String args[]){    
        try{    
          java.io.FileInputStream fin=new java.io.FileInputStream("C:\\Users\\sunilg\\Desktop\\FileRelatedParts\\testout.txt");
          int i=fin.read();  
          System.out.print((char)i);    
          int j = fin.read();
          System.out.println((char)j);
          fin.close();    
        }catch(Exception e){
        	System.out.println(e);
        }    
     }    

}
