package QuestionAnswer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class AnotherWayToAddMultipleIntoSingleFile {
	 public static void main(String[] args) throws IOException {
		 
         String file1 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a1.txt";
         String file2 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a2.txt";
         String file3 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a3.txt";
         String file4 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a4.txt";
         String file5 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a5.txt";
         String file6 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a6.txt";
         String file7 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a7.txt";
         String file8 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a8.txt";
         String file9 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a9.txt";
         String file10 ="C:\\Users\\sunilg\\Desktop\\solutionof10Files\\a10.txt";
         
         InputStream fis1 = new FileInputStream(file1);
         InputStream fis2 = new FileInputStream(file2);
         InputStream fis3 = new FileInputStream(file3);
         InputStream fis4 = new FileInputStream(file4);
         InputStream fis5 = new FileInputStream(file5);
         InputStream fis6 = new FileInputStream(file6);
         InputStream fis7 = new FileInputStream(file7);
         InputStream fis8 = new FileInputStream(file8);
         InputStream fis9 = new FileInputStream(file8);
         InputStream fis10 = new FileInputStream(file10);

         //Create vector which will be used to hold multiple inputStreams
         Vector<InputStream> inputStreams = new Vector<>();
         inputStreams.add(fis1);
         inputStreams.add(fis2);
         inputStreams.add(fis3);
         inputStreams.add(fis4);
         inputStreams.add(fis5);
         inputStreams.add(fis6);
         inputStreams.add(fis7);
         inputStreams.add(fis8);
         inputStreams.add(fis9);
         inputStreams.add(fis10);

         //Now add inputStreams.elements() to the Vector,
         //inputStreams.elements() will return Enumerations
         InputStream sis =
          new SequenceInputStream(inputStreams.elements());
          
         System.out.println("Reading data from multiple files using SequenceInputStream");

         int ch;
         while ((ch = sis.read()) != -1) { // read till end of file of both files
                System.out.print((char) ch);
         }

         sis.close(); // closing SequenceInputStream
                                    //will close fis1, fis2 and fis3 as well
  }

}
