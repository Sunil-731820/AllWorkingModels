package com.java.console;

import java.util.ArrayList;
import java.util.List;

public class ListOfListChecking {
	 public static void main(String[] args) {
	        List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
	        ArrayList<String> list1 = new ArrayList<String>();
	        list1.add("101,\"Sunil\",\"Sunil@gmail.com\",\"72727727\",\"2022-10-10\",\"Infinite\",88,12");
	        list1.add("Mumbai");
	        listOfLists.add(list1);
	        System.out.println("the list1 is ");
	        System.out.println(list1);
	        System.out.println("the list of list is ");
	        System.out.println(listOfLists);
	    }

}
