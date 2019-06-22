package com.covalense.javaapp.arraylist;
import java.util.ArrayList;
public class Arraysearch {
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			//ArrayList object 
			@SuppressWarnings("rawtypes")
			ArrayList arrList = new ArrayList();

			//adding elements in the list
			arrList.add("100");
			arrList.add("200");
			arrList.add("300");
			arrList.add("400");
			arrList.add("500");

			//searching element "300"
			boolean isFound = arrList.contains("40");
			if(isFound == false)
				System.out.println("Element is not found in the list");
			else
				System.out.println("Element is found in the list");

		}
	}

