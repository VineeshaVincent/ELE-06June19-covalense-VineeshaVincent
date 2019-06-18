package com.covalense.javaapp.assignment1;

public class EvenByFive {

	public static void main(String[] args) {
		System.out.println("the even numbers  divisible by 5are:");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
