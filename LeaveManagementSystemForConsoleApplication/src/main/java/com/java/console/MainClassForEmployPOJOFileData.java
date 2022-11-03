package com.java.console;

import java.io.IOException;
import java.text.ParseException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.console.EmployDataFromFileToDB.EmployAllDataGettingFromFile;
import com.java.console.EmployDataFromFileToDB.EmployPOJOFileDataReading1;

public class MainClassForEmployPOJOFileData {
	
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {

		EmployAllDataGettingFromFile fileData = new EmployAllDataGettingFromFile();
		fileData.readDataFromFile();
		
		 List<EmployPOJOFileDataReading1> listOfdata = fileData.readDataFromFile();
		 System.out.println("The List Of The Data is ");
		 System.out.println(listOfdata);
//		 1: Counting  the List of The Data 
		 System.out.println(
				 listOfdata.stream()
				 .count()
				 );
		 
//		 2 : Filter The Data On the Basis Of The First Name 
//		 System.out.println(
//				 listOfdata.stream()
//				 .filter(name -> name.)
//				 );
	}

}
