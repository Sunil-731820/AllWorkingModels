package JavaIOOutputStream;

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\Users\\sunilg\\Desktop\\kt22.txt");    
             fout.write(65);  
             fout.write(72);
             fout.write(97);
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
            	System.out.println(e);
            }    
      }    
}  
