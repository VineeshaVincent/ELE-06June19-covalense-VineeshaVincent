package com.covalense.javaapp.fstproject;

public class Fact {

	public static void main(String[] args) {
		
		int res=fact(6);
		System.out.println("result is"+res);
	}
	
	static  int fact(int x)
	{
		if(x==0)
		{
			return 1;
		}
		return x*fact(x-1);
	}
}
	
