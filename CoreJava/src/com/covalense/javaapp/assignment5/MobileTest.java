package com.covalense.javaapps.assignment5;

import java.util.ArrayList;
import java.util.Collections;


public class MobileTest {

	
	public static void main(String[] args) {
		MobileByPrice n=new MobileByPrice();
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		
		Mobile m1=new Mobile();
		m1.Mname="galaxy A10";
		m1.brand="samsung";
		m1.price=12000.60;
		
		Mobile m2=new Mobile();
		m2.Mname="7 pro";
		m2.brand="MI";
		m2.price=15600.89;
		
		Mobile m3=new Mobile();
		m3.Mname="6 PLUS";
		m3.brand="oppo";
		m3.price=13500.70;
		

		
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
	
		
	Collections.sort(al,n);
		for(int i=0;i<al.size();i++)
		{
			Mobile m=al.get(i);
			System.out.println("mname is "+m.Mname);
			System.out.println("brand is "+m.brand);
			System.out.println("price is "+m.price);
		}
	}
}
