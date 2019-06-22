package com.covalense.javaapp.arraylist;
import java.util.Scanner;
public class Arraysorting {
		public static void main(String[] args) 
		{
			int n, temp;
			//scanner class object creation
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);

			//input total number of elements to be read
			System.out.print("Enter the elements you want : ");
			n = s.nextInt();

			//integer array object
			int a[] = new int[n];

			//read elements 
			System.out.println("Enter all the elements:");
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
			}

			//sorting elements
			for (int i = 0; i < n; i++) 
			{
				for (int j = i + 1; j < n; j++) 
				{
					if (a[i] > a[j]) 
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
		}
		}
}
