package JavaIOStandardStream;

import java.util.Scanner;

public class SysteminExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number here ");
		int number ;
		number = sc.nextInt();
		System.out.println("so number entered by the user is "+ number);
	}

}
