package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ProductArray {

public static void main(String[] args) {
	
	/*ArrayList<Product>al=new ArrayList<Product>();*/
	Set<Product>s=new TreeSet<>();
	Product p=new Product();
	p.name="buiscut";
	p.cost=30;
	p.rating=7.9;
	
	Product p1=new Product();
	p1.name="lays";
	p1.cost=10;
	p1.rating=5.9;
	
	Product p2=new Product();
	p2.name="mixture";
	p2.cost=30;
	p2.rating=8.9;
	
	
	s.add(p);
	s.add(p1);
	s.add(p2);
	
	/*Collections.sort(al)*/;
	for(int i=0;i<s.size();i++)
	{
		Product st=s.get(i);
		System.out.println("name is"+st.name);
		System.out.println("cost is"+st.cost);
		System.out.println("rating is"+st.rating);
		System.out.println("*************************************************");

	/*for (Product product : s) {
		System.out.println("name is"+product.name);
		System.out.println("cost is+"+product.cost);
		System.out.println("rating is"+product.rating);
	}*/
}
}
}
