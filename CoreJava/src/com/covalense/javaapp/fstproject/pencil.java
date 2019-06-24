package com.covalense.javaapp.fstproject;
class pencilA
{
	String brand;
	int cost;
	void write()
	{
		System.out.println("I am a write method()method");
	}
}
public class pencil{

	public static void main(String[] args) {
		pencilA p=new pencilA();
		p.cost=5;
		p.brand="apsaerra";
		p.write();
		
		System.out.println("cost is="+p.cost);
		System.out.println("brand is="+p.brand);
		
	}
}
