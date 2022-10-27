package com.java.jsonTaskAssign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingDataFromFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String line = "";
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\sunilg\\Desktop\\EvenNumber.txt");
			Scanner sc1 = new Scanner(fin);
			while(sc1.hasNext()) {
				line = sc1.nextLine();
					System.out.println(line);
			}
			
			int number = Integer.parseInt(line);
			if(number%2==0) {
				System.out.println("The Number is Even Number");
			}else {
				System.out.println("The Number is Odd Number");
			}
			
			String line1 = "";
			FileInputStream fin1 = new FileInputStream("C:\\Users\\sunilg\\Desktop\\OddNumber.txt");
			Scanner sc11 = new Scanner(fin1);
			while(sc11.hasNext()) {
				line1 = sc11.nextLine();
				System.out.println(line1);
			}
			int number11 = Integer.parseInt(line1);
			if(number11%2==0) {
				System.out.println("Given Number is Even Number");
			}else {
				System.out.println("Given Number is Odd Number");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
