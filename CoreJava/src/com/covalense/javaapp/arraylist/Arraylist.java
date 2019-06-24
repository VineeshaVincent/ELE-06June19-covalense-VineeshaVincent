package com.covalense.javaapp.arraylist;

import java.util.ArrayList;

public class Arraylist {
	
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	
	@SuppressWarnings("rawtypes")
	ArrayList al=new ArrayList();
	
	al.add(15);
	al.add(8.6);
	al.add('d');
	al.add("vipin");
	al.add('v');
	al.add("rithu");
	al.add('d');
	al.add(null);
	for (int i=0;i<al.size();i++)
	{
		Object r=al.get(i);
		System.out.println(r);
	}
}

}
