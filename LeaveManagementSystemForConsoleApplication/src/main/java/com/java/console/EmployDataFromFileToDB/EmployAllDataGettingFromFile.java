package com.java.console.EmployDataFromFileToDB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployAllDataGettingFromFile {
	
	public static List<EmployPOJOFileDataReading1> readDataFromFile() throws IOException, NumberFormatException, ParseException {
		System.out.println("reading data from the file and display it on the console ");

        BufferedReader reader = null;
        BufferedWriter writer = null;
        ArrayList<EmployPOJOFileDataReading1> list1 = new ArrayList<EmployPOJOFileDataReading1>();
        try {
			reader = new BufferedReader(new FileReader("C:\\Users\\sunilg\\Desktop\\Dependency\\DataSaving.txt"));
			String currentLine = reader.readLine();
			int count = 0;
            while(currentLine!=null){
                System.out.println(currentLine);
                String[] currentLineArray= currentLine.split(" ");
                EmployPOJOFileDataReading1 e = new EmployPOJOFileDataReading1(Integer.parseInt(currentLineArray[0]), currentLineArray[1], currentLineArray[2], currentLineArray[3],(Date) new SimpleDateFormat("yyyy-MM-dd").parse(currentLineArray[4]), currentLineArray[5], Integer.parseInt(currentLineArray[6]),  Integer.parseInt(currentLineArray[7]));
                list1.add(e);
                currentLine = reader.readLine();
               count++;
               if(list1.size()==count) {
                	break;
                }
                
            }
            System.out.println("The List Of The Data is ");
            System.out.println(list1);
            Iterator itr = list1.iterator();
            while(itr.hasNext()) {
            	System.out.println(itr.next());
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	}

}
