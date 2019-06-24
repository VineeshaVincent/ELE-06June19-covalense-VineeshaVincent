package com.covalense.javaapp.fstproject;

public class BMIfunc {

	static double bmi(double h,double w)
	{
		return w/(h*h);
	}
	static void result(double res)
	{
		if(res<=18.5)
		{
			System.out.println("under weight");
		}
		else if(res>18.5 &&res<=24.5)
		{
			System.out.println("normal");
		}
		else if(res>=25 && res<=29.9)
		{
			System.out.println("overweight");
		}
		else
		{
			System.out.println("obese");
		}
	}
	
	public static void main(String[] args) {
		double r=bmi(1.56,65);
		System.out.println("bmi is"+r);
		result(r);
	}
}
