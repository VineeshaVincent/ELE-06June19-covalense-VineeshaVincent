package com.covalense.javaapp.fstproject;

public class largeof3 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("the greatest value is="+a);
			}
		}
		else if(b>c)
		{
			System.out.println("the greatest value is="+b);
		}
		else
		{
			System.out.println("the greatest value is="+c);
		}
	}
}
