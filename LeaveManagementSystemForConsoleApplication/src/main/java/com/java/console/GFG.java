package com.java.console;

//Java Program to convert
//Array to List in Java 8

import java.util.*;
import java.util.stream.*;

class GFG {

	// Generic function to convert array to list
	public static <T> List<T> convertArrayToList(T array[])
	{
		// create a list from the Array
		return Arrays.stream(array).collect(
			Collectors.toList());
	}

	public static void main(String args[])
	{
		// Create an Array
		String array[]
			= { "Geeks", "forGeeks", "A computer Portal" };

		// Print the Array
		System.out.println("Array: "
						+ Arrays.toString(array));

		// convert the Array to List
		List<String> list = convertArrayToList(array);

		// Print the List
		System.out.println("List: " + list);
	}
}

