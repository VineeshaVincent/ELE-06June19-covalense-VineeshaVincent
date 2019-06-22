package com.covalense.javaapp.arraylist;

import java.util.ArrayList;

public class Studentforeach {

	
public static void main(String[] args) {
		
		ArrayList<Arraystudent>al=new ArrayList<Arraystudent>();
		
		
		Arraystudent s1=new Arraystudent();
		s1.name="sayu";
		s1.id=1;
		s1.percentage=67.9;
		
		Arraystudent s2=new Arraystudent();
		s2.name="vini";
		s2.id=11;
		s2.percentage=97.9;
		
		Arraystudent s3=new Arraystudent();
		s3.name="vipin";
		s3.id=13;
		s3.percentage=89.9;
		
		Arraystudent s4=new Arraystudent();
		s4.name="ramya";
		s4.id=9;
		s4.percentage=70.9;
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for(Object r:al) {
			System.out.println(r);
		
		
	}
}
}

