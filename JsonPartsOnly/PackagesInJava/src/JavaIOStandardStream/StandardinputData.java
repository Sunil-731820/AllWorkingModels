package JavaIOStandardStream;

import java.util.Scanner;

public class StandardinputData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number by keyboard");
		int number = sc.nextInt();
		System.out.println("Enter number by keyoboard is "+ number);
	}

}
