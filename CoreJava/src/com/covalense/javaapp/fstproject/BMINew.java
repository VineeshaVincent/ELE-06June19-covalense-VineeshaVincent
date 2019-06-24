package com.covalense.javaapp.fstproject;
class bmi1
{
	double height=1.76;
	double weight=50.8;

void calculate()
{
	double res=weight/(height*height);
}
	void write()
	{
	
	}
}


public class BMINew {
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
		bmi1 b=new bmi1();
		b.height=1.76;
		b.weight=50.8;
		b.write();
		double res = 10;
		System.out.println("bmi is"+res);
		result(res);                                                                                                                                                                                                                                        
	}
}


