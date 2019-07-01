package com.covalense.javaapp.assignmentsone;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("the numbers  divisible by 7 are:");
		for(int i=1;i<=100;i++)
		{
			if(i%7==0)
				System.out.println(i);
		}
	}
}
