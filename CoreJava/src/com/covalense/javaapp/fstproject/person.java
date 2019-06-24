package com.covalense.javaapp.fstproject;
class personA
{
	String name;
	int height;
	double weight;
	void write()
	{
	
	}
}
public class person {

	public static void main(String[] args) {
		personA p=new personA();
		p.name="manu";
		p.height=180;
		p.weight=65;
		p.write();
		System.out.println("name is"+p.name);
		System.out.println("height is"+p.height);
		System.out.println("weight is"+p.weight);
		
		
	}
}
